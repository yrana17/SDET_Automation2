package restapi;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PATCHMEthod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String baseUri="http://localhost:3000/users/9";
		
		RestAssured.baseURI=baseUri;
		RequestSpecification httpReq= RestAssured.given();
		

		JSONObject hm = new JSONObject();
		hm.put("lastname", "LastName123333");
		
		httpReq.header("Content-Type", "application/json");

		httpReq.body(hm);
		
		Response resp=httpReq.patch();
		
		
		System.out.println("Response Code:"+resp.getStatusCode());
		
		System.out.println("Body--------->");
		System.out.println("Response Body:"+resp.getBody().asString());
		
	
		
		
	}

}
