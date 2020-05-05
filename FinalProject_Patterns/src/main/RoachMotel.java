/*******************************************************************************
 * File Name:		RoachMotel.java	
 * Project:			FinalProject_Patterns
 * Designer(s):		Garrett Cross
 * 
 * Purpose:			Represents a Roach Motel
 *                  Implements singleton design pattern
 * Inputs:			
 * Outputs:			
 * 
 * Copyright © 2020 Garrett Cross. All rights reserved.
 ******************************************************************************/
package main;

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
    
    public boolean checkIn(RoachColony colony, String room, Iterable<String> amenities)
    {
        if(currentCapacity > 0)
        {
            for(MotelRoom m_room : rooms)
            {
                if(m_room == null)
                {
                    m_room = factory.createRoom(room, amenities);
                    currentCapacity--;
                    System.out.println(colony.getName() + " has checked in.");
                    return true;
                }
            }
        }
        System.out.println("NO VACANCY");
        return false;
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
        return String.format("%s", this.getClass().getSimpleName().toUpperCase());
    }
}
