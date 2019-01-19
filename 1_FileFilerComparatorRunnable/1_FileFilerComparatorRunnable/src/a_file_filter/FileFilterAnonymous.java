package a_file_filter;

import java.io.File;
import java.io.FileFilter;

public class FileFilterAnonymous {

	public static void main(String[] args) {

		FileFilter filter = new FileFilter() {
			@Override
			public boolean accept(File file) {
				return file.getName().endsWith(".java");
			} 
		};
			
		File dir = new File("d:/file");
		File files[] = dir.listFiles(filter);

		for (File f : files) {
			System.out.println(f);
		}

	}
}
