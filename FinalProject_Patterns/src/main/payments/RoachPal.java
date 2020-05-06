/*******************************************************************************
 * File Name:		RoachPal.java	
 * Project:			FinalProject_Patterns
 * Designer(s):		Garrett Cross
 *                  Chinemerem Anunkor
 * 
 * Purpose:			Represents a PayPal type account.
 * 
 * Copyright © 2020 Garrett Cross & Chinemerem Anunkor. All rights reserved.
 ******************************************************************************/
package main.payments;

/**
 * <tt> RoachPal </tt>
 *
 * @version 0.0.1
 * @since   05/04/20
 */
public class RoachPal implements Payment
{
    private String name;
    private String email;
    
    /**
     * Instantiates a new roach pal.
     *
     * @param name the name
     * @param email the email
     */
    public RoachPal(String name, String email)
    {
        this.name = name;
        this.email = email;
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
     * Gets the email.
     *
     * @return the email
     */
    public String getEmail()
    {
        return email;
    }
  
    /* (non-Javadoc)
     * @see main.Payment#pay(double)
     */
    @Override
    public void pay(double amount)
    {
        System.out.println("$" + amount + "Paid with RoachPal.");
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString()
    {
        return String.format("%s %s %s", this.getClass().getSimpleName().toUpperCase(), name, email);
    }
}
