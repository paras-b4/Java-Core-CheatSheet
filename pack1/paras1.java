package pack1;

public class paras1 {
    String PublicMethod="public variable";
    private String PrivateMethod="private variable";
    String defaultVariable="default variable";
    protected String protectedVariable="protected variable";

     public void PublicMethod(){
        System.out.println("public method");
    }
    private void PrivateMethod(){
        System.out.println("private method");
    }
     void show(){
        System.out.println("default method");
    }
    protected void ProtectedMethod(){
        System.out.println("protected method");
    }
    public static void main(String[] args) {
        paras1 p1=new paras1();
        p1.PrivateMethod();
        p1.PublicMethod();
        p1.ProtectedMethod();
        p1.show();

        System.out.println(p1.PublicMethod);
        System.out.println(p1.protectedVariable);
        System.out.println(p1.PrivateMethod);
        System.out.println(p1.defaultVariable);
    }
   


}


