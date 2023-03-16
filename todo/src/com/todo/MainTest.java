package com.todo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.todo.controller.UserController;
import com.todo.dao.UserDAO;
import com.todo.dto.UserDTO;

public class MainTest {

	public static void main(String[] args) {

		JsonArray jsonArray = new JsonArray();
		JsonObject jsonObject = new JsonObject();
		UserController controller = new UserController();

		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/todos");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect();
			int statusCode = conn.getResponseCode();
			System.out.println(statusCode);

			BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

			String line = null;
			StringBuffer sb = new StringBuffer();
			while ((line = reader.readLine()) != null) {
				sb.append(line);
			}

			String result = sb.toString();

			Gson gson = new Gson();
			Type listType = new TypeToken<List<Todo>>() {
			}.getType();

			ArrayList<Todo> todoList = gson.fromJson(result, listType);

			UserDAO dao = new UserDAO();
			UserDTO dto = new UserDTO();
			for (Todo todo : todoList) {
				dao.insert(todo.getUserId(), todo.getId(), todo.getTitle(), todo.isCompleted());
			}
			int Delete = dao.delete(1, 5);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
