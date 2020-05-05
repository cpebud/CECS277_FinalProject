/*******************************************************************************
 * File Name:		AutoRefill.java	
 * Project:			FinalProject_Patterns
 * Designer(s):		Garrett Cross
 * 
 * Purpose:			
 * Inputs:			
 * Outputs:			
 * 
 * Copyright © 2020 Garrett Cross. All rights reserved.
 ******************************************************************************/
package main.amenities;

import main.rooms.MotelRoom;
import util.Reference;

/**
 * <tt> AutoRefill </tt>
 *
 * @version 0.0.1
 * @since   04/29/20
 */
public class AutoRefill extends MotelRoomDecorator
{   
    private static final int PRICE = Reference.AMENITY_PRICE_AUTOREFILL;
    protected MotelRoom room;
    
    /**
     * Instantiates a new auto refill.
     *
     * @param room the room
     */
    public AutoRefill(MotelRoom room)
    {
        this.room = room;
    }

    /* (non-Javadoc)
     * @see main.MotelRoomDecorator#getDescription()
     */
    @Override
    public String getDescription()
    {
        return room.getDescription() + " with food bar auto-refill";
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
