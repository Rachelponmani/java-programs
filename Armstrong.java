import java.util.Scanner;
public class Armstrong{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
int n=123,a,temp,sum=0;
temp=n;
while(n>0)
{
a=n%10;
n=n/10;
sum=sum+(n*n*n*);
}
if(temp==sum)
System.out.println(" This is armstrong num");
else
System.out.println(" This is not  armstrong num");
}
}
