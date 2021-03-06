/*******************************************************************************
 * File Name:		SuiteRoom.java	
 * Project:			FinalProject_Patterns
 * Designer(s):		Garrett Cross
 *                  Chinemerem Anunkor
 * 
 * Purpose:			Represents a roach motel suite.
 * 
 * Copyright � 2020 Garrett Cross & Chinemerem Anunkor. All rights reserved.
 ******************************************************************************/
package main.rooms;

import util.Reference;

/**
 * <tt> SuiteRoom </tt>
 *
 * @version 0.0.1
 * @since   04/29/20
 */
public class SuiteRoom extends MotelRoom
{
    private static final int PRICE = Reference.ROOM_PRICE_SUITE;
    
    /**
     * Instantiates a new suite room.
     */
    public SuiteRoom()
    {
        description = "Roach Suite";
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
