package com.covalenthq.java;

import java.io.IOException;
import java.util.Date;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * @author Wisso
 *
 */
public class CovalentSession {
	private String apiKey;
	private OkHttpClient client;
	private String format="";
	private String fromDate="";
	private String toDate="";
	private int pageSize;
	private int pageNumber;
	private boolean pricesAscending;
	
	private static String serverUrl="https://api.covalenthq.com/v1/";
	
	public CovalentSession(String apiKey) {
		this.apiKey=apiKey;
		this.client=new OkHttpClient();
		this.setFormat("json");
	}
	
	public CovalentSession(String apiKey,String format) {
		this.apiKey=apiKey;
		this.client=new OkHttpClient();
		this.setFormat(format);
	}
	public String getKey() {
		return this.apiKey;
	}
	public void setKey(String apiKey) {
		this.apiKey=apiKey;
	}
	private boolean isPricesAscending() {
		return pricesAscending;
	}

	private void setPricesAscending(boolean pricesAscending) {
		this.pricesAscending = pricesAscending;
	}

	private int getPageNumber() {
		return pageNumber;
	}

	private void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	private int getPageSize() {
		return pageSize;
	}

	private void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	private String getToDate() {
		return toDate;
	}

	private void setToDate(String toDate) {
		this.toDate = toDate;
	}

	private String getFromDate() {
		return fromDate;
	}

	private void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	private String getFormat() {
		return format;
	}

	private void setFormat(String format) {
		this.format = format;
	}
	
	
	public String query(String requestURL) throws IOException {
		String url=serverUrl+requestURL;
		if(requestURL.substring(requestURL.length()-1).equals("/")) {
			url+="?key="+this.apiKey;
		}
		else {
			url+="&key="+this.apiKey;
		}
		if(this.getFormat()!="") {
			url+="&format="+this.getFormat();
		}
		if(this.getFromDate()!="") {
			url+="&from="+this.getFromDate();
		}
		if(this.getToDate()!="") {
			url+="&to="+this.getToDate();
		}
		if(this.isPricesAscending()) {
			url+="&prices-at-asc=true";
		}
		if(this.getPageSize()>0) {
			url+="&page-size="+this.getPageSize();
		}
		if(this.getPageNumber()>0) {
			url+="&page-number="+this.getPageNumber();
		}
		
		System.out.println(url);
		Request request = new Request.Builder()
			      .url(url)
			      .build();

			  try (Response response = client.newCall(request).execute()) {
				  String responseString=response.body().string();
				  System.out.println(responseString);
				  return responseString;
			  }
	}

	
	
}
