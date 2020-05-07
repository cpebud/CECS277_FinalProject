/*******************************************************************************
 * File Name:		MotelRoomDecorator.java	
 * Project:			FinalProject_Patterns
 * Designer(s):		Garrett Cross
 *                  Chinemerem Anunkor
 * 
 * Purpose:			Represents a motel amenity.
 *                  Implements decorator design pattern.
 * 
 * Copyright © 2020 Garrett Cross & Chinemerem Anunkor. All rights reserved.
 ******************************************************************************/
package main.amenities;

import main.RoachColony;
import main.rooms.MotelRoom;

/**
 * <tt> MotelRoomDecorator </tt>
 *
 * @version 0.0.1
 * @since   04/29/20
 */
public abstract class MotelRoomDecorator extends MotelRoom
{
    protected MotelRoom room;
    
    /* (non-Javadoc)
     * @see main.MotelRoom#getDescription()
     */
    public abstract String getDescription();
    
    /* (non-Javadoc)
     * @see main.rooms.MotelRoom#party(main.RoachColony)
     */
    @Override
    public void party(RoachColony colony)
    {
        if(room != null)
        {
            room.party(colony);
        }
    }
}
