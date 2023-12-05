package parameterization;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class WorkingWithProperties {

	public static void main(String[] args) throws IOException {
		
		
			FileReader fr = new FileReader("/Users/sudhananda/59/59Selenium/DataFiles/appdata.properties");
			Properties props = new Properties();
			props.load(fr);
			
			
			System.out.println(props.getProperty("username"));


	}

}
