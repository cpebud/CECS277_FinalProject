/*******************************************************************************
 * File Name:		MotelRoomDecorator.java	
 * Project:			FinalProject_Patterns
 * Designer(s):		Garrett Cross
 * 
 * Purpose:			Represents a motel amenity
 * Inputs:			
 * Outputs:			
 * 
 * Copyright © 2020 Garrett Cross. All rights reserved.
 ******************************************************************************/
package main.amenities;

import main.rooms.MotelRoom;

/**
 * <tt> MotelRoomDecorator </tt>
 *
 * @version 0.0.1
 * @since   04/29/20
 */
public abstract class MotelRoomDecorator extends MotelRoom
{
    
    /* (non-Javadoc)
     * @see main.MotelRoom#getDescription()
     */
    public abstract String getDescription();
}