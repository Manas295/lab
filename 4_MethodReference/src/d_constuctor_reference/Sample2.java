package d_constuctor_reference;

@FunctionalInterface
 interface StringCreator  {
	String strFunc(char[] chArray); 
}

class Sample2 { 
    public static void main(String[] args) {
    
    // 1st
    StringCreator stc= new StringCreator() {		
		@Override
		public String strFunc(char[] chArray) { 
			return new String(chArray);
		}
	};	
    	
    // with lambda
    	StringCreator fi1=str->new String(str);
    
    // constructor reference (can't take parameter)
    	StringCreator fi = String::new;
		char[] charArray = {'s','p','e','a','k','i','n','g','c','s'}; 
		System.out.println(fi.strFunc(charArray));
       }  
        
}