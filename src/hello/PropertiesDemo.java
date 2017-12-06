package hello;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
	public static void main(String[] args) {
		Properties pro = new Properties();
		pro.setProperty("name", "zhangsan");
		pro.setProperty("age", "20");
		pro.setProperty("sex", "male");
		System.out.println(pro);
		String val = pro.getProperty("age");
		System.out.println(val);
		Set<String> keys = pro.stringPropertyNames();
		for (String key : keys) {
			String value = pro.getProperty(key);
			System.out.println(key + ":" + value);
		}
	}
}
