package db;

import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.util.Properties;

public class DbDemo {
	public static void main(String[] args) throws Exception {
		FileReader reader = new FileReader("src/db/config.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String value = properties.getProperty("className");
		Class clazz = Class.forName(value);
		Constructor constructor = clazz.getConstructor();
		AbstractDB db = (AbstractDB) constructor.newInstance();
		// Method method = clazz.getMethod("getConnection", null);
		// method.invoke(db, null);
		db.getConnection();
	}

}
