package com.jtrent238.epicproportions.api;

public @interface API {

	String owner();

	String provides();

	String apiVersion();

	String addonName();
	
	String addonID();
}

