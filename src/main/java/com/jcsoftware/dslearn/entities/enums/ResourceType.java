package com.jcsoftware.dslearn.entities.enums;



public enum ResourceType {
	lESSON_ONLY(1), LESSON_TASK(2), FORUM(3), EXTERNAL_LINK(4);
	
	private int code;
	
	private ResourceType(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static ResourceType valueOf(int code) {

		for (ResourceType rt : ResourceType.values()) {
			if (rt.getCode() == code) {
				return rt;
			}
		}
		throw new IllegalArgumentException("Invalid Order Status code");
	}
}
