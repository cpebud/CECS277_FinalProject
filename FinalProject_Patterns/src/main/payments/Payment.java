/*******************************************************************************
 * File Name:		Payment.java	
 * Project:			FinalProject_Patterns
 * Designer(s):		Garrett Cross
 *                  Chinemerem Anunkor
 * 
 * Purpose:			Represents a payment type.
 *                  Implements strategy design pattern.
 * 
 * Copyright © 2020 Garrett Cross & Chinemerem Anunkor. All rights reserved.
 ******************************************************************************/
package main.payments;

/**
 * <tt> Payment </tt>
 *
 * @version 0.0.1
 * @since   05/04/20
 */
public interface Payment
{   
    /**
     * Pay.
     *
     * @param amount the amount
     */
    public void pay(double amount);
}
