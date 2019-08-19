package annotation.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
   
	
	@Autowired // Autowire on property
   private SpellChecker spellChecker;
  
   /*
	@Autowired // Autowire on contruct
	public TextEditor(SpellChecker spl){
		System.out.println("Editor class called ..");
		this.spellChecker	= spl;
	}
	*/
   
   /*
   @Autowired // Autowire by setter method
   public void setSpellChecker( SpellChecker spellChecker ){
	      this.spellChecker = spellChecker;
	   }
   */
   
   public void spellCheck() {
      spellChecker.checkSpelling();
   }
}