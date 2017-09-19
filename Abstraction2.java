abstract class Phn
{
Phn();
{
{System.out.println("phn is created");}
}
abstract void run();
void  changed()
{
{System.out.println(" changed");}
}
class Apple extends Phn
{
void run()
{
{System.out.println("running");}
}
class Abstraction2
{
public static void main(String[] args)
{
Phn obj = new Apple();
obj.run();
}
}



