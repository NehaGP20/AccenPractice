package com.clob.tokenauto;

public class Token {
	
	private int tokenNumber = 0;
	private int counterNumber;
	private String serviceType;
	
	
	public Token(String serviceType) {
		tokenNumber = tokenNumber + 1;
		
		if(serviceType.equals("Deposit")) {
			counterNumber = 3;
		}else if(serviceType.equals("Withdraw")) {
			counterNumber = 2;
		}else if(serviceType.equals("Cheque Deposit")) {
			counterNumber = 1;
		}else if(serviceType.equals("Others")) {
			counterNumber = 4;
		}
		//this.serviceType = serv;
	}
	
	public int getTokenNumber() {
		return tokenNumber;
	}

	public int getCounterNumber() {
		return counterNumber;
	}

	public String getServiceType() {
		return serviceType;
	}

}
