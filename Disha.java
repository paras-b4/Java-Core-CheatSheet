
/*
class Disha
{
    public Disha(){
        System.out.println("i love you");
    }
    public void show(){
        System.out.println("hi disha ");
    }


}
class paras {
    public static void main(String[] args) {
        Disha d=new Disha();
        d.show();
        System.out.println("hello disha ");
    }

}
   
class Disha {
    public static void main(String [] args){
        int num=10;
        char f=(char)num;
        System.out.println(((Object)f).getClass().getSimpleName().split(null));
        System.out.println(f+'A');
        
    }
}
 

import java.lang.reflect.Field;

class Disha{

    public int i=100;
    public float i1=100.00f;
    public static void main(String[] args) throws NoSuchFieldException, SecurityException {
        
        Field f=Disha.class.getField("i1");
        Class value =f.getType();
        System.out.println(value);
        // float fl=2.5f;
        // int i1=(int)fl;
        // System.out.println(i1);
        char a='A';
        int i1=a;
        int num1=88;
        char c=(char)num1;
        System.out.println(c);
        System.out.println(i1);
        
    }
}
  
    
    import java.io.IOException;
    
    class Disha{
        public static void main(String[] args) throws IOException {
        System.out.println("enter a no");
        int i=System.in.read();
        System.out.println(i);
        System.in.read();
        System.in.read();
        System.out.println("enter a char");
        int c=System.in.read();
        System.out.println(c);
        
    }
}
      

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Disha {
    public static void main(String[] args) throws IOException {
        // InputStreamReader i=new InputStreamReader(System.in);
        // BufferedReader bf=new BufferedReader(i);
        // System.out.println("enter your name ");
        // String s=bf.readLine();
        // System.out.println("your name is + "+s);
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter your age");
        // int s=sc.nextInt();
        // String a="1000";
        // double d=Integer.parseInt(a);
        // System.out.println(d);
        // System.out.println("your age is : "+ s);
        // System.out.println("enter your name");
        // sc.nextLine();
        // String S=sc.nextLine();
        // System.out.println("your name is : "+S);
        // sc.close();

        int num= 0b01011111111111; // literals in Binary must start with 0b . 
        int num1=10004; // decimal they can be any sequence of digit 0-9 .
        int num2 =0256; // octal
        int num3 =0xABCDef; // HexaDecimal
        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(((Object)num3).getClass().getSimpleName());
        int A=10;
        A++;
        System.out.println(A++ + ++A + ++A + A--);
        System.out.println(++A);
    }

}

class disha {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            System.out.print(i+" ");
            for(int j=0;j<5;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
        int i=0;
       while(i<5)
       {
        System.out.print(i+" ");
            int j=0;
            while(j<5){
                System.out.print(j+" ");
                j++;
            }
            System.out.println();
            i++;
       }
       System.out.println();
       int k=3;
       do{
        
        System.out.print(k+" ");
        k++;
       }while(k<5);

    }
}


import java.util.Scanner;

class Disha {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a day");
        String day=sc.nextLine().toLowerCase();
        sc.close();
        String result="";
       result=switch (day) {
        case "monday" , "tuesday" ->  "6 am";
            
           
       case "saturday","sunday"->"7am";
            
        default->
        "enter a valid day";
            
       };
       System.out.println(result);
            
        
    }
}

class Disha{
    public static void main(String[] args) {
        int a=15;
        int b=2;
        double d=15.0;
        System.out.println(a/d);
        System.out.println(a%b);
        System.out.println(Math.floorDiv(a,a));
    }
}


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

class disha {
    public static void main(String[] args) throws IOException {
        // FileReader rd=new FileReader("Disha.txt");
        // int i=rd.read();
        // while(i!=-1){
        //     System.out.print((char)i);
        //     i=rd.read();
        // }
        // BufferedReader bf=new BufferedReader(new FileReader("Disha.txt")) ;
        // String i=bf.readLine();
        // while(i!=null){
        //     System.out.print(i);
        //     i=bf.readLine();
        // }
        // List<String> list=Files.readAllLines(Path.of("Disha.txt"));
        // for(String l:list){
        //     System.out.println(l);
        // }
        // FileInputStream f=new FileInputStream("Disha.txt");
        // int c=f.read();
        // while(c!=-1){
        //     System.out.println(c);
        //     c=f.read();
        // }
        // f.close();
        Scanner sc=new Scanner(new File("Disha.txt"));
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();  

    }
}

class disha{
    public static void main(String[] args) {
        int a=10;
        int b=2;
        boolean result=a%b==0 ? true : false;
        System.out.println(result);
    }
}


import java.util.Scanner;

class disha{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        System.out.println("enter the elements in array");
        
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            
            System.out.print(arr[i]+" ");
        }
        
        sc.close();

    }

}


import java.util.Scanner;

class disha{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of row");
        int r=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the no of column");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("enter the elements in array");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        for(int n[]:arr){
            for(int m:n){
                System.out.print(m+" ");
            }
            System.out.println();
        }
        // for(int i=0;i<r;i++){
        //     for(int j=0;j<c;j++){
        //         System.out.print(arr[i][j]+ " ");
        //     }
        //     System.out.println();
        // }
        
    }
}

class disha {
    public static void main(String[] args) {
        String str="paras";
        System.out.println(str.hashCode());
        String str1="paras";//here "paras" is stored in string constant pool
        String str3=new String("paras");//here paras is stored in heap memory object .
        System.out.println(str1 == str); // compares the memory refrence of the two object  . (wheather they stored at the same memory location or not).
        System.out.println(str.equals(str1));// compares the content of the object .
        System.out.println(str1.equals(str3));
        System.out.println(str1==str3);
        str=str.concat("yadav");
        System.out.println(str.hashCode());
    }
    
}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Disha{
    
        public static void main(String[] args) throws IOException {
        InputStreamReader i=new InputStreamReader(System.in);
        BufferedReader bf=new BufferedReader(i);
        System.out.println("enter the size of an array");
        String s=bf.readLine();
        int i1=Integer.parseInt(s);
        String str[]=new String[i1];
        
        for(int j=0;j<str.length;j++){
            System.out.println("enter "+(j+1) +" name in array");
            str[j]=bf.readLine();
        }
        for(String str1 : str){
            System.out.print(str1+" ");
        }
        
        System.out.println();
        ArrayList<Object> al=new ArrayList<>();
        al.add('c');
        al.add(20.35);
        al.add("paras");
        al.add(40);
        for(Object o:al){
            System.out.println(((Object)o).getClass().getSimpleName()+" "+o);
        }
    }
}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
class Student{
    String name;
    int age;
    int marks;
    public Student(){
        name="Paras";
        age=20;
        marks=100;
    }
    public Student(String s, int a, int m) {
        name=s;
        age=a;
        marks=m;
            
        }
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", marks=" + marks + "]";
    }
        
       
    }
    class disha{
        public static void main(String[] args) throws IOException {
           Scanner sc=new Scanner(System.in);
           System.out.println("enter the no of students");
           int i1=sc.nextInt();
          
           Student stud[]=new Student[i1];
           for(int i=0;i<stud.length;i++)
           {
            sc.nextLine();
                System.out.println("enter the name of "+(i+1)+" Student");
                String s=sc.nextLine();
                System.out.println("enter the age of "+(i+1)+" Student");
                int a=sc.nextInt();
                sc.nextLine();
                System.out.println("enter the marks of "+(i+1)+" Student");
                int m=sc.nextInt();
                stud[i]=new Student(s,a,m);
       }
       for(Student s:stud){
        System.out.print(((Object)s).getClass().getSimpleName()+s+" ");
       }

        
    }
}

class disha{
    public static void main(String[] args) {

        String s="paras";
        System.out.println(s.hashCode()+" "+s);
        s="paras yadav";
        System.out.println(s.hashCode()+" "+s);

        StringBuilder sb=new StringBuilder("paras");
        System.out.println(sb.hashCode()+" "+sb);
        sb.append("yadav");
        System.out.println(sb.hashCode()+" "+sb);
        
    }
}

class disha{
     int age=22;
     static int marks;
    static String name ="paras yadav";
    public disha(){
        System.out.println("in constructor");
    }
    static { // static block is used to initilize the static variables .
         marks=100;
        System.out.println("in static ");
    }

    public void show(){
        System.out.println("In show ");
    }
    public static void greet(disha d2){
        System.out.println("Good morning : "+name+" Your age is : "+d2.age+" Your marks is : "+marks);

    }
    public static void main(String [] args){

        disha d=new disha();

        disha d1=new disha();
        
        d.age=21;
        d.name="Disha Tomar";
       // d.greet(name);
        d1.age=19;
        
        d1.name="paras";
        disha.name="paras disha";
        disha.greet(d);
        //disha.greet(d);
       // d1.greet(name);

        
        System.out.println("Your age is : "+d.age+" Your name is : "+d.name);
        System.out.println("Your age is : "+d1.age+" Your name is : "+d1.name);

    }

}
    

class Encapsulation
{

    private String name ;
    private int age;
    private int marks ;
    private String subject ;
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}

class disha 
{
    public static void main(String[] args) {
        Encapsulation e=new Encapsulation();
        e.setName("paras yadav");
        e.setAge(21);
        e.setMarks(100);
        e.setSubject("Java");
        System.out.println("Your details are : "+e.getName()+" , "+e.getAge()+" , "+e.getMarks()+" , "+e.getSubject());
    }

}

class disha{

    public int sum(int a,int b,int c){
        return a+b+c;
    }
    public int sum(int a,int b){
        return a+b;
    }

    public static void main(String[] args) 
    {
        disha d=new disha();
        int result =d.sum(10, 20);
        int result1=d.sum(10, 20,30);
        System.out.println(result);
        System.out.println(result1);

    }

}

class disha {
    String name ;
    int age;
    int rollno;
    public disha()
    {
        System.out.println("default constructor ");
        name="Disha tomar";
    }
    public disha(int a,int rollno)
    {
        this();
        age=a;
        this.rollno=rollno;
    }
    
    @Override
    public String toString() {
        return "disha [name=" + name + ", age=" + age + ", rollno=" + rollno + "]";
    }
    public static void main(String[] args) 
    {
        disha d=new disha();
        disha d1=new disha(22,35);
        d.age=20;
        d.rollno=18;
        System.out.println(d1);
        System.out.println(d);

    }
    
}


import java.io.FileInputStream;
import java.io.IOException;

class disha{
    public static void main(String[] args) throws IOException {
        FileInputStream rd=new FileInputStream("Disha.txt"); 
        int c=rd.read();
        while(c!=-1){
            System.out.print((char)c);
            c=rd.read();
        }
        rd.close();
    }
   

}


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

class disha{
    public static void main(String[] args) throws IOException {
        List<String> list=Files.readAllLines(Path.of("Disha.txt"));
       for(Object l:list){
        System.out.println(l);
       }
        
    }
}


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class disha{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("Disha.txt"));
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
    
// multiple inheritance 
interface A
{
    void show();
    int sum(int n ,int m);
}
interface C
{
    void greet();
    int add(int a,int b);
}
class B implements A,C
{
    public void show(){
        System.out.println("in B show");
    }
    public int sum(int n,int m){
        return n+m;
    }
    public void greet(){
        System.out.println("good morning ");
    }
    public int add(int a,int b){
        return a+b;
    }
}
class disha{
    public static void main(String[] args) {
        B b = new B();
        b.show();
        int result=b.sum(10, 20);
        int result1=b.add(12,13);
        System.out.println(result);
        System.out.println(result1);
    }
}

// This and super keyword 
class A{
    public A(){
        this(90);
        System.out.println("default costructor of A");
    }
    public A(int n)
    {
        
        System.out.println("parametrized constructor of A "+n);
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("default costructor of B ");
    }
    public B(int n)
    {
        this();
        System.out.println("parametrized constructor of B "+n);
    }
}
class C extends B{
   
    public C(int n)
    {
        super(20);
        
        System.out.println("parametrized constructor of C "+n);
    }
    public C(){
        this(10);
        System.out.println("default costructor of C");
    }
}
class disha{
    public static void main(String[] args) {
        C c=new C();
        
    }
}

// method overriding 
class A{
    public void show(){
        System.out.println("in A show");
    }
    public void greet(){
        System.out.println("in A greet");
    }
}
class B extends A{
    public void show(){
        System.out.println("in B show");
    }
}
class disha {
    public static void main(String[] args) {
        B b=new B();
        b.show();
        b.greet();

    }
}
    
abstract class A{
    abstract void show();
    public int sum(int a,int b){
        return a+b;
    }
}
class B extends A{
    public void show(){
        System.out.println("in B show");
    }
  
}
class disha{
    public static void main(String[] args) {
        
            A b=new B();
            int result=b.sum(10, 30);
            b.show();
            System.out.println(result);
        
    }
}

// dynamic method dispatcher or runtime polymorphism .
class A{
    public void show()
    {
        System.out.println("in a show");
    }
    public void greet()
    {
        System.out.println("good night");
    }
}
class B extends A{
    public void show()
    {
        System.out.println("In b show");
    }
    public void greet()
    {
        System.out.println("good night");
    }
}
class C extends B{
    public void show(){
        System.out.println("in c show ");
    }
}
class disha{
    public static void main(String[] args) {
        A a=new A();
        a.show();

        a =new B();
        a.show();
        a.greet();

        a =new C();
        a.show();

    }
}

// upcasting and downcasting .
class A{
    public void show(){
        System.out.println("in a show");
    }

}
class B extends A{
    public void greet(){
        System.out.println("good morning ");
    }
}
class C extends B{
    public void config(){
        System.out.println("in c config ");
    }
}
class disha{
    public static void main(String[] args) {
        A a=new B();// upcasting 
        A a1=new C();
        a1.show();
        a.show();

        B b=(B) a;
        b.greet();

        C c=(C)a1;
        c.config();
        
    }
}
    // tostring 
class paras{
    int age;
    String name ;
    int marks;
    public paras(){
        System.out.println("default constructor");
        age=21;
        marks=98;
        name="paras";
    }
    public paras(int age,int marks,String name){
        this.age=age;
        this.marks=marks;
        this.name=name;
        System.out.println("parametrized constructor");
    }
    @Override
    public String toString() {
        System.out.println("hello");
        return "paras [age=" + age + ", name=" + name + ", marks=" + marks + "]";
    }
    

}
class Demo{
    public static void main(String[] args) {
        paras p=new paras(21,90,"Dev");
        paras p1=new paras();
        System.out.println(p1);
        p.age=20;
        p.marks=99;
        p.name="aadi";
        System.out.println(p.age+" "+p.marks+" "+p.name);
        System.out.println(p);
    }
}

enum laptop{
    dell(10000),asuz(8000),hp(5000),lenovo();
    int price;
    private laptop()
    {
       price=5000;
    }
    private laptop(int price){
        
        this.price=price;
        
        System.out.println("your laptop is : "+this.name());
    }
}
class disha{
    
    public static void main(String[] args) 
    {
        laptop l=laptop.dell;
        
        System.out.println(l.ordinal());
        
        for(laptop l1:l.values()){
            System.out.println(l1+" "+l1.price);
        }
        
    }
}
enum name{

    paras,dev,rishabh,aadi;
    
}
class disha{
    public static void main(String[] args) 
    {

        name n=name.aadi;
        System.out.println(n);
        for (name n1:n.values()){

        
        switch(n1)
        {
            case paras:
            System.out.println("hello paras");
            break;
            case aadi:
            System.out.println("hello aadi");
            break;
            case rishabh:
            System.out.println("hello rishabh");
            break;
            case dev:
            System.out.println("hello dev");
            break;

        }

    }
        
    }
}

// anonymous object 
class A {
    public A(){
        System.out.println("Object is created ");
    }
    public void show(){
        System.out.println("In show ");
    }
    public void greet(){
        System.out.println("good morning ");
    }

}
// class B extends A{
//     public void greet(){
//         System.out.println("good morning ");
//     }
// }
class disha {
    public static void main(String[] args) {
        new A().show();
        new A().greet();
        
    }
}

// inner class
class A{
    public void show(){
        System.out.println("In A show ");
    }
    class B{
        public void show(){
            System.out.println("In B show");
        }
        class C{
            public void show(){
                System.out.println("In C show");
            }
        }
    }

}
class disha{
    public static void main(String[] args) {
        A a=new A();
        a.show();
        A.B b=a.new B();
        b.show();
        A.B.C c=b.new C();
        c.show();

    }
}

// functional interface 
interface A{
    void show();
}
class disha{
    public static void main(String[] args) 
    {
        A a=()->
                System.out.println("in show functional interf");
            
        ;
        a.show();
        
    }
}


@FunctionalInterface
interface A{
    int sum(int a,int b);
}
class disha{
    public static void main(String[] args) {
        A a1=( int a , int b)-> a+b;

            
        ;
        int result =a1.sum(3, 5);
        System.out.println("Your sum is : "+result);
    }
}

// Anonymous inner class.
class A{
    public void show(){
        System.out.println("In A show");
    }
}
class disha{
    public static void main(String[] args) {
        A a=new A()
        {
            public void show(){
                System.out.println("In show");
            }
        };
        a.show();
    }
}

// compile time error = syntax error, missing semi-colons ,brackets, these error occurs during the compilation of the code 
//logical error = when program execute successfully but does not produce the expected output .
//Run time error = try to read file that doesnot exist or divide by zero .these are exception 
class disha{
    public static void main(String[] args) {
        int i=2;
        int j=9;
        int[] stud=new int[5];
        try 
        {
            j=j/i;
            
            System.out.println(stud[6]);
        } catch (ArithmeticException e) 
        {
            System.out.println("cannot divide by zero"+e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("stay in your limits "+e);
        }
        catch(Exception e){
            System.out.println("somthing went wrong ");
        }

        System.out.println(j);
        System.out.println("bye");
    }

}

// throw keyword 
class disha{
    public static void main(String[] args) {
        int i=20;
        int j=9;
        int[] stud=new int[5];
        try 
        {
            j=j/i;
            if(j==0){
                System.out.println("Arithmetic ");
                throw new ArithmeticException("hello paras");
            }
            System.out.println(stud[6]);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("thats the default output "+e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("stay in your limits "+e);
        }
        catch(Exception e){
            System.out.println("somthing went wrong ");
        }
        System.out.println(j);
        System.out.println("bye");
    }

}

// custom exception
class MyException extends Exception{
    public MyException(String s){
        super(s);
    }
}
class disha
{
    public static void main(String[] args) {
        int i=2;
        int j=9;
        int[] stud=new int[5];
        try 
        {
            j=j/i;
            if(j==4){
                throw new MyException("Custom exception");
            }
            System.out.println(stud[6]);
        } catch (MyException e) 
        {
            System.out.println("my own exception class "+e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("stay in your limits "+e);
        }
        catch(Exception e){
            System.out.println("somthing went wrong ");
        }
        System.out.println(j);
        System.out.println("bye");
    }
}

// thread
class A extends Thread{
    public void run(){
        for(int i=0;i<1000;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hi " +i);
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<1000;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
            System.out.println("hello "+i);
        }
    }
}
class disha{
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        b.getPriority();
        a.getPriority();
        b.start();
        
        a.start();

    }
}

class A implements Runnable{
    public void run(){
        for(int i=0;i<1000;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hi " +i);
        }
    }
}
class B implements Runnable{
    public void run(){
        for(int i=0;i<1000;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
            System.out.println("hello "+i);
        }
    }
}
    // Runnable 
class disha{
    public static void main(String[] args) {
       Runnable r1=()-> {
            for(int i=0;i<1000;i++){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("hi " +i);
            }
                  }
        
       ;
       
       Runnable r2=()-> {
            for(int i=0;i<1000;i++){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("hello " +i);
            }
                  }
        
       ;
       Thread t1=new Thread(r1);
       Thread t2=new Thread(r2);
       t1.start();
       t2.start();
       };
      

    }

// join() methods for handling race condition .
class A extends Thread {
    int count;
    public void increment(){
        count=count+1;
        
    }
    public void run(){
        for(int i=0;i<10000;i++){
            increment();
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            // System.out.println("hi " +i);
        }
        
    }
}
class B extends Thread{
    int count;
    public void increment(){
        count=count+1;
        
    }
    public void run(){
        for(int i=0;i<10000;i++){
            increment();
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
            
            // System.out.println("hello "+i);
        }
    }
}
class disha{
    public static void main(String[] args) throws InterruptedException {
        A a=new A();
        B b=new B();
        
        b.getPriority();
        a.getPriority();
        b.start();
        a.start();
        a.join();
        b.join();
        System.out.println(a.count+b.count);
    }
}

// iteration over List
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class disha {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,4,2,7,4,9,6,5);
        // list.add(23);
        List<Integer>list1=new ArrayList<>();
        list1.add(10);
        list1.add(11);
        list1.add(20);
        list1.addAll(list);
        list.set(0, 100);
        // Iterator<Integer> itr=list1.iterator();
        // while(itr.hasNext()){
        //     System.out.print(itr.next()+" , ");
        // }
        // list1.forEach(n->System.out.print(n+" , "));
        for(Integer l:list1){
            System.out.print(l+" ,");
        }
        System.out.println();

        for(int i=0;i<list1.size();i++){
            System.out.print(list1.get(i)+" ,");
        }
    }
}

// stream api
import java.util.ArrayList;
import java.util.List;

class disha{
    public static void main(String[] args) {
        List<Integer>list= new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);

        int result=list.stream().filter(n->n%2==0).map(n->n*2).reduce(0,(e,n)->e+n);
        System.out.println(result);

    }
}

// comparator .
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class disha{
    public static void main(String[] args) {
        List<Integer>list= new ArrayList<>();
        list.add(100);
        list.add(20);
        list.add(60);
        list.add(40);
        list.add(50);
        System.out.println(list);
        Comparator<Integer> com=new Comparator<Integer>(){

            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1>o2) {
                    return 1;
                }else{
                    return -1;
                }
                  }
            
        };
        Collections.sort(list,com);
        list.forEach(n->System.out.print(n+" ,"));
    }
}

// comparable
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class disha implements Comparable<disha>  {
    int value;
    public disha(int v){
        value=v;

    }
    @Override
    public int compareTo(disha o) {
        if (this.value > o.value) {
            return 1;
        }else{
            return -1;
        }
        }
        
    @Override
    public String toString() {
        return "disha [value=" + value + "]";
    }
    public static void main(String[] args) {
        List<disha>list= new ArrayList<>();
        list.add(new disha(100));
        list.add(new disha(20));
        list.add(new disha(60));
        list.add(new disha(40));
        list.add(new disha(50));
       
        System.out.println(list);
       
          
        Collections.sort(list);
       
        list.forEach(n->System.out.print(n+" ,"));
    }

 
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class disha{
    public static void main(String[] args) {
        List<Integer>list= new ArrayList<>();
        list.add(100);
        list.add(20);
        list.add(60);
        list.add(40);
        list.add(50);
        System.out.println(list);

        // int result=list.stream().filter(n->n%2==0).map(n->n*2).reduce(0,(e,n)->e+n);
        // System.out.println(result);
        Collections.sort(list);
        System.out.println(list);

    }
}


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class disha{
    int age;
    String name;
    public disha(int a,String n){
        age=a;
        name=n;
    }
    

    @Override
    public String toString() {
        return "disha [age=" + age + ", name=" + name + "]";
    }


    public static void main(String[] args) {
        List<disha> list=new ArrayList<>();
        list.add(new disha(22,"paras yadav"));
        list.add(new disha(21,"disha tomar"));
        list.add(new disha(20,"dev"));
        list.add(new disha(19,"rishabh"));
        list.add(new disha(21,"aadi"));
        
        Comparator<disha> com=new Comparator<disha>() {
            public int compare(disha a,disha b){
                if(a.name.length()>b.name.length()){
                    return 1;
                }else{
                    return -1;
                }
            }
        };
        Collections.sort(list,com);
        list.forEach(n-> System.out.print(n + " "));
       
    } 
}

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class disha implements Comparable<disha>{
    int age;
    String name;
    public disha(int a,String n){
        age=a;
        name=n;
    }
    @Override
    public String toString() {
        return "disha [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(disha a){
        if(a.age<this.age){
            return 1;

        }else{
            return -1;
        }
    }
    public static void main(String[] args) {
        List<disha> list=new ArrayList<>();
        list.add(new disha(22,"paras yadav"));
        list.add(new disha(21,"disha tomar"));
        list.add(new disha(20,"dev"));
        list.add(new disha(19,"rishabh"));
        list.add(new disha(21,"aadi"));
        
        // Comparator<disha> com=new Comparator<disha>() {
        //     public int compare(disha a,disha b){
        //         if(a.name.length()>b.name.length()){
        //             return 1;
        //         }else{
        //             return -1;
        //         }
        //     }
        // };
        Collections.sort(list);
        list.forEach(n-> System.out.print(n + " "));
       
    } 
}
    
import java.io.IOException;
    
class disha{
    public static void main(String[] args) throws IOException {
    System.out.println("enter a no");
    int i=System.in.read();
    System.out.println(i);
    System.in.read();
    System.out.println("enter a char");
    System.in.read();
    
    
    int c=System.in.read();
    System.out.println(c);
    System.out.println("enter a char");
    System.in.read();
    
    
    int c1=System.in.read();
    System.out.println(c1);
    
}
}
*/

