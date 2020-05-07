/*******************************************************************************
 * File Name:		Spa.java	
 * Project:			FinalProject_Patterns
 * Designer(s):		Garrett Cross
 *                  Chinemerem Anunkor
 * 
 * Purpose:			Represents an amentity for motel room. Adds a spa.
 * 
 * Copyright © 2020 Garrett Cross & Chinemerem Anunkor. All rights reserved.
 ******************************************************************************/
package main.amenities;

import main.rooms.MotelRoom;
import util.Reference;

/**
 * <tt> Spa </tt>
 *
 * @version 0.0.1
 * @since   04/29/20
 */
public class Spa extends MotelRoomDecorator
{
    private static final int PRICE = Reference.AMENITY_PRICE_SPA;
    protected MotelRoom room;

    /**
     * Adds amenity to given room.
     *
     * @param room the room
     */
    public Spa(MotelRoom room)
    {
        this.room = room;
    }
    
    /* (non-Javadoc)
     * @see main.MotelRoomDecorator#getDescription()
     */
    @Override
    public String getDescription()
    {
        return room.getDescription() + " with spa access";
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
