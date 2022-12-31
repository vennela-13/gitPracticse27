class Car {
void run()
{
System.out.println("hi"); 
}
}
class Audi extends Car {
void run()
{
System.out.println("hello");
}
public static void main(String args[])
{
Car b= new Audi();    //upcasting
b.run();
}
}