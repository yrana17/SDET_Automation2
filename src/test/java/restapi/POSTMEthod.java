package restapi;

import org.json.simple.JSONObject;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POSTMEthod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String baseUri="http://localhost:3000";
		String methodUrl="/users";
		
		RestAssured.baseURI=baseUri;
		RequestSpecification httpReq= RestAssured.given();
		

		JSONObject hm = new JSONObject();
		hm.put("firstname","FirstName12");
		hm.put("lastname", "LastName12");
		hm.put("courseid", 1);
		
		httpReq.header("Content-Type", "application/json");

		httpReq.body(hm);
		
		Response resp=httpReq.request(Method.POST, methodUrl);
		
		
		System.out.println("Response Code:"+resp.getStatusCode());
		
		System.out.println("Body--------->");
		System.out.println("Response Body:"+resp.getBody().asString());
		
		
	}

}
