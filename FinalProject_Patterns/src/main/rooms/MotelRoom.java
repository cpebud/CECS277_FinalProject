/*******************************************************************************
 * File Name:		MotelRoom.java	
 * Project:			FinalProject_Patterns
 * Designer(s):		Garrett Cross
 *                  Chinemerem Anunkor
 * 
 * Purpose:			Represents a room within a roach motel.
 * Inputs:			
 * Outputs:			
 * 
 * Copyright © 2020 Garrett Cross & Chinemerem Anunkor. All rights reserved.
 ******************************************************************************/
package main.rooms;

/**
 * <tt> MotelRoom </tt>
 *
 * @version 0.0.1
 * @since   04/29/20
 */
public abstract class MotelRoom
{
    protected String description;
    
    /**
     * Gets the description.
     *
     * @return the description
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * Daily cost.
     *
     * @return the daily cost
     */
    public abstract int costDaily();
    
    /**
     * Total cost.
     *
     * @param numDays the number of days
     * @return the total cost
     */
    public int costTotal(int numDays)
    {
        return costDaily() * numDays;
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString()
    {
        return String.format("%s %s", "MOTELROOM", this.getDescription());
    }
}
