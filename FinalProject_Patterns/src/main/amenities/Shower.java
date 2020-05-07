/*******************************************************************************
 * File Name:		ResistantShower.java	
 * Project:			FinalProject_Patterns
 * Designer(s):		Garrett Cross
 *                  Chinemerem Anunkor
 * 
 * Purpose:			Represents an amentity for motel room. Adds a 
 *                  spray-resistant shower.		
 * 
 * Copyright © 2020 Garrett Cross & Chinemerem Anunkor. All rights reserved.
 ******************************************************************************/
package main.amenities;

import main.rooms.MotelRoom;
import util.Reference;

/**
 * <tt> ResistantShower </tt>
 *
 * @version 0.0.1
 * @since   04/29/20
 */
public class Shower extends MotelRoomDecorator
{
    private static final int PRICE = Reference.AMENITY_PRICE_SHOWER;
    
    /**
     * Adds amenity to given room.
     *
     * @param room the room
     */
    public Shower(MotelRoom room)
    {
        this.room = room;
    }
    
    /* (non-Javadoc)
     * @see main.MotelRoomDecorator#getDescription()
     */
    @Override
    public String getDescription()
    {
        return room.getDescription() + " with spray-resistant shower";
    }

    /* (non-Javadoc)
     * @see main.MotelRoom#costDaily()
     */
    @Override
    public int costDaily()
    {
        return room.costDaily() + PRICE;
    }
}
