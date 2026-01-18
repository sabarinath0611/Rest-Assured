package com.HTTPmethods;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class Patch_Method {
	@Test
	public void patchMethod() {
		
		given().baseUri("https://jsonplaceholder.typicode.com/posts/1").contentType("application/json").body("{\r\n"
				+ "  \"userId\": 1,\r\n"
				+ "  \"id\": 3,\r\n"
				+ "  \"title\": \"Testing-Manual and Automation\",\r\n"
				+ "  \"body\": \"quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto\"\r\n"
				+ "}").when().patch().then().statusCode(200).log().all();
		
		
		
	}

}
