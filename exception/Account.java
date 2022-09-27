package com.uttara.exception;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Account {
	BigDecimal balance = new BigDecimal("0.0") ;
//	BigDecimal balance = new BigDecimal("1000.03");
	String owner;
	
	public void debit(BigDecimal amount)
	{
		if(amount.compareTo(BigDecimal.ZERO) == 0)
//		if(amount.compareTo(new BigDecimal("0.00")) == 0)
			throw new IllegalArgumentException("We cannot debit negative values");
		else
			balance =  balance.add(amount);
//		System.out.println(balance);
		
	}
	
	public void credit(BigDecimal amount)
	{
		if(amount.compareTo(balance) == 1 )
			throw new IllegalArgumentException("not enough amount");
		else
			balance = balance.subtract(amount);
	}
	
	public BigDecimal checkBalance()
	{
		return balance;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account();
		a.debit(new BigDecimal(10.330));
		BigDecimal result = a.checkBalance();
		System.out.println(result.setScale(2,RoundingMode.HALF_UP));
		a.credit(new BigDecimal(1));
		BigDecimal resultsubtract = a.checkBalance();
		System.out.println(resultsubtract.setScale(2,RoundingMode.HALF_UP));
	}

}
