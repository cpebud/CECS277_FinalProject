/*******************************************************************************
 * File Name:		RoachMotelTest.java	
 * Project:			FinalProject_Patterns
 * Designer(s):		Garrett Cross
 *                  Chinemerem Anunkor
 * 
 * Purpose:			Tester for Roach Motel
 * Outputs:			Various console outputs for testing verification.
 * 
 * Copyright © 2020 Garrett Cross & Chinemerem Anunkor. All rights reserved.
 ******************************************************************************/
package main;

import main.amenities.*;
import main.rooms.*;

/**
 * <tt> RoachMotelTest </tt>
 *
 * @version 0.0.1
 * @since   04/29/20
 */
public class RoachMotelTest
{
    public static void main(String[] args)
    {
        RoachMotel motel = RoachMotel.getInstance();
        System.out.println(motel);
        
        MotelRoom room = new DeluxeRoom();
        room = new FoodBar(room);
        room = new Spa(room);
        
        System.out.println(room + " " + room.costDaily());
        
        MotelRoomFactory factory = new MotelRoomFactory();
        java.util.HashSet<String> amenities = new java.util.HashSet<>();
        amenities.add("foodbar");
        amenities.add("autorefill");
        amenities.add("shower");
        MotelRoom room1 = factory.createRoom("suite", amenities);
        System.out.println(room1);
        
    }
}
