package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropData {
	public String getPropData(String dataToBeRead) throws IOException {
		String pathOfFile = System.getProperty("user.dir") + "//src//test//resources//config.properties";
		FileInputStream fs = new FileInputStream(pathOfFile);
		Properties prop = new Properties();
		prop.load(fs);
		String value = prop.getProperty(dataToBeRead);
		System.out.println(value);
		return value;
	}
}
