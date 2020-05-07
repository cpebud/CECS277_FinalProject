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
import main.payments.*;
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
        
        System.out.println(room + " $" + room.costDaily());
        
        MotelRoomFactory factory = new MotelRoomFactory();
        java.util.HashSet<String> am1 = new java.util.HashSet<>();
        am1.add("foodbar");
        am1.add("autorefill");
        am1.add("shower");
        MotelRoom room1 = factory.createRoom("suite", am1);
        System.out.println(room1);
        
        RoachColony rc1 = new RoachColony("Roachy", 100, 1.1);
        System.out.println(rc1);
        MotelRoom room2 = motel.checkIn(rc1, "deluxe", am1);
        System.out.println(motel);
        motel.checkOut(room2, 3, new RoachPal("Roachy", "roachy@roachmail.com"));
        System.out.println(motel);
        
        RoachColony rc2 = new RoachColony("Mr Roach", 200, 1.2);
        java.util.HashSet<String> am2 = new java.util.HashSet<>();
        am2.add("spa");
        //am2.add("shower");
        MotelRoom room3 = motel.checkIn(rc2, "regular", am2);
        System.out.println(rc2);
        System.out.println(room3);
        rc2.party();
        System.out.println(rc2);
        
        motel.checkIn(new RoachColony("roaches1", 200, 1.6), "regular", am2);
        System.out.println(motel);
        motel.checkIn(new RoachColony("roaches2", 200, 1.6), "regular", am2);
        System.out.println(motel);
        motel.checkIn(new RoachColony("roaches3", 200, 1.6), "regular", am2);
        
        motel.checkOut(room3, 10, new MasterRoach("Ms Roachy", "12344321456784321", "123", "12/1/2021"));
        System.out.println(motel);
    }
}
