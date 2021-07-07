package com.covalenthq.java;

public  class StringUtil {

	//a more dynamic way to concatenate url parameters 
	public static String ConcatUrlParams(String url, String[] params, Object[] paramValues) {
		if(params.length != paramValues.length) return url;
		for(int i=0; i< params.length; i++) {
			String separator= i==0? "?": "&";
			url+= separator+params[i]+"="+paramValues[i];
		}
		return url;
	}
	
	 
}
