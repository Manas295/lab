package a_file_filter;

import java.io.File;
import java.io.FileFilter;
  
		/*	interface FileFilter {
				boolean accept(File file);
			}*/
	   
  class MyFileFilter implements FileFilter
		{		
		@Override
		public boolean accept(File file) {		  
			return file.getName().endsWith(".java");
		}	
	}
  
 public class FileFilter1 {	
	public static void main(String[] args) {
		
		  MyFileFilter filter = new MyFileFilter();
		  File dir = new File("d:/file");		  
		  File files[]=dir.listFiles(filter);
		  
		  for(File f:files)
		  {
			  System.out.println(f);
		  }
	}

}

