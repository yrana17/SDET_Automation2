package modelclass;

import com.google.gson.Gson;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gson gson = new Gson();
		MainConnection conn = gson.fromJson(
				"{\"connection\":[{\"name\":\"CONN_1\", \"up\":true},{\"name\":\"CONN_2\", \"up\":false}], \"hostnm\":\"hostnm1\",\"time\":1613387099}",
				MainConnection.class);

		System.out.println(conn.getHostnm());
		System.out.println(conn.getTime());
		System.out.println(conn.getConnection().get(0).getUp());
		System.out.println(conn.getConnection().get(0).getName());
		

	}

}
