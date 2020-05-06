/*******************************************************************************
 * File Name:		DeluxeRoom.java	
 * Project:			FinalProject_Patterns
 * Designer(s):		Garrett Cross
 *                  Chinemerem Anunkor
 * 
 * Purpose:			Represents a deluxe roach motel room.
 * 
 * Copyright � 2020 Garrett Cross & Chinemerem Anunkor. All rights reserved.
 ******************************************************************************/
package main.rooms;

import util.Reference;

/**
 * <tt> DeluxeRoom </tt>
 *
 * @version 0.0.1
 * @since   04/29/20
 */
public class DeluxeRoom extends MotelRoom
{
    private static final int PRICE = Reference.ROOM_PRICE_DELUXE;

    /**
     * Instantiates a new deluxe room.
     */
    public DeluxeRoom()
    {
        description = "Deluxe Roach Room";
    }
    
    /* (non-Javadoc)
     * @see main.MotelRoom#cost()
     */
    @Override
    public int costDaily()
    {
        return PRICE;
    }
}
