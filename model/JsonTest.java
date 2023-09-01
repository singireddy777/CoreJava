package com.example.helloworld.model;
 

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class JsonTest {
    public static void main(String[] args) {
        String file_path = "./src/PRPayload.json";
        
        try {
            // Read JSON file
            BufferedReader reader = new BufferedReader(new FileReader(file_path));
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
            }
            reader.close();
            
            // Get JSON payload
            String jsonPayload = stringBuilder.toString();
            
            System.out.println(jsonPayload);
            
            // Set URL and request method
            URL url = new URL("http://example.com/endpoint");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            
            // Set request headers
            connection.setRequestProperty("Content-Type", "application/json");
            
            // Enable output and write JSON payload
            connection.setDoOutput(true);
            OutputStream outputStream = connection.getOutputStream();
            outputStream.write(jsonPayload.getBytes());
            outputStream.flush();
            outputStream.close();
            
            // Get response
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                System.out.println("HTTP POST request successful.");
            } else {
                System.out.println("HTTP POST request failed with status code: " + responseCode);
            }
            
            // Close the connection
            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void backup() {
    	
		
//		String file_path = "./src/PRPayload.json";
//		BufferedReader reader = new BufferedReader(new FileReader(file_path));
//		StringBuilder stringBuilder = new StringBuilder();
//		String line;
//		while ((line = reader.readLine()) != null) {
//			stringBuilder.append(line);
//		}
//		reader.close();
		//String jsonPayload = stringBuilder.toString();
    }
}
