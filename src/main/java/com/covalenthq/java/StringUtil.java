package com.covalenthq.java;

public  class StringUtil {

	//a more dynamic way to concatenate url parameters 
	public static String ConcatUrlParams(String url, String[] params, Object[] paramValues) {
		if(params.length != paramValues.length) return url;
		var urlBuilder = new StringBuilder(url);
		for(var i=0; i< params.length; i++) {
			String separator= i==0? "?": "&";
			urlBuilder.append(separator).append(params[i]).append("=").append(paramValues[i]);
		}
		url = urlBuilder.toString();
		return url;
	}
	
	 
}
