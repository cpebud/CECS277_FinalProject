/*******************************************************************************
 * File Name:		RoachMotel.java	
 * Project:			FinalProject_Patterns
 * Designer(s):		Garrett Cross
 *                  Chinemerem Anunkor
 * 
 * Purpose:			Represents a Roach Motel.
 *                  Implements singleton design pattern.
 * 
 * Copyright © 2020 Garrett Cross & Chinemerem Anunkor. All rights reserved.
 ******************************************************************************/
package main;

import main.payments.Payment;
import main.rooms.MotelRoom;
import util.Reference;

/**
 * <tt> RoachMotel </tt>
 *
 * @version 0.0.1
 * @since   04/29/20
 */
public class RoachMotel
{
    private static final int MAX_ROOMS = Reference.MOTEL_MAXROOMS;
    private static RoachMotel instance;
    
    private int currentCapacity = MAX_ROOMS;
    private MotelRoom[] rooms = new MotelRoom[MAX_ROOMS];
    private MotelRoomFactory factory = new MotelRoomFactory();
    

    /**
     * Instantiates a new roach motel.
     */
    private RoachMotel() {}
    
    /**
     * Check in.
     *
     * @param colony the colony
     * @param roomType the room type
     * @param amenities the amenities
     * @return the motel room
     */
    public MotelRoom checkIn(RoachColony colony, String roomType, Iterable<String> amenities)
    {
        if(currentCapacity > 0)
        {
            for(MotelRoom room : rooms) 
            {
                if(room == null)
                {
                    room = factory.createRoom(roomType, amenities);
                    colony.setRoom(room);
                    currentCapacity--;
                    System.out.println(colony.getName() + " has checked in.");
                    return room;
                }
            }
        }
        System.out.println("NO VACANCY");
        return null;
    }
    
    /**
     * Check out.
     *
     * @param room the room
     * @param numDays the number of days
     * @param payment the payment
     * @return the double
     */
    public double checkOut(MotelRoom room, int numDays, Payment payment)
    {
        double cost = room.costTotal(numDays);
        
        for(MotelRoom m_room : rooms)
        {
            if(m_room.equals(room))
            {
                payment.pay(cost);
                m_room = null;
                currentCapacity++;
                return cost;
            }
        }
        return 0;
    }
    
    /**
     * Gets the single instance of RoachMotel.
     *
     * @return single instance of RoachMotel
     */
    public static RoachMotel getInstance()
    {
        if(instance == null)
        {
            instance = new RoachMotel();
        }
        return instance;
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString()
    {
        String availRooms = "[ ";
        for(int i = 0; i < MAX_ROOMS; i++)
        {
            if(rooms[i] == null)
            {
                int roomNum = 100 + i;
                availRooms += roomNum + " ";
            }
        }
        availRooms += "]";
        return String.format("%s %s", this.getClass().getSimpleName().toUpperCase(), availRooms);
    }
}
