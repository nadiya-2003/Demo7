import java.util.Scanner;
class ArrayKey
{
public static void main(String args[])
{
int n,x,flag=0,i=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter the no.of elements you want in an array:");
n=s.nextInt();
int a[]=new int[n];
System.out.println("Enter all the elements:");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
System.out.println("Enter the element you want to find:");
x=s.nextInt();
for(i=0;i<n;i++)
{
if(a[i]==x)
{
flag=1;
break;
}
}
if (flag==1)
{
System.out.println("Element found at positin:"+(i+1));
}
else
{
System.out.println("Element is not found ");
}
}
}



