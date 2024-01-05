//this:refer to the  current class instance variable
class Studentt
{
int rollno;
String name;
float fee;
Studentt(int rollno,String name,float fee)
{
this.rollno=rollno;
this.name=name;
this.fee=fee;
}
void display()
{
System.out.println(rollno+" "+name+" "+fee);
}
public static void main(String args[])
{
Studentt s1=new Studentt(10001,"Hasini",60000);
Studentt s2=new Studentt(10001,"Siddu",50000);
s1.display();
s2.display();
}
}

