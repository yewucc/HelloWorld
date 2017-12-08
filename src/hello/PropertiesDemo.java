package hello;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.junit.Test;

public class PropertiesDemo {
	public static void main(String[] args) {
		Properties pro = new Properties();
		pro.setProperty("name", "zhangsan");// 存键值对
		pro.setProperty("age", "20");
		pro.setProperty("sex", "male");
		System.out.println(pro);
		String val = pro.getProperty("age");// 通过key值得到value值
		System.out.println(val);
		Set<String> keys = pro.stringPropertyNames();// key值集合
		for (String key : keys) {
			String value = pro.getProperty(key);
			System.out.println(key + ":" + value);
		}
	}

	@Test
	public void load() {
		Properties properties = new Properties();
		FileReader reader = null;
		try {
			reader = new FileReader("config.properties");
			properties.load(reader);
			System.out.println(properties);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Test
	public void store() {
		Properties properties = new Properties();
		properties.setProperty("name", "lisi");
		properties.setProperty("age", "15");
		properties.setProperty("sex", "female");
		FileWriter writer = null;
		try {
			writer = new FileWriter("config1.properties");
			properties.store(writer, "save student");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
