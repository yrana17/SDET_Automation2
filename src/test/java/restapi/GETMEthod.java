package restapi;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GETMEthod {

	public static void main(String[] args) {

		String baseUri="http://localhost:3000";
		String methodUrl="/users";
		
		RestAssured.baseURI=baseUri;
		RequestSpecification httpReq= RestAssured.given();
		
		
		httpReq.queryParameters("id", 7);
		
		Response resp=httpReq.request(Method.GET, methodUrl);
		
		
		System.out.println("Response Code:"+resp.getStatusCode());
		
		System.out.println("Body--------->");
		System.out.println("Response Body:"+resp.getBody().asString());
		
		System.out.println("Header--------->");
		System.out.println(resp.getHeaders());
		
		
		
		
		
		
	}

}
