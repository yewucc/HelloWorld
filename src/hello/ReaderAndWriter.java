package hello;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Arrays;

import org.junit.Test;

public class ReaderAndWriter {
	@Test
	public void reader() {
		try {
			FileReader reader = new FileReader("src/demo");
			int read1 = reader.read();
			System.out.println(read1);
			int read2 = reader.read();
			System.out.println((char) read2);
			int read3 = reader.read();
			System.out.println((char) read3);
			int read4 = reader.read();
			System.out.println(read4);
			int read5 = reader.read();
			System.out.println(read5);
			int read6 = reader.read();
			System.out.println(read6);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void filereader() {
		try {
			FileReader filereader = new FileReader("src/demo");
			char[] buffer = new char[5];
			int length = 0;
			while ((length = filereader.read(buffer)) != -1) {
				System.out.println(Arrays.toString(buffer));
				Arrays.fill(buffer, ' ');
				System.out.println(length);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void readerwriter() {
		Reader reader = null;
		Writer writer = null;
		try {
			reader = new FileReader("src/demo");
			writer = new FileWriter("src/demo_back");
			char[] buffer = new char[5];
			int length = 0;
			while ((length = reader.read(buffer)) != -1) {
				writer.write(buffer, 0, length);
				System.out.println(length);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
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
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
