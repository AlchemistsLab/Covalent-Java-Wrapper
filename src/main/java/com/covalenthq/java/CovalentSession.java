package com.covalenthq.java;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * @author Wisso
 */
public class CovalentSession {

    private final String apiKey;
    private final OkHttpClient client;
    private String format = "";

	private final static String serverUrl = "https://api.covalenthq.com/v1/";

    public CovalentSession(String apiKey) {
        this(apiKey, "json");
    }

    public CovalentSession(String apiKey, String format) {
        this.apiKey = apiKey;
        this.client = new OkHttpClient();
        this.setFormat(format);
    }

    private String getFormat() {
        return format;
    }

    private void setFormat(String format) {
        this.format = format;
    }


    public String query(String requestURL) throws IOException {
        String url = serverUrl + requestURL;
        if (requestURL.endsWith("/")) {
            url += "?key=" + this.apiKey;
        } else {
            url += "&key=" + this.apiKey;
        }
        if (!this.getFormat().equals("")) {
            url += "&format=" + this.getFormat();
        }

        System.out.println(url);
        var request = new Request.Builder()
            .url(url)
            .build();

        try (var response = client.newCall(request).execute()) {
            var responseString = response.body().string();
            System.out.println(responseString);
            return responseString;
        }
    }


}
