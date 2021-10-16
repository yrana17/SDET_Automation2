package restapi;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DELETEMEthod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String baseUri="http://localhost:3000/users";
		
		RestAssured.baseURI=baseUri;
		RequestSpecification httpReq= RestAssured.given();
		
		
		
		Response resp = httpReq.delete("/6");
		System.out.println(resp.getStatusCode());
		
	}

}
