package com.HTTPmethods;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class Delete_Method {
	@Test
	public void deleteMethod() {
		given().baseUri("https://jsonplaceholder.typicode.com/posts/1").
		when().
        delete().then().statusCode(200).
	    log().all();
	
	
	}

}
