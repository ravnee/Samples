package com.netapp.vadp.services;

import java.io.InputStream;

public class ReadFileToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String retVal = null;
		InputStream in = ReadFileToString.class.getResourceAsStream("/test.json");				
		retVal = convertStreamToString(in);
		System.out.println("Returning File data as \n"+retVal);
	}
	static String convertStreamToString(java.io.InputStream is) {
	    @SuppressWarnings("resource")
		java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
	    return s.hasNext() ? s.next() : "";
	}

}
