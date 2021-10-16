package json;

import java.io.FileReader;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JsonRead {

	public static void main(String[] args) {

		try {

			FileReader fr = new FileReader("src/main/resources/Emp.json");

			JsonParser jsonParser = new JsonParser();
			JsonObject jo = jsonParser.parse(fr).getAsJsonObject();

			JsonArray ja = jo.get("users").getAsJsonArray();
			for (int i = 0; i < ja.size(); i++) {

				System.out.println(ja.get(i).getAsJsonObject());
				System.out.println(ja.get(i).getAsJsonObject().get("courseid").getAsInt());
			}

			ja = jo.get("courses").getAsJsonArray();
			for (int i = 0; i < ja.size(); i++) {

				System.out.println(ja.get(i).getAsJsonObject());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
