/*******************************************************************************
 * File Name:		MasterRoach.java	
 * Project:			FinalProject_Patterns
 * Designer(s):		Garrett Cross
 *                  Chinemerem Anunkor
 * 
 * Purpose:			Represents a credit card.	
 * 
 * Copyright © 2020 Garrett Cross & Chinemerem Anunkor. All rights reserved.
 ******************************************************************************/
package main.payments;

/**
 * <tt> MasterRoach </tt>
 *
 * @version 0.0.1
 * @since   05/04/20
 */
public class MasterRoach implements Payment
{
    private String name;
    private int cardNumber;
    private int CVV;
    private String DOE;
    
    /**
     * Instantiates a new master roach.
     *
     * @param name the name
     * @param cardNumber the card number
     * @param CVV the security code
     * @param DOE the date of expiration
     */
    public MasterRoach(String name, int cardNumber, int CVV, String DOE)
    {
        this.name = name;
        this.cardNumber = cardNumber;
        this.CVV = CVV;
        this.DOE = DOE;
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
     * Gets the card number.
     *
     * @return the cardNumber
     */
    public int getCardNumber()
    {
        return cardNumber;
    }

    /**
     * Gets the CVV.
     *
     * @return the CVV
     */
    public int getCVV()
    {
        return CVV;
    }

    /**
     * Gets the DOE.
     *
     * @return the DOE
     */
    public String getDOE()
    {
        return DOE;
    }

    /* (non-Javadoc)
     * @see main.Payment#pay(double)
     */
    @Override
    public void pay(double amount)
    {
        System.out.println("$" + amount + " Paid with MasterRoach credit card.");
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString()
    {
        return String.format("%s %s %d %d %s", this.getClass().getSimpleName().toUpperCase(), name, cardNumber, CVV, DOE);
    }
}
