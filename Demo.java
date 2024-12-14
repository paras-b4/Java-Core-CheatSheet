/*
# variables 
public class Demo {

    public static void main(String[] args) {
        int a=10;
        int b=20;

        float c = (a+b) ;
        String s= "the sum of a + b is : " ;
        char c1= 'a' ;
        System.out.println(s+c);
        System.out.print(c1);

    }
    
}

class Demo{
    public static void main(String[] args) {
        byte b=126;
        int i=b;

        System.out.println(i+"type of i is :"+ ((Object)i).getClass().getSimpleName());
    }
}
# Program to get the Datatype

import java.io.InputStream;
import java.util.Scanner;

class Demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int y=100;

        System.out.println("enter a no");
        int i=sc.nextInt(); // it does not reads the new line it simply reads the integer value we need to explicitly call the new line .
        sc.nextLine();// explicitly calling 

        System.out.println("enter a value ");
        char c=sc.next().charAt(0);
        sc.nextLine();// explicitly calling 

        System.out.println("enter a String ");
        String s=sc.nextLine();

        // System.out.println("enter a value ");
        // char c=sc.next().charAt(0);

        System.out.println(i+" is a type of "+((Object)i).getClass().getSimpleName());
        System.out.println(y+" is a type of "+((Object)y).getClass().getSimpleName());
        System.out.println(s+" is a type of "+((Object)s).getClass().getSimpleName());
        System.out.println(c+" is a type of "+((Object)c).getClass().getSimpleName());
        
    }


}
# Program to get the Datatype
import java.lang.reflect.Field;

 class Main{
    public static int i=199;
    public static double d=9.8;
    public static String s= "Paras Yadav";
    

    // public static void main(String[] args) throws NoSuchFieldException, SecurityException {
    //     Field i=Demo.class.getField("d");
    //     Class value = i.getType(); // Only works with public field .
    //     System.out.println("the type of d is : "+value);
        
    // }
}
public class Demo{
  
    public static void main(String[] args) throws NoSuchFieldException, SecurityException {
        Field i=Main.class.getField("d");
        Class value = i.getType(); // Only works with public field .
        System.out.println("the type of d is : "+value);
        
    }
}

// explicit and implicit type casting 
class Demo{
    public static void main(String[] args) {
        int a=127;
        int c= 256;
        float f1= 9.8f;
        byte b= (byte)a; //explicit it is done by the compiler automatically .
        double d=a; //implicit it is done by the user manually .
        float f=c;
        int a1=(int)f1;
        System.out.println("the value of a1 : "+ a1 + ((Object)a1).getClass().getSimpleName());
        System.out.println("the value of b : "+ b + ((Object)b).getClass().getSimpleName());
        System.out.println("the value of d : "+ d + ((Object)d).getClass().getSimpleName());
        System.out.println("the value of f : "+ f + ((Object)f).getClass().getSimpleName());
    }
}
class Demo{
    public static void main(String[] args) {
        char c= 'D';
        int i=(int)c;//Explict type casting 
        System.out.println("after converting d into int we get ascii value as : "+i);
    }
}

// Input from user but this method gives ascii value and only applicable for single digit no 0-9 .
The System.in.read() method reads one byte of input as an integer. 
It returns the ASCII value of the character entered, not the character itself. 
For example, if you input A, it will return 65, the ASCII value of A
import java.io.IOException;

class hello{
    public static void main(String[] args) throws IOException {
        System.out.println("enter a no");
        int num=System.in.read();
        
        System.err.println(num-48);

        System.in.read();
        System.in.read();

        System.out.println("enter a another no");
        int num1=System.in.read();
        System.err.println(num1-48);
    }
}
    
//input from user using bufferreader

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class paras{
    public static void main(String[] args) throws IOException {
        InputStreamReader i=new InputStreamReader(System.in);
        BufferedReader bf=new BufferedReader(i);
        System.out.println("enter a no ");
        String a=bf.readLine();
        System.out.println("enter your name ");
        String s=bf.readLine();
        char c= s.charAt(0);
        double d=Integer.parseInt(a);
        int num=Integer.parseInt(a);
        System.out.println("your entered no is "+num);
        System.out.println("your entered no is "+d);
        System.out.println("your name is "+s);
        System.out.println("your character is "+c);
    }
}
    
// literals are the synthetic representation of fixed no .
// there are many ways to represent integer using literals . 
class Demo{
    public static void main(String[] args) {
        int num= 0b0101; // literals in Binary must start with 0b . 
        int num1=10004; // decimal they can be any sequence of digit 0-9 .
        int num2 =0256; // octal
        int num3 =0xABCDef; // HexaDecimal
        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(((Object)num3).getClass().getSimpleName());

    }
}
// Operators -> Arithmetic operator , Assignment operator ,Logical operator .
class Demo{
    public static void main(String[] args) {
        int a=10;
        int b=5;
        System.out.println("addition of a and b is : "+(a+b));
        System.out.println("subtraction of a and b is : "+(a-b));
        System.out.println("multiplication of a and b is : "+(a*b));
        System.out.println("division of a and b is : "+(a/b));
        System.out.println("modulus of a and b is : "+(a%b));
        System.out.println("power of a and b is : "+(Math.pow(a, b)));// give result in double .
        System.out.println("post-increment of a is : "+ a++);//here the value of a = 10 after increment it will become 11
        System.out.println("pre-increment of a is : "+ (++a));// here if we use pre-inc then value of a increment first and then print it means 11 becomes 12 and then printed . 
        System.out.println("post-increment of a is : "+ (a++));// here we are using post-inc which means the value first prints and them increments .
        System.out.println("incremented value of a is : "+ (a));

    }
}

// relational operator also called as comparision operator .
class Demo{
    public static void main(String[] args) {
        int x= 20;
        int y= 20;
        if(x>y){
            System.out.println(x + " is greater");
        }
        else {
            System.out.println(y + " is greater");
        }
        System.out.println((x<y) + " x is less then y");
        System.out.println((x>y) + " x is greater then y");
        System.out.println((x==y) + " x is equals to y");
        System.out.println((x<=y) + " x is less then equals to y");
        System.out.println((x>=y) + " x is greater then equals toy");
        System.out.println((x!=y) + " x is not equals to y");
    }
}
    
// Logical operator is used to combine two or more comparision operator .
class Demo{
    public static void main(String[] args) {
        int x=10;
        int y=10;
        int z=10;
        if((x>y) && (x>z)){
            System.out.println(x + " x is greater ");
        }
        else if ((y>x) && (y>z)){
            System.out.println(y+" y is greater");
        }
        else {
            System.out.println(z +" z is greater");
        }
    }
}
   
// for loop . Loops are used for iteration if you want to print a statement multiple time then we use loop .
class Demo{
    public static void main(String[] args) {
        for(int i=0;i<=5;)
        {
            System.out.println("day : "+ i);
            for(int j=0;j<9;)
            {
                System.out.println((j+9)+" - "+(j+10));
                j++;
            }
            i++;
        }
    }
}
 
// while loop 
class Demo{
    public static void main(String[] args) {
        int i=0;
        while (i<=5) {
            System.out.println("Day : "+i);  
            i++;
            int j=0;
            while (j<9) {
                System.out.println((j+9)+" - "+(j+10));
                j++;
            }
        }
    }
}

// do-while loop is used to print/execute atleast once when the condition is false . eg:-> when the service is not accessible over the internet then it must execute one statement like error , network problem,somthing went wrong etc .
class Demo{
    public static void main(String[] args) {
        int i=5;
        do{
            System.out.println( i+" Somthing went wrong");
        }while(i<=4);
        
    }
}

// switch statement 
import java.util.Scanner;

class Demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Day");
        String day=sc.nextLine();
        sc.close();
        switch (day) {
            case "monday", "tuesday" :
            System.out.println("6am");
                
                break;
            case "wednesday","thrusday","friday":
            System.out.println("7am");
                break;
            case "saturday","sunday":
            System.out.println("10am");
                break;
            default:
            System.out.println("invalid");
                break;
        }

    }
}

//switch statement
import java.util.Scanner;

class Demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Day");
        String day=sc.nextLine().toLowerCase();
        sc.close();
        switch (day) {
            case "monday", "tuesday" -> System.out.println("6am");
                
                
            case "wednesday","thrusday","friday"-> System.out.println("7am");
                
            case "saturday","sunday"-> System.out.println("10am");
             
            default-> System.out.println("invalid");
                
        }

    }
}

// switch statement
import java.util.Scanner;

class Demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Day");
        String day=sc.nextLine().toLowerCase();
        sc.close();
        String result="";
        switch (day) {
            case "monday", "tuesday" -> result="6am";
                
                
            case "wednesday","thrusday","friday"-> result="7am";
                
            case "saturday","sunday"-> result="10am";
             
            default-> result="invalid";
       
                
        }
        System.out.println(result);

    }
}

//switch statement
import java.util.Scanner;

class Demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Day");
        String day=sc.nextLine().toLowerCase();
        sc.close();
        String result="";
        result=switch (day) {
            case "monday", "tuesday" -> "6am";
                
                
            case "wednesday","thrusday","friday"->"7am";
                
            case "saturday","sunday"-> "10am";
             
            default-> "invalid";
       
                
        };
        System.out.println(result);

    }
}

//switch statement .
import java.util.Scanner;

class Demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Day");
        String day=sc.nextLine().toLowerCase();
        sc.close();
        String result="";
        result=switch (day) {
            case "monday", "tuesday" : yield result="6am";
                
                
            case "wednesday","thrusday","friday" : yield  result="7am";
                
            case "saturday","sunday": yield result="10am";
             
            default: yield result="invalid";
       
                
        };
        System.out.println(result);

    }
}
    
// classes and object A class is a blueprint to create an object in which we have methods and variables . 
class calculator{
    public int sum(int x,int y)
    {
        int r=x+y;
        // System.out.println("sum is : "+ r);
        return r;
    }
}
class Demo{
    public static void main(String[] args) {
        int a=10;
        int b=20;
        calculator calc=new calculator();// here "clac" is a refrence variable and (new calculator()) is a Object .
        int result=calc.sum(a,b); // calling method with parameters .
        System.out.println("sum of a and b is "+result);
    }
}

// stack and heap

import java.util.Scanner;

class hello{
    int num=5; // instance variable stored in heap .
    // every method has its own stack and contain local variables .
     public void greet(){
        System.out.println("hello everyone ");
    }
     public String Give(int cost){
        if(cost>=10)
            return "pen";
        else
        return "nothing";
    }
}
public class Demo{
    // Main method stack contains local variable and refrence variable .Refrence variable conatins the address of an object to which it refers to .
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the cost for pen");
        int cost=sc.nextInt();
        sc.close();
        hello h=new hello();// this object is created in heap .
        hello h1=new hello();// this one is also created in heap .
        h.num=8;
        System.out.println(h.num);
        System.out.println(h1.num);
        h.greet();
        String result=h.Give(cost);
        System.out.println(result);
    }
}

// User defined array  
// Single dimentional array
import java.util.Scanner;

class Demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int s=sc.nextInt();
        int arr[]=new int[s];
        System.out.println("enter the elements in array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements in an arrays are ");
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
        sc.close();
    }
}

// Multi-dimentional array

import java.util.Scanner;

class Demo{

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the no of row ");
        int r=sc.nextInt();
        System.out.println("enter the no of column");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("enter the no of elements in array");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
            
        }
        System.out.println("Elements in an array are : ");
        for(int n[]:arr){
            for(int m:n){
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }
}

// array with user defined class and variables .
import java.util.Scanner;
class Student{
    int rollno;
    String name ;
    int marks;
    public Student(int rollno, String name, int marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }
    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
    }
    
    
}

class Demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int s=sc.nextInt();
        Student student[]=new Student[s];
        for(int i=0;i<student.length;i++){
            System.out.println("enter the student "+(i+1)+" rollno");
            int r=sc.nextInt();
            System.out.println("enter the student name ");
            sc.nextLine();
            String n=sc.nextLine();
            System.out.println("enter the students marks");
            int m=sc.nextInt();
            student[i] = new Student(r, n, m);
            sc.close();
        }
    
    for(Student students: student)
    {
        System.out.println(students);

    }
}
}

//Enhanced for loop

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Demo{
    
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

//String is a class we can perform certain operation on it .
class Demo{
    public static void main(String[] args) {
        String str=new String("   paras is an engineer or backend developer or java developer    ");
        String str1=new String("dev");
        String[] words= str.split(" or ");
        for(String s:words){
            System.out.println(s);
        }
        System.out.println(str.trim());
       
        System.out.println(str.concat(str1));
    }
}

// Strings 
class Demo{
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
// stringbuffer and string builder are used to create mutable string 
class Demo1{
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("paras");
        System.out.println(sb.hashCode());// hence it changes the same string 
        sb.append("yadav");
        sb.insert(5, " Disha ");
        System.out.println(sb.hashCode());// because we get the same address after modify the string .
        System.out.println(sb);
    }
}

// Static variable .
class Demo{
    int rollno;
    String name;
    static int marks=100 ; // if we declare a variable as static then it is independent of object or commom to all .
    public void show(){
        System.out.println("rollno = "+ rollno+" name = "+ name+" marks = "+marks);
    }
    public static void main(String[] args) {
      Demo o=new Demo();
      o.name="paras";
      o.rollno=1;
      //Demo.marks=99; // we can also use class name insted of object. for static variable ..
      Demo o1=new Demo();
      o1.name="dev";
      o1.rollno=2;
      o.show();
      o1.show();
    }
}

// static method . We cannot use non static variable inside static method directly .
class Demo{
    int rollno;
    String name;
    static int marks=100 ; // if we declare a variable as static then it is independent of object or commom to all .
    public void show(){
        System.out.println("rollno = "+ rollno+" name = "+ name+" marks = "+marks);
    }
    public static void show1(Demo o1){
        System.out.println("rollno is : "+ o1.rollno +" Name is : "+ o1.name+" Marks is : "+marks);
    }
    public static void main(String[] args) {
      Demo o=new Demo();
      o.name="paras";
      o.rollno=1;
      //Demo.marks=99; // we can also use class name insted of object. for static variable ..
      Demo o1=new Demo();
      o1.name="dev";
      o1.rollno=2;
      o.show();
      o1.show();
      Demo.show1(o1);
    }
}

// Encapsulation is the process of binding/wrapping data with method to make your program more secure from the outside world .
class Demo{
    private String name ;
    private int age;
    private int marks;
    private String city;

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
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    
    public static void main(String[] args) {
        Demo d=new Demo();
        d.setName("paras");
        d.setAge(20);
        d.setCity("delhi");
        d.setMarks(98);
        System.out.println(d.getAge()+" "+d.getCity()+" "+d.getMarks()+" "+d.getName());
    }
    
}

// Getters and setters 
class Demo{
    private String name ;
    private int age;
    private int marks;
    private String city;

   // public String getName() 
    public String abc() // we can use any method name .it is not mandatory to use getName or setName but they give us a metadata that shows the intention of user .
    {
        return name;
    }
   // public void setName(String name) 
   public void ABC(String name) // we can use any method name .it is not mandatory to use getName or setName but they give us a metadata that shows the intention of user .
    {
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
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    
    public static void main(String[] args) {
        Demo d=new Demo();
        // d.setName("paras");
        d.ABC("Paras");
        d.setAge(20);
        d.setCity("delhi");
        d.setMarks(98);
        System.out.println(d.getAge()+" "+d.getCity()+" "+d.getMarks()+" "+d.abc());
    }
    
}

//Method overloading -> 2 or more method can have same name but different parameters .

import java.util.Scanner;

class Demo{
    public int sum(int a,int b,int c){
        return (a+b+c);
    }
    public int sum(int a ,int b){
        return (a+b);
    }
    public void sum(double a,int b){
        System.out.println("the sum of two no is : "+a+b);
    }
    public static void main(String[] args) {
        Demo d=new Demo();
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first no");
        int i=sc.nextInt();
        System.out.println("enter the second no");
        int j=sc.nextInt();
        System.out.println("enter the double value ");
        double g=sc.nextDouble();
        d.sum(g, j);
        int r=d.sum(i,j);
        System.out.println("the sum of 2 no is : "+r);
        System.out.println("enter the third no");
        int x=sc.nextInt();
        int c=d.sum(i,j,x);
        System.out.println("the sum of 3 no is : "+c);

        sc.close();
    }
 }
   
 // this keyword represents the current class object . current object ia an object which is calling the method .
 class Demo{
    String name ;
    int age ;
    int marks;
    String city;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name; // if we have local variable and instance variable of the same name then we use this keyword .
    }// To differenciate between local and instance variable  we use this keyword
    public int getAge() {
        return age;
    }
    public void setAge(int age,Demo d) {
        d.age = age;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public static void main(String[] args) {
        Demo d =new Demo();
        d.setName("paras");
        d.setAge(22,d); //we can also pass object itself 
        d.setCity("Ghaziabad");
        System.out.println(d.getName()+" "+d.getCity()+" "+d.getAge());
        
    }
}
    

// constructor is a special method having name as that of class name .
//it does not have any return type or even void .
//it execute automatically when an object is created .

class Demo{

    String name ;
    int age ;
    int rollno ;
    public Demo(){
        System.out.println("object is created");
         name="paras";
    }
    public Demo(String n,int a,int r){
        name=n;
        age=a;
        rollno=r;
    }
    public void show(){
        System.out.println(name+" "+age+" "+rollno);
    }
    public static void main(String[] args) {
    Demo d=new Demo();//Default constructor .
    Demo d1=new Demo("paras",21,2);//parameterized constructor .
    d.age=22;
    d.rollno=1;
    d.show();
    d1.show();

    }
}

//Anonymous object are those object that does not have any name .
//-We cannot use the same Anonymous object again to call the other method .it can be use only for one time .
class A{
    public A(){
        System.out.println("object is created");
    }
    public void show(){
        System.out.println("in show");
    }
    public void show1(){
        System.out.println("in show 1");
    }
    public static void main(String[] args) {
        new A().show();// Anonymous object is used only once. To call other method need to create another object . 
        new A().show1();
        
    }
}

// Difference between division and floor division .
class Demo{
    public static void main(String[] args) {
        int a=15;
        int b=4;
        double c=4.0;            // it gives quotient .
        System.out.println(a/c); // it can work with double and float vallues 
        System.out.println(Math.floorDiv(a,b));// it does not supports floatiing points value .
        System.out.println(a%b);// it gives remainder 
    }
}

// Inheritance supports reusability .
// Single inheritance .
class calculator{

    public int add(int a,int b)
    {
        return a+b;
        
    }
    public int sub(int a,int b){
        return a-b;
    }
    
}
class advCalculator extends calculator{
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }
}
class Demo{
    public static void main(String[] args) {
        advCalculator calc=new advCalculator();
        int r=calc.add(3, 4);
        int r1=calc.sub(4, 2);
        int r2=calc.mul(4, 5);
        int r3=calc.div(15, 3);
        System.out.println("addition of a and b is : "+r);
        System.out.println("subtraction of a and b is : "+r1);
        System.out.println("multiplicaltion of a and b is : "+r2);
        System.out.println("division of a and b is : "+ r3);

    }
}

// Multilevel inheritance .
class A
{
    public void show(){
        System.out.println("in A show");
    }
}
class B extends A
{
    public void show1(){
        System.out.println("in B show");
    }
}
class C extends B
{
    public void show2(){
        System.out.println("in C show");
    }
}
class Demo{
    public static void main(String[] args) {
        C c=new C();
        c.show();
    }
}

// Hierarchical inheritance .
class A
{
    public void show(){
        System.out.println("in A show");
    }
}
class B extends A
{
    public void show1(){
        System.out.println("in B show");
    }
}
class C extends A
{
    public void show2(){
        System.out.println("in C show");
    }
}
class Demo{
    public static void main(String[] args) {
        C c=new C();
        c.show();
        c.show2();
        B b=new B();
        b.show();
        b.show1();
    }
}

// Hybrid inheritance .
class GrandFather
{
    public void show(){
        System.out.println("GrandFather show");
    }
}
class Father extends GrandFather
{
    public void show1(){
        System.out.println("Father show");
    }
}
class Son extends Father
{
    public void show2(){
        System.out.println("Son show");
    }
}
class Daughter extends Father{
    public void show3(){
        System.out.println("Daughters show");
    }
}
class Demo{
    public static void main(String[] args) {
      Son s=new Son();
      s.show();
      s.show1();
      s.show2();
      Daughter d=new Daughter();
      d.show();
      d.show1();
      d.show3();
    }
}

// Multiple inheritance .where a class can inherit properties and methods from more than one parent class.

interface A{
    void show();
}
interface B{
    void show1();
}
class C implements A,B{
    public void show(){
        System.out.println("Interface A");
    }
    public void show1(){
        System.out.println("Interface B");
    }
}
class Demo{
    public static void main(String[] args) {
        C c=new C();
        c.show();
        c.show1();
    }
}

// This and super keyword 
class A{
    public A(){
        System.out.println("Default constructor of class A");
    }
    public A(int n){
        System.out.println("Parametrized constructor of class A "+n);
    }
}
class B extends A{
    public B(){
         this(6);
        System.out.println("Default constructor of class B");
    }

    public B(int n){
        super(n);
        System.out.println("Parametrized constructor of class B "+n);
    }
}
class Demo{
    public static void main(String[] args) {
        B b=new B(5);
        B b1=new B();

        
    }
}

// Method overriding 
class A{
    public void show(){
        System.out.println("In A Show");
    }
}
class B extends A{
    @Override
    public void show(){
        System.out.println("In B Show");
    }
}
class Demo{
    public static void main(String[] args) {
        B b=new B();
        b.show();
    }
}

// Abstraction 

abstract class A{
    public abstract void show();
    public abstract int greet(int a);
    public void config(){
        System.out.println("In A's configuration ");
    }
}
class B extends A{
    public void show(){
        System.out.println("In A's show");
    }
    public int greet(int a){
        System.out.println("In A's Greet "+a);
        return a;
    }
}
class Demo{
    public static void main(String[] args) {
        B b=new B();
        b.config();
        b.show();
        b.greet(10);
    }
}

// abstraction
// we cannot create the object of abstract class but we can create refrence variable of abstract class and object of extended class .
abstract class A{

    public abstract void show();
    public abstract int sum(int a, int b);
    public void config(){
        System.out.println("In A config");
    }
}
class B extends A{

    @Override
    public void show() {
        System.out.println("in B show ");
           }

    @Override
    public int sum(int a, int b) {
        System.out.println("sum of a and b : "+ (a+b));
        return a+b;
         }
}
class Demo{
    public static void main(String[] args) {
        A b=new B(); // we cannot create the object of abstract class but we can create refrence variable of abstract class and object of extended class .
        b.config();
        b.show();
        int r=b.sum(10, 20);
        System.out.println(r);
    }
}

// Dynamic Method Dispatch decides which method() is call of which class .
class A{
    public void show(){
        System.out.println("in A show");
    }
    public void greet(){
        System.out.println("in A's greet ");
    }
}
class B extends A{
    public void show(){
        System.out.println("in B show ");
    }
}
class C extends A{
    public void show(){
        System.out.println("In c show ");
    }
}
class Demo{
    public static void main(String[] args) 
    {
        A obj=new A();
        obj.show();

        obj=new B();
        obj.show();

        obj=new C();
        obj.show();;
    }
}
// upcasting and downcasting 

class A{
    public void show(){
        System.out.println("in A show");
    }
    public void greet(){
        System.out.println("in A's greet ");
    }
}
class B extends A{
    public void show(){
        System.out.println("in B show ");
    }
}
class C extends A{
    public void show(){
        System.out.println("In c show ");
    }
}
class Demo{
    public static void main(String[] args) 
    {
        A obj=new B(); // UpCasting we have object of child class and refrence variable of parent class .
        obj.greet();
        
    }
}

// DownCasting 
class A{
    public void show(){
        System.out.println("in A show");
    }
    public void greet(){
        System.out.println("in A's greet ");
    }
}
class B extends A{
    public void show(){
        System.out.println("in B show ");
    }
}
class C extends A{
    public void show(){
        System.out.println("In c show ");
    }
}
class Demo{
    public static void main(String[] args) 
    {
        A obj=new B(); // UpCasting we have object of child class and refrence variable of parent class .
        obj.greet();

        B obj1=(B) obj; // DownCasting 
        obj1.show();
        
    }
}

// Final Keyword is used to create constant variable( Not changeable ) , method( Not overrideable ) or class ( Not extendable )  
//final class A // if we create a class final then it cannot be extended
class A{

     final int num= 10;
     public final void greet(){
        System.out.println("hello every one ");
     }
}
class B extends A{
    // public void greet(){ // this method cannot be overridden because of final method .
    //     System.out.println("good morning ");
    // }
    public String greet1(){
        return "paras yadav";
    }
}
class Demo{
    public static void main(String[] args) {
        B b=new B();
       // b.num=20; we cannot change the num value because it is declared as a final variable .
       b.greet();
       String s=b.greet1();
       System.out.println(s);

    }
}

// Tostring Method
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

// wrapper class in java is a class whose object wraps or contains the primitive data type .
// Every primitive data type have a corresponding Wrapper class .
class paras{
      
    public static void main(String[] args) {
        String num="12"; // string type
        int m=19;
        Double d=Double.parseDouble(num);// Converted into double and stored in wrapper class Double .
        Integer num1=Integer.parseInt(num) ; // auto-boxing .// Converted into integer and stored in wrapper class Integer .
        Integer s1=Integer.valueOf(num);
        Integer i=Integer.valueOf(m);
        String s = Integer.toString(num1); // converting from integer to String .
        int n=Integer.valueOf(s);  // auto-unboxing . extracting string value form wrapper class and converted into integer 
        int n1=num1.intValue();

        System.out.println(((Object)num1).getClass().getSimpleName());
        System.out.println(((Object)s).getClass().getSimpleName());
        System.out.println(((Object)n).getClass().getSimpleName());
        System.out.println(n1);

    }
}

// Inner class 
class A{
    int num=20;
    public void show(){
        System.out.println("in A show ");
    }
    class B{
        int num=10;
        public void greet(){
            System.out.println("in B greet ");
        }
        class C{
            int num=0;
            public void config(){
                System.out.println("in C config");
            }
        }
    }

}
class Demo{
    public static void main(String[] args) {
        A a=new A();
        a.show();
        System.out.println(a.num);

        A.B b = a.new B();
        b.greet();
        System.out.println(b.num);

        A.B.C c = b.new C();
        c.config();
        System.out.println(c.num);

    }
}

// Anonymous inner class use for overriding .
class A{
    public void show(){
        System.out.println("in A show");
    }
    public static void main(String[] args) {
        A a=new A()
        {
            
            public void show(){
                    System.out.println("in B show");
            }
            

        };
        a.show();
        
    }
}

// Abstract Anonymous Inner class .
abstract class A{
    public abstract void greet();
    public abstract void config();

    public void show()
    {
        System.out.println("in A show");
    }
    public static void main(String[] args) {
        A a=new A() {
            public void greet(){
                System.out.println("in A greet");
            }
            public void config(){
                System.out.println("in A config ");
            }
        };
        a.config();
        a.greet();
        a.show();
    }
}
//
// Enumeration in sort also called enum 
// Enum serves the purpose of representing a group of named constant .

enum Laptop{
    Mackbook(2000), XPS(),Surface(1500),Thinkpad(1800);

    int price; // BY default final and static 
    private Laptop(){
        price=2000;
    }
    private Laptop(int price){  // In enum only private modifier is legal .because we are using the object in the same class itself .
        this.price=price;
        System.out.println("in Laptop "+this.name());
    }

}
class Demo{
    public static void main(String[] args) {
        Laptop l=Laptop.Mackbook;
        System.out.println(l + " "+(l.price));
        for(Laptop l1: l.values()){
            System.out.println(l1 + " : "+l1.price);
        }
    }

}

// Interface only defines a set of matter but does not implement them .
// A class that implements the interface coumplsory/need to implement all the methods that are define in interfaces .
interface A{
      void show();
      int sum(int n,int n1);
      
} 
interface B{
    int Age(int a);
}
class C implements A,B{

    @Override
    public int Age(int a) {
        return a;
    }

    @Override
    public void show() {
        System.out.println("in C show ");
   }

    @Override
    public int sum(int n,int b) {
        return n+b;
     }
    
}
class Demo{
    public static void main(String[] args) {
        C c=new C();
       int r= c.Age(20);
        int r1=c.sum(10,9);
        System.out.println(r);
        System.out.println(r1);
        c.show();
    }
}

// Enum 
enum status{
    Running, Successfull, Pending , Failed ;
}
class Demo
{
    public static void main(String[] args) 
    {
        status s=status.Running;
        System.out.println(s);

        for(status s1 : s.values() ){
            System.out.println(s1);
        }
    }
}

// Functional interface is a type of interface in which we can only define one method .

@FunctionalInterface
interface A{
    void show();
    
}
public class Demo {

    public static void main(String[] args) {
        A b=()->{
                System.out.println("In A show");

            };
            b.show();
            
        };
}

//
@FunctionalInterface
interface A{
    int sum(int x,int y);
}
public class Demo {
    public static void main(String[] args) {
        A b=(a,c)->

            a + c ;
           int r= b.sum(2,3);
           System.out.println(r);

        };

}

// Enum with switch .
enum name{
    paras,dev,rishabh,aadi;
    
}
class Demo{
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


//  Custom Exception .
class MyException extends Exception
{
    public MyException(String string){
        super(string);
    }
}

class Demo 
{
 
    public static void main(String[] args) {
        int i=10;
        int j=0;
       
        // try block is used to hold one critical statement/operation  .
        // Each try block contains one critical statement/operation . 
        try {
             j=0%i;
            if(j==0)
                throw new MyException("positive no");
        }
        catch(MyException e1){
        
            System.out.println("conot divide by zero "+e1);
        }
        catch (Exception e) { // always defines in the last .
            System.out.println("somthing went wrong "+e);;
        }
       
        System.out.println("bye");

    }
}

// Exception-Handling .
class Demo{
    public static void main(String[] args) {
        int i=10;
        int j=0;
        String name[]=new String[5];
        try {
            j=j/i;
            if(j==0)
            System.out.println("no Arithmetic exception");
            throw new ArithmeticException("hello");
        } 
        catch (ArithmeticException e) {
            System.out.println("cannot divide by zero"+e);
        }
        try {
            name[4]="paras";
            if(name.length==5)
             throw new ArrayIndexOutOfBoundsException("hi");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("stay in your limits "+e);
        }
        System.out.println(i);
        System.out.println("Bye");
    }
}

// Input Stream reader .
import java.io.FileReader;
import java.io.IOException;

class Demo{


    public static void main(String[] args) throws IOException
    {
       
        FileReader rd=new FileReader("example.txt");
        int character=rd.read();
        while(character !=-1){
            System.out.print((char)character);
            character=rd.read();
        }
        rd.close();
    }
}

// Readind file using BufferReader .
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


class Demo{
    public static void main(String[] args) throws IOException {

        BufferedReader bf=new BufferedReader(new FileReader("example.txt"));
        String string=bf.readLine();
        while (string!=null) {
            System.out.println(string);
            string=bf.readLine();
        }
        bf.close();
    }
}

// reading file using fileinputstream
import java.io.FileInputStream;
import java.io.IOException;

class Demo{
    public static void main(String[] args) throws IOException {
        FileInputStream file=new FileInputStream("example.txt");
        int character=file.read();
        while (character !=-1) {
            System.out.print((char)character);
            character=file.read();
            }
            file.close();
    }
}

// reading file using normal collection list .
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

class Demo{
    public static void main(String[] args) throws IOException {
       List<String> string = Files.readAllLines(Path.of("example.txt"));
       for(String s: string){
        System.out.println(s);
       }
       
    }
}

// reading data from file using scanner .
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Demo{
    public static void main(String[] args) throws FileNotFoundException 
    {
        Scanner sc=new Scanner(new File("example.txt"));
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());   
        }
        sc.close();
    }
}

// Thread and multithreading 
class A extends Thread{
    public void run(){
        for(int i=0;i<1000;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        System.out.println("hi "+i);}
      
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
class Demo{
    public static void main(String[] args) {
        A a=new A();
        B b=new B();

        a.start();
        b.start();
    }
}

// Thread with inner class 
class A extends Thread{
    public void run(){
        for(int i=0;i<1000;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        System.out.println("hi "+i);}
      
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
}

class Demo{
    public static void main(String[] args) {
        A a=new A();
        A.B b=a.new B();

        a.start();
        b.start();
    }
}

// Runnable is an interface . we need to implement it first .
class A implements Runnable{
    public void run(){
        for(int i=0;i<1000;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        System.out.println("hi "+i);}
      
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
class Demo{
    public static void main(String[] args) {
        Runnable r=new A();
        Runnable r1=new B();

        Thread t1=new Thread(r);
        Thread t2=new Thread(r1);
        t1.setPriority(10);
        System.out.println(t1.getPriority());

        t1.start();
        t2.start();
    }
}

// thread with lambda expression .
class Demo{
    public static void main(String[] args) 
    {

    

        Runnable r=()->{
                for(int i=0;i<1000;i++){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        
                        e.printStackTrace();
                    }
                System.out.println("hi "+i);
                }
            
            };
        

        Runnable r1=()->{
                for(int i=0;i<1000;i++){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("hello "+i);
                };
            };
            
            Thread t1=new Thread(r);
            Thread t2=new Thread(r1);
            t1.setPriority(10);
            System.out.println(t1.getPriority());
        
            t1.start();
            t2.start();

       
    }
}

// use of join() method 
class A extends Thread{
    int count;
    // public void increment(){
    //     count++;
    // }
    
    public void run(){
        
        for(int i=0;i<1000;i++){
            count=count+1;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
           
       }
     
    }
}
class B extends Thread{
    int count;
        public void run(){
            for(int i=0;i<1000;i++){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                count=count+1;
               
            }
        }
    }


class Demo{
    public static void main(String[] args) throws InterruptedException {
        
        
        A a=new A();
        B b=new B();
        
        a.start();
        b.start();
        
        a.join();
        b.join();
        
        System.out.println("Final count: " + (a.count + b.count));
    }
}

// stream api :-> The Stream API in Java provides powerful methods for processing collections of data. Among them, filter, map, and reduce are key operations used for transforming and processing streams.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Demo{
    public static void main(String[] args) {

        List<Integer> num= Arrays.asList(4,5,3,8,6,9,10,23,24);

        
        // # ArrayList
        // 1. Fully mutable. You can add, remove, and modify elements.

        // 2. Not backed by any array; it maintains its own internal dynamic array for storage.
        // Changes to the ArrayList do not affect the original array (if used during initialization).
        
        // # Array.asList
        // 1.The list is partially mutable. You can modify existing elements, but you cannot add or remove elements.

        // 2.The list is backed by the original array. Any changes made to the list are reflected in the array, and vice versa.

         
        

        // num.add(21);
        // num.add(12);
        // num.add(23);
        // num.add(20);
        // num.add(10);
        // num.add(11);
        
        System.out.println(num);
        
    //    int num1= num.stream().filter(n-> n%2==0).map(p->p*2).reduce(0,(e,c)->e+c);
    //     num.stream().forEach(n->System.out.println(n));
    //    System.out.println("final output : "+num1);

   // Streams are consumable, meaning you can only use them once. After a terminal operation (e.g., forEach, reduce), the stream is closed, and any further operations on it will result in an IllegalStateException
    Stream<Integer>s0=num.stream();
    Stream<Integer>s1=s0.filter(n->n%2==0);
    // Stream<Integer>s4=s1.filter(n->n>6);// we canot use any operation twice in stream .
    // s1.forEach(n->System.out.println(n));
    Stream<Integer>s2=s1.map(s->s*2);
    int num1=s2.reduce(0,(e,c)->e+c);//reduce returns the single value .
    System.out.println(num1);// Reduce Combines elements into a single result using an accumulator function.
    
    }

}

// comparator vs comparable .  

import java.util.ArrayList;
import java.util.*;

class A{
    public static void main(String[] args) {
        List<Integer>num=new ArrayList<>();
        num.add(12);
        num.add(13);
        num.add(14);
        num.add(15);
        num.add(16);
        num.add(11);

        Comparator<Integer> com=new Comparator<Integer>() {
            
            public int compare(Integer i,Integer j){
                if(i>j){
                    return 1;
                }
                else
                return -1;
            }
        };
        Collections.sort(num,com);
        System.out.println(num);
        
    }
}
// comparator 
import java.util.*;

class Student{
    int age;
    String name ;
    public Student(int a,String n){
        age=a;
        name=n;
    }
    
    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public static void main(String[] args) {
        List<Student> stud=new ArrayList<>();
        stud.add(new Student(21,"paras"));
        stud.add(new Student(20,"rishabh"));
        stud.add(new Student(22,"Vipul"));
        stud.add(new Student(19,"aadi"));
        stud.add(new Student(22,"dev"));

        Comparator<Student> com=new Comparator<Student>() {
            public int compare(Student a,Student n){
                if(a.age>n.age)
                    return 1;
                else
                    return -1;
            }

           
        };

        Collections.sort(stud,com);
        
        stud.forEach(n->System.out.println("using foreach : "+n));

        for(Student s:stud){
            System.out.println("using Enhance for loop : "+s);
        }
        System.out.println(stud);

        Iterator<Student> s=stud.iterator();
        while(s.hasNext())
        System.out.println("using iterator "+s.next());

        System.out.println(stud.size());



    }
        
}

// comparable
import java.util.*;

class Student implements Comparable<Student>{
    int age;
    String name ;
    public Student(int age,String name){
        this.age=age;
        this.name=name;
    }
    
    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Student o) {
        if(o.name.length()>this.name.length()){
            return 1;
        }else
        return -1;
    }

    public static void main(String[] args) {
        List<Student> stud=new ArrayList<>();
        stud.add(new Student(21,"paras"));
        stud.add(new Student(20,"rishabh"));
        stud.add(new Student(22,"Vipul"));
        stud.add(new Student(19,"aadi"));
        stud.add(new Student(22,"dev"));

        Collections.sort(stud);
        
        stud.forEach(n->System.out.println("using foreach : "+n));

        for(Student s:stud){
            System.out.println("using Enhance for loop : "+s);
        }
        System.out.println(stud);

        Iterator<Student> s=stud.iterator();
        while(s.hasNext())
        System.out.println("using iterator "+s.next());

        System.out.println(stud.size());



    }
}

// Collection is used to store multiple objects.
// A framework is a set of class and interface . which provides a ready-made architecture .

import java.util.*;

class A{
    public static void main(String[] args) 
    {
        List<Integer> num=new LinkedList<>();

        num.add(12);
        num.add(11);
        num.add(15);
        num.add(23);
        num.add(25);
        num.add(20);

        System.out.println(num.add(34));
        System.out.println(num.set(5, 8));
        System.out.println(num.remove(5));
        System.out.println("size of list : "+num.size());
        System.out.println(num);


    }
}

// list is an ordered collection of elements . list is an interface and ArrayList ,LinkedList,Stack,Vector are classes that implements List .

import java.util.*;

class B{
    public static void main(String[] args) {
        List<Integer> list=new Stack<>();

        list.add(23);
        list.add(25);
        list.add(45);
        list.add(20);

        System.out.println("Size of List is : "+list.size());
        System.out.println(list.add(56));
        System.out.println("Removed element from first : "+list.removeFirst());
        System.out.println(list.get(0));
        System.out.println(list);

    }

}

// set is an unordered collection of objects . set doesnot allow duplicate elements to store in it .
// we cannot fetch the elements from the set using indexing . because set does not supports indexing .
import java.util.*;

class Demo{
    public static void main(String[] args) {
        
        Set<Integer> s=new HashSet<>();
        s.add(25);
        s.add(25);
        s.add(23);
        s.add(20);
        List<Integer> a= Arrays.asList(56,24,12,13);
       // System.out.println(s.removeAll(s));
        System.out.println(s.addAll(a));
        System.out.println(s.remove(20));
        System.out.println("set is : "+s);

    }
}
*/







