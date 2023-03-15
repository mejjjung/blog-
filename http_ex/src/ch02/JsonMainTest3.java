package ch02;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class JsonMainTest3 {
	public static void main(String[] args) {
		
		JsonArray jsonArray = new JsonArray();
		// [ ] <---
		// jsonObject
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("name", "티모");
		

		System.out.println(jsonArray);
		System.out.println("------------------");
		System.out.println(jsonObject);
		
		jsonArray.add(jsonObject);
		jsonArray.add(jsonObject);
		jsonArray.add(jsonObject);
		
		System.out.println("-----------------");
		System.out.println(jsonArray);
		
		System.out.println("----------------------");
		
		JsonArray jsonArray1 = new JsonArray();
		JsonObject jsonObject1 = new JsonObject();
		
		JsonArray jsonArray2 = new JsonArray();
		JsonObject jsonObject2 = new JsonObject();
		
		JsonArray jsonArray3 = new JsonArray();
		JsonObject jsonObject3 = new JsonObject();
		
		jsonObject1.addProperty("userId", 1);
		jsonObject1.addProperty("id", 1);
		jsonObject1.addProperty("title", "delectus aut autem");
		jsonObject1.addProperty("completed", false);
		
		jsonObject2.addProperty("userId", 1);
		jsonObject2.addProperty("id", 2);
		jsonObject2.addProperty("title", "quis ut nam facilis et officia qui");
		jsonObject2.addProperty("completed", false);
		
		jsonObject3.addProperty("userId", 1);
		jsonObject3.addProperty("id", 3);
		jsonObject3.addProperty("title", "fugiat veniam minus");
		jsonObject3.addProperty("completed", false);
		
		jsonArray1.add(jsonObject1);
		jsonArray2.add(jsonObject2);
		jsonArray3.add(jsonObject3);

		System.out.println(jsonArray1);
		System.out.println(jsonArray2);
		System.out.println(jsonArray3);
		
		// JsonArray 에서 JsonObject 꺼내는 방법 
		JsonObject targetObject =  jsonArray.get(0).getAsJsonObject();
		System.out.println(targetObject);
		
		String strName = targetObject.get("name").getAsString();
		System.out.println(strName);
		
		System.out.println("======================================");
		
		JsonArray jsonArray4 = new JsonArray();
		
		JsonObject jsonObject4 = new JsonObject();
		jsonObject4.addProperty("name", "홍길동");
		jsonObject4.addProperty("age", 20);
		jsonObject4.addProperty("address", "부산");
		
		JsonObject jsonObject5 = new JsonObject();
		jsonObject5.addProperty("name", "이순신");
		jsonObject5.addProperty("age", 33);
		jsonObject5.addProperty("address", "서울");
		
		JsonObject jsonObject6 = new JsonObject();
		jsonObject6.addProperty("name", "세종대왕");
		jsonObject6.addProperty("age", 59);
		jsonObject6.addProperty("address", "세종시");
		
		jsonArray4.add(jsonObject4);
		jsonArray4.add(jsonObject5);
		jsonArray4.add(jsonObject6);
		
		System.out.println(jsonArray4);
		
		
		System.out.println("===================================");
		JsonObject jsonObject7 = new JsonObject();
		JsonArray jsonArray5 = new JsonArray();
		
		jsonObject7.add("todoList", jsonArray5);
		jsonObject7.addProperty("server_name", "server_1");
		
		JsonObject jsonObject8 = new JsonObject();
		jsonObject8.addProperty("id", 1);
		jsonObject8.addProperty("title", "청소");
		jsonObject8.addProperty("complete", false);
		
		JsonObject jsonObject9 = new JsonObject();
		jsonObject9.addProperty("id", 2);
		jsonObject9.addProperty("title", "영어공부");
		jsonObject9.addProperty("complete", true);
		
		jsonArray5.add(jsonObject8);
		jsonArray5.add(jsonObject9);
		
		System.out.println(jsonObject7);
		
		System.out.println("===================================");
		JsonArray jsonArray6 = new JsonArray();
		
		jsonArray6.add(jsonObject4);
		jsonArray6.add(jsonObject5);
		jsonArray6.add(jsonObject6);
		System.out.println(jsonArray6);
	}
}
