package com.common;

import java.util.UUID;

public class Random {

	public static String randomUuid(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
}
