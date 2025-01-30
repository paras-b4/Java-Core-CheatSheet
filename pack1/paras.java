package pack1;


import other.A;

public class paras {
    public static void main(String[] args) {
        paras1 p1=new paras1();
        
     //   p1.PrivateMethod(); // only accessible with in the same class
        p1.PublicMethod();
        p1.ProtectedMethod();
        p1.show();

        System.out.println(p1.PublicMethod);
        System.out.println(p1.protectedVariable);
      //  System.out.println(p1.PrivateMethod);  //only accessible with in the same class
        System.out.println(p1.defaultVariable);
    }
}

