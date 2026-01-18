package com.HTTPmethods;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;

import org.json.JSONObject;
import org.testng.annotations.Test;

public class Post_Method {
@Test	
public void postMethod() {
	
	JSONObject jsonObject = new JSONObject();
	jsonObject.put("name", "Sabarinath K");
	jsonObject.put("email", "sabarinath0611@gmail.com");
	jsonObject.put("city", "erode");
	jsonObject.put("mobile no", "987654321");
	jsonObject.put("pincode", "638009");
	
	
	
	
//	given().baseUri("https://jsonplaceholder.typicode.com/posts").
//	contentType("application/json").body(jsonObject.toString())
//	.when().post().then().statusCode(201).log().all();
	
	File file = new File("JsonData.json");
	
	given().baseUri("https://jsonplaceholder.typicode.com/posts").
	contentType("application/json").body(file)
	.when().post().then().statusCode(201).log().all();
	
}

}
