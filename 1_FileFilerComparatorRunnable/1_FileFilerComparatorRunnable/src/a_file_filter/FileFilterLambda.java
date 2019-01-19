package a_file_filter;
import java.io.File;
import java.io.FileFilter;


public class FileFilterLambda {

	
	public static void main(String[] args) {
				
	
		 /*   FileFilter filter = new FileFilter()  {
					@Override
					public boolean accept(File file) {
						
						return file.getName().endsWith(".java");
					}			
				  };
		  
		    File dir = new File("d:/file");		  
		    File files[]=dir.listFiles(filter);		  
			  for(File f:files)
			  {
				  System.out.println(f);
			  }
	*/
			
	      File dir = new File("d:/file");
		
	      FileFilter f = file -> file.getName().endsWith(".java");		
	      File files[]=dir.listFiles(f);		
		  for(File fa:files)
		  {
			  System.out.println(fa);
		  }
	
			
		
		/* FileFilter filter = (File file ) -> file.getName().endsWith(".java"); 
		
		//FileFilter filter = (file) -> file.getName().endsWith(".java"); 
		  
		  File dir = new File("d:/file");
		  
		  File files[]=dir.listFiles(filter);
		  
		  //File files2[]=dir.listFiles((file) -> file.getName().endsWith(".java"));
		  
		  for(File f:files)
		  {
			  System.out.println(f);
		  }*/
		
		 
		   
		}
}
