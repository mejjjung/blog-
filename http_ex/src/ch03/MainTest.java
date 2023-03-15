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
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import ch01.Todo;

public class MainTest {

	public static void main(String[] args) {
		
		JsonArray jsonArray = new JsonArray();
		JsonObject jsonObject = new JsonObject();
		JsonObject jsonObject1 = new JsonObject();
		
		jsonObject.addProperty("id",1);
		jsonObject.addProperty("name","Leanne Graham");
		jsonObject.addProperty("username","Bret");
		jsonObject.addProperty("email","Sincere@april.biz");
		
		JsonObject jsonObject2 = new JsonObject();
		jsonObject2.addProperty("street", "Kulas Light");
		jsonObject2.addProperty("suite", "Apt. 556");
		jsonObject2.addProperty("city", "Gwenborough");
		jsonObject2.addProperty("zipcode", "92998-3874");
		
		JsonObject jsonObject3 = new JsonObject();
		jsonObject3.addProperty("lat", "-37.3159");
		jsonObject3.addProperty("lng", "81.1496");
		
		jsonObject.add("address",jsonObject2);
		jsonObject2.add("geo", jsonObject3);
		

		jsonObject.addProperty("phone", "1-770-736-8031 x56442");
		jsonObject.addProperty("website", "hildegard.org");
		
		JsonObject jsonObject4 = new JsonObject();
		jsonObject4.addProperty("name", "Romaguera-Crona");
		jsonObject4.addProperty("catchPhrase", "Multi-layered client-server neural-net");
		jsonObject4.addProperty("bs", "harness real-time e-markets");
		
		jsonObject.add("company", jsonObject4);
		
		System.out.println(jsonObject);
		
		
		
		
		
		
	}
}
