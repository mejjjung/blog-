package ch01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import com.google.gson.Gson;

public class MainTest1 {

	public static void main(String[] args) {
		// Client ---> Web Server ---> dataBase 
		// Client <--- Web Server <--- dataBase
		// 기본 자바표준 기술인 http 클래스를 이용하여 http 통신을 통해서 
		// 데이터를 요청하고 응답 받아 보는 기술을 확인해 보자. 
		
		// https://jsonplaceholder.typicode.com/todos
		
		// http 통신
		
		// URL 클래스
		// HttpURLConnection 클래스 필요 
		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/todos/1");
			
			HttpURLConnection conn = (HttpURLConnection)url.openConnection(); // URLConnection을 HttpURLConnection로 다운캐스팅 
			conn.setRequestMethod("GET");
			conn.connect();
			
			int statusCode = conn.getResponseCode();
			System.out.println("statusCode  : " + statusCode);
			
//			new InputStreamReader(conn.getInputStream());
//			conn.getInputStream(); // 한 바이트씩 데이터를 읽어 들이는 녀석 
			
			BufferedReader reader = new  BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			
			StringBuffer sb = new StringBuffer();
			String line = null;
			
			// reader.readLine() --> null 만나면 더 이상 읽을 데이터가 없음 
			// null이 아닐 때는 반복을 시킬 수 있다. 
			while( ( line = reader.readLine() ) != null ) {
				sb.append(line + "\n");
			}
			
			// toString => StringBuffer --> String 으로 변환 시켜줌 
			String resultStr = sb.toString();
			System.out.println(resultStr);
			
			// Gson 라이브 가지고 오고 설정 하는 방법
			// gson 대표적인 사용법 및 개념 확인하기 
			Gson gson = new Gson();
			
			Todo todo = new Todo();
			todo.setId(0);
			todo.setUserId(0);
			todo.setTitle("");
			todo.setCompleted(false);
			
			
			
			for(int i = 40; i <58; i++) {
				System.out.print(resultStr.charAt(i));
			}
			
			
			
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
