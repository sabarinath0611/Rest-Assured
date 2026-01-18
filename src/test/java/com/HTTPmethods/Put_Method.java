package com.HTTPmethods;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class Put_Method {
	
	@Test
	public void putMethod() {
		
		given().baseUri("https://jsonplaceholder.typicode.com/posts/1").contentType("application/json").body("{\r\n"
				+ "  \"userId\": 106,\r\n"
				+ "  \"id\": 6,\r\n"
				+ "  \"title\": \"The Empty Chair\",\r\n"
				+ "  \"body\": \"Absence can be louder than presence\"\r\n"
				+ "}").when().patch().then().statusCode(200).log().all();
	}

}
