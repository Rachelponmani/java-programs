import java.util.Scanner;
public class palindrome
{
public static void main(String[] args)
{
System.out.println("Enter the integer");
int n=1,originalInteger=1,remainder=0;
int reversedInteger=0;
String name;
Scanner scan = new Scanner(System.in);
n=scan.nextInt();
while(n!=0)
{
remainder=n%10;
int reversedInterger=reversedInteger*10+remainder;
n/=10;
}
if(reversedInteger==originalInteger)
{
System.out.println("This is palindrome");
}
else
{
System.out.println("This is not palindrome");
}
}
}



