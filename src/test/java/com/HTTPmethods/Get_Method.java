package com.HTTPmethods;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class Get_Method {
	@Test
	public void getMethod() {
		
		given().baseUri("https://jsonplaceholder.typicode.com/posts").
		when().
		get().
		then().
		statusCode(200).
	    statusLine("HTTP/1.1 200 OK").
	    log().all();
	    
		
		
	}

}
