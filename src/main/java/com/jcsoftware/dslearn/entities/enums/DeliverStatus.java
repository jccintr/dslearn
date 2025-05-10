package com.jcsoftware.dslearn.entities.enums;

public enum DeliverStatus {
   PENDING(1),ACCEPTED(2),REJECTED(3);
	
	private int code;

    private DeliverStatus(int code) {
    	this.code = code;
   }
    
    public int getCode() {
		return code;
	}
    
    public static DeliverStatus valueOf(int code) {

		for (DeliverStatus ds : DeliverStatus.values()) {
			if (ds.getCode() == code) {
				return ds;
			}
		}
		throw new IllegalArgumentException("Invalid Deliver Status code");
	}
    
    
}
