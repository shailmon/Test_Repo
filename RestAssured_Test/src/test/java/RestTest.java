
import io.restassured.RestAssured;

import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class RestTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JsonSchemaValidator validator = JsonSchemaValidator.matchesJsonSchemaInClasspath("C:\\Users\\me_mo\\eclipse-workspace\\RestAssured_Test\\src\\test\\java\\schema.json");
		given().when().get("https://bookstore.toolsqa.com/BookStore/v1/Books").then().body(validator);
		
		/*given().when().get("https://bookstore.toolsqa.com/BookStore/v1/Books").then().assertThat()
				.body(validator);
				
		
		
		get("/events?id=390").then().assertThat()
	      .body(matchesJsonSchemaInClasspath("event_0.json"));*/
	

		// System.out.println(resp);

		/*
		 * int sum = 0; JsonPath js=new JsonPath(resp); int count=
		 * js.getInt("books.size()"); System.out.println(js.get("books[0].isbn"));
		 * 
		 * for(int i=0;i<count;i++) { int price=js.getInt("courses["+i+"].price"); int
		 * copies=js.getInt("courses["+i+"].copies"); int amount = price * copies;
		 * System.out.println(amount); sum = sum + amount;
		 * 
		 * }
		 * 
		 * System.out.println(count);
		 * System.out.println(js.get("books[0].isbn").getClass());
		 * System.out.println(js.get("books[0].publish_date").getClass());
		 */
	}
}
