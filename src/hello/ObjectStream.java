package hello;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import org.junit.Test;

public class ObjectStream {
	@Test
	public void objectOutputStream() {
		Person person = new Person("zhangsan", 20);
		OutputStream output = null;
		ObjectOutputStream objectoutput = null;
		try {
			output = new FileOutputStream("person");
			objectoutput = new ObjectOutputStream(output);
			objectoutput.writeObject(person);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (objectoutput != null) {
				try {
					objectoutput.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Test
	public void objectInputStream() {
		InputStream input = null;
		ObjectInputStream objectinput = null;
		try {
			input = new FileInputStream("person");
			objectinput = new ObjectInputStream(input);
			Object readObject = objectinput.readObject();
			// Person per = (Person) readObject;
			// System.out.println(per);
			System.out.println(readObject);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (objectinput != null) {
				try {
					objectinput.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
