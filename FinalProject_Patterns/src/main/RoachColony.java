/*******************************************************************************
 * File Name:		RoachColony.java	
 * Project:			FinalProject_Patterns
 * Designer(s):		Garrett Cross
 *                  Chinemerem Anunkor
 * 
 * Purpose:			Represents a roach colony.
 * 
 * Copyright © 2020 Garrett Cross & Chinemerem Anunkor. All rights reserved.
 ******************************************************************************/
package main;

import main.amenities.Shower;
import main.rooms.MotelRoom;

/**
 * <tt> RoachColony </tt>
 *
 * @version 0.0.1
 * @since   04/29/20
 */
public class RoachColony
{
    private String name;
    private int population;
    private double growthRate;
    private MotelRoom room;
    
    /**
     * Instantiates a new roach colony.
     */
    public RoachColony()
    {
        this("",0,1.0);
    }
    
    /**
     * Instantiates a new roach colony.
     *
     * @param name the name
     * @param initPopulation the initial population
     * @param growthRate the growth rate
     */
    public RoachColony(String name, int initPopulation, double growthRate)
    {
        this.name = name;
        this.population = initPopulation;
        this.growthRate = growthRate;
    }
    
    public void party()
    {
        population *= growthRate;
        if(room instanceof Shower)
        {
            population += 0.25;
        }
        else
        {
            population *= 0.50;
        }
    }
    
    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Gets the population.
     *
     * @return the population
     */
    public int getPopulation()
    {
        return population;
    }

    /**
     * Gets the growth rate.
     *
     * @return the growthRate
     */
    public double getGrowthRate()
    {
        return growthRate;
    }

    /**
     * Gets the room.
     *
     * @return the room
     */
    public MotelRoom getRoom()
    {
        return room;
    }

    /**
     * Sets the room.
     *
     * @param room the room to set
     */
    public void setRoom(MotelRoom room)
    {
        this.room = room;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString()
    {
        return String.format("%s %s %d %.3f", this.getClass().getSimpleName().toUpperCase(), this.name, this.population, this.growthRate);
    }
}
