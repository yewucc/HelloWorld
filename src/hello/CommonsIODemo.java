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
		String data = "�Ұ��ҵļ�";
		FileUtils.writeStringToFile(new File("��"), data);
		String str = FileUtils.readFileToString(new File("��"));
		System.out.println(str);
		FileUtils.copyFile(new File("��"), new File("jia"));

	}

}
