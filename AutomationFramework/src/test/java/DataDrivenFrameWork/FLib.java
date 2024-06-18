package DataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FLib {
	
	public String getDataFromPropertFile(String path,String key) throws IOException {
		FileInputStream fis = new FileInputStream(path);
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
		

	}

}
