package ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

public class MainTest3 {

	public static void main(String[] args) {
		
		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/users/1");
			try {
				HttpURLConnection conn = (HttpURLConnection)url.openConnection();
				conn.setRequestMethod("GET");
				conn.connect();
				int statusCode = conn.getResponseCode();
				System.out.println(statusCode);
				
				if(statusCode == 200) {
					BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
					
					String line = null;
					StringBuffer sb = new StringBuffer();
					while( (line = reader.readLine()) != null ) {
						sb.append(line);
					}
					String result = sb.toString();
					Gson gson = new Gson();
					User user = gson.fromJson(result, User.class);
					System.out.println(result);
					
					
					
					
				}
				
				
				
				
		
				
				
				

				
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		

	}

}
