class C {
       int a = 30;
      void print(){
            System.out.println("C");
      }
}

public class Test extends C{

      int a = 40;
      void print() {
            System.out.println("Test");
      }

      public static void main(String[] args) {
            C obj = new Test();
            try {
                  obj.print();
                  System.out.println(obj.a);
            } catch (Exception e) {
                  // TODO Auto-generated catch block
                  e.printStackTrace();
            }
      }

}



