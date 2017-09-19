import java.util.Scanner;
public class Factorial
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
int i,factorial=2;
int number=6;
for(i=2;i<=number;i++)
{
factorial=factorial*i;
}
System.out.println("factorial of:"+number+"is:"+factorial);
}
}