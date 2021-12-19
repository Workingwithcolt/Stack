import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
    int age;
    String name;
    public Exception(String name,int age){
        this.name = name ;
        this.age = age;
    }
    public void display(){
        System.out.println("Name of student is "+name);
        System.out.println("Age of the student is "+age);
    }
//
//    public static void main(String[] args) {
//        int age ;
//        boolean value = false;
//        Scanner s = new Scanner(System.in);
//            try{
//                System.out.println("Enter the age ::");
//                age = s.nextInt();
//            }catch (InputMismatchException e){
//                System.out.println("Please input the valid data");
//            }
//    }
public static void main(String[] args) {
    try{
        int data = 25/0;
        System.out.println("0");
    }catch(ArithmeticException e){
        System.out.println("ArithmeticException is raised");
    }finally {
        System.out.println("finally block is executed");
    }
}
}
