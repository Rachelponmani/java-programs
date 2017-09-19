abstract class AbstractDemo
{
int num;
String s;
public void display()
{
System.out.println("name:"+s);
}
abstract public void printMsg();
abstract public void displayMsg();
}
abstract class Demo extends AbstractDemo
{
int num=10;
String name=rrr;
}
public void printMsg()
{
System.out.println("this implementation of abstract method");
}
}
class sample extends Demo implements MyInt
{
public void displayMsg()
{
System.out.println(" all abstract method implemented");
}
public void MyMsg()
{
System.out.println("Hii");
}
}
public static void main(String[] args)
{
MyInt obj = new Sample
sobj.displayMsg();
sobj.printMsg();
sobj.display();
sobj.MyMsg();
