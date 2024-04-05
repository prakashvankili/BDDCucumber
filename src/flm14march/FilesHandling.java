package flm14march;

import java.io.File;
import java.io.IOException;

public class FilesHandling {

	public static void main(String[] args) throws IOException {
          
//		
//	File fl =new File("C:\\HandlingFiles");
//	  fl.mkdir();
		
		File f2=new File("C:\\HandlingFiles\\DemoFolder.file");
		f2.createNewFile();
		
System.out.println("File created");
	}

}
