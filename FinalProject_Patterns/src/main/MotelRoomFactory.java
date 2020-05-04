/*******************************************************************************
 * File Name:		MotelRoomFactory.java	
 * Project:			FinalProject_Patterns
 * Designer(s):		Garrett Cross
 * 
 * Purpose:			
 * Inputs:			
 * Outputs:			
 * 
 * Copyright © 2020 Garrett Cross. All rights reserved.
 ******************************************************************************/
package main;

import main.amenities.*;
import main.rooms.*;

/**
 * <tt> MotelRoomFactory </tt>
 *
 * @version 0.0.1
 * @since   04/30/20
 */
public class MotelRoomFactory
{
    
    /**
     * Creates a new MotelRoom object.
     *
     * @param type the type
     * @param amenities the amenities
     * @return the motel room
     */
    public MotelRoom createRoom(String type, Iterable<String> amenities)
    {
        MotelRoom room = null;
        if(type.equals("regular"))
        {
            room = new RegularRoom();
        }
        else if(type.equals("deluxe"))
        {
            room = new DeluxeRoom();
        }
        else if(type.equals("suite"))
        {
            room = new SuiteRoom();
        }
        else
        {
            // throw exception
        }
        
        for(String amenity : amenities)
        {
            room = addAmenity(room, amenity);
        }
        
        return room;
    }
    
    /**
     * Adds the amenity.
     *
     * @param room the room
     * @param amenity the amenity
     * @return the motel room
     */
    private MotelRoom addAmenity(MotelRoom room, String amenity)
    {
        if(amenity.equals("foodbar"))
        {
            room = new FoodBar(room);
        }
        else if(amenity.equals("spa"))
        {
            room = new Spa(room);
        }
        else if(amenity.equals("shower"))
        {
            room = new Shower(room);
        }
        else if(amenity.equals("autorefill"))
        {
            room = new AutoRefill(room);
        }
        else
        {
            // throw exception
        }
        return room;
    }
}
