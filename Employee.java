import java.util.Scanner;
public class Employee
{
String name;
String salary;
int id;
int addr;
int age;
public void accept()
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter employee name");
System.out.println("Enter employee salary");
System.out.println("Enter employee id");
System.out.println("Enter employee addr");
System.out.println("Enter employee age");
}
public void display()
{
System.out.println("Rachel");
System.out.println("20000");
System.out.println("12");
System.out.println("chennai");
System.out.println("21");
}
public static void main(String[] args)
{
Employee employ = new Employee();
employ.accept();
employ.display();
}
}