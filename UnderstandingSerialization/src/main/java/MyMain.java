import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MyMain {
	public static void main(String[] args) throws Exception, IOException {
		
	    //serialize();
	    
	    deSerialize();
	    
	}

    private static void deSerialize() throws Exception {
        /*
         * De-Serializing object
         */
        
        
        
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("someFile.txt"));
        ClassToSerialize classToSerialize2  = (ClassToSerialize)objectInputStream.readObject();
        objectInputStream.close();
        
        System.out.println("After serialization a="+classToSerialize2.a+",b="+classToSerialize2.b+",c="+classToSerialize2.c+",d="+classToSerialize2.d+",e="+classToSerialize2.e+",f="+classToSerialize2.f);
        
    }

    private static void serialize() throws Exception, IOException {
        ClassToSerialize classToSerialize   = new ClassToSerialize();
        
        System.out.println("Before serialization a="+classToSerialize.a+",b="+classToSerialize.b+",c="+classToSerialize.c+",d="+classToSerialize.d+",e="+classToSerialize.e+",f="+classToSerialize.f);
        
        /*
         * Serializing Object
         */
        
        ObjectOutputStream objectOutputStream   = new ObjectOutputStream(new FileOutputStream("someFile.txt"));
        objectOutputStream.writeObject(classToSerialize);
        objectOutputStream.close();
    }
}
