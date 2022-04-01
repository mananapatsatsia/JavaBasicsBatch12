package com.syntax.class24;
/*Create a class File that will have the following behaviors: open, edit, close.
 *  Edit and close are implemented method while open is an abstract. Create 3 subclasses:
 *   JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour: 
 * Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc 
 */
abstract class File{

abstract void open() ;

   void edit() {
	System.out.println("Edit file");
}
  void close() {
	System.out.println("Close file");
}


}
class JavaFile extends File{
	@Override
void open() {
	System.out.println("To open Java file we need notepad++, or sublime text" );
}

}
class WordFile extends File{
	@Override
 void open() {
	System.out.println("To open a documents we need Microsoft Word");

}

}
class PdfFile extends File {
	@Override
 void open() {
	System.out.println("To open pdf file we need Adobbe reader");
}

}

public class Task2 {
	public static void main(String[] args) {
		/* if a method is not present inside the parent class we can't call
		 * that method using polymorphism
		 * Object[] files={new JavaFile(), new WordFile(), new PdfFile()};
		 * Object[0]
		 */
		  File[] files = {new JavaFile(), new WordFile(), new PdfFile()};
		  for(int i=0;i<files.length;i++) {
			  files[i].open();
			  files[i].close();
			  files[i].open();
		  }
		    // for (File execute:files){
		        // execute.open();
		     //}
	}
}

	 