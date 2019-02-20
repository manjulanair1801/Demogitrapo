import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws IOException {

// how to read properties file 
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\manjula\\Desktop\\Training docs"
				+ "\\seleniumcucumberproject\\TestNG\\src\\config.properties");
		prop.load(ip);
		
		System.out.println(prop.getProperty("browser"));
	}

}


