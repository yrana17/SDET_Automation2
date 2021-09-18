package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LearnPropertiesFile {

	public static void main(String[] args) throws IOException {

		Properties p = new Properties();
		InputStream inputStream = new FileInputStream("src/main/resources/test.properties");
		p.load(inputStream);

		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("port"));
	}

}
