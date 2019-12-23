import java.util.*;
class Ques31
{
public static void main(String[]args)
{
System.out.println("enter size of array");
Scanner m=new Scanner(System.in);
int i,n=m.nextInt();
int sum=0;
double avg;
int a[]=new int[n];
System.out.println("enter array elemnts");
for(i=0;i<n;i++)
{
a[i]=m.nextInt();
sum+=a[i];
}
avg=sum/n;
System.out.println("Sum of elements is "+sum);
System.out.println("Average of elements is "+avg);
}
}