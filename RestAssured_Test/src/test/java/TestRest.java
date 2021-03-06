import static io.restassured.RestAssured.given;

import io.restassured.module.jsv.JsonSchemaValidator;

public class TestRest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		JsonSchemaValidator validator = JsonSchemaValidator.matchesJsonSchemaInClasspath("schema.json");
		String resp = given().when().get("https://bookstore.toolsqa.com/BookStore/v1/Books").then().body(validator).extract().asString();
		
		if(validator.matches(resp)) {
			
			System.out.println("Schema Validation Passed!");
			
		}
		else
			System.out.println("Schema Validation Failed!");
				
		
		

	}

}