import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {
   static Properties prop;
   public static String getMyValue(String key) {
	   prop = new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream("config.properties");
		prop.load(fis);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return prop.getProperty(key);
	}
}
