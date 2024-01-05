class Student1
{
int id;
String name;
Student1(int i,String n)
{
id=i;
name=n;
}
void display()
{
System.out.println(id+" "+name);
}
public static void main(String args[])
{
Student1 s1=new Student1(1001,"kiran");
Student1 s2=new Student1(3000,"Mahesh");
s1.display();
s2.display();
}
}