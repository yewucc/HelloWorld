package hello;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.junit.Test;

public class CommonsIODemo {
	@Test
	public void filenameUtilTest() {
		String filename = "C:\\java\\haha.doc.java";
		String extension = FilenameUtils.getExtension(filename);
		System.out.println(extension);
		String baseName = FilenameUtils.getBaseName(filename);
		System.out.println(baseName);
		String name = FilenameUtils.getName(filename);
		System.out.println(name);
		boolean isextension = FilenameUtils.isExtension(filename, "doc");
		System.out.println(isextension);
		String removeExtension = FilenameUtils.removeExtension(filename);
		System.out.println(removeExtension);
	}

	@Test
	public void flieUtilTst() throws IOException {
		String data = "我爱我的家";
		FileUtils.writeStringToFile(new File("家"), data);
		String str = FileUtils.readFileToString(new File("家"));
		System.out.println(str);
		FileUtils.copyFile(new File("家"), new File("jia"));

	}

}
