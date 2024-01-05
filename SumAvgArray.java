//Sum and Average of array numbers
class SumAvgArray
{
public static void main(String args[])
{
int[] a={2,-9,0,5,12,-25,22,9,8,12};
int sum=0;
Double avg;
for(int i:a)
{
sum=sum+i;
}
int len=a.length;
avg=((double)sum/(double)len);
System.out.println("Sum="+sum);
System.out.println("Average="+avg);
}
}