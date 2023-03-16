package com.albums;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.albums.controller.UserController;
import com.albums.dao.UserDAO;
import com.albums.dto.UserDTO;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

public class MainTest {
	
	public static void main(String[] args) {

		JsonArray jsonArray = new JsonArray();
		JsonObject jsonObject = new JsonObject();

		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/albums");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect();
			int statusCode = conn.getResponseCode();

			BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

			String line = null;
			StringBuffer sb = new StringBuffer();
			while ((line = reader.readLine()) != null) {
				sb.append(line);
			}

			String result = sb.toString();

			Gson gson = new Gson();
			Type listType = new TypeToken<List<User>>() {}.getType();

			ArrayList<User> todoList = gson.fromJson(result, listType);
//			for (User user : todoList) {
//				System.out.println(user);
//			}

			
			UserDAO dao = new UserDAO();
			for (User user : todoList) {
				dao.insert(user.getUserId(),user.getId(),user.getTitle());
				System.out.println(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
