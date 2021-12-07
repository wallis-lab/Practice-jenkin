package APITest;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.gson.Gson;

import io.restassured.RestAssured;

public class ApiTest {
  @Test
  public void TestSingleUsers() {
	 // RestAssured.baseURI="https://reqres.in/";
	  given().get("/api/users/2").then()
		.statusCode(200)
		.body("data.email", equalTo("janet.weaver@reqres.in"))
		.body("data.id", equalTo(2))
		.body("data.first_name", equalTo("Janet"))
		.body("data.last_name", equalTo("Weaver"))
		.body("data.avatar", equalTo("https://reqres.in/img/faces/2-image.jpg"));
	  
  }
  @Test
  public void TestListUsers() {
	  
	  String jsonString = given().get("/api/users/2").then().statusCode(200).extract().asString();

		singleUser s = new Gson().fromJson(jsonString, singleUser.class);

		Assert.assertEquals(s.data.id, 2);
		Assert.assertEquals(s.data.email, "janet.weaver@reqres.in");
		Assert.assertEquals(s.data.first_name, "Janet");
		Assert.assertEquals(s.data.last_name, "Weaver");
		Assert.assertEquals(s.data.avatar, "https://reqres.in/img/faces/2-image.jpg");
		
		
		System.out.println(jsonString);
	  
	  
  }
 
  
  @BeforeTest
	public void beforeTest() {
		RestAssured.baseURI="https://reqres.in/";
	}
}
