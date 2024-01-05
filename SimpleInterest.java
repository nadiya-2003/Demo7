//Simple interest
import java.util.Scanner;
class SimpleInterest
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int p=scob.nextInt();
double r=scob.nextDouble();
double t=scob.nextDouble();
double si=p*t*r/100;
System.out.println(si);
}
}