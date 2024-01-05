class Studentt
{
int rollno;
String name;
String course;
float fee;
Studentt(int rollno,String name,String course)
{
this.rollno=rollno;
this.name=name;
this.course=course;
}
Studentt(int rollno,String name,String course,float fee)
{
this(rollno,name,course);
this.fee=fee;
}
void display()
{
System.out.println(rollno+" "+name+" "+course+" "+fee);
}
}
class Tt
{
public static void main(String args[])
{
Studentt s1=new Studentt(10001,"Hasini","AI&Ds");
Studentt s2=new Studentt(10001,"Siddu","CSE-DS",50000);
s1.display();
s2.display();
}
}

