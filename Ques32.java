import java.util.*;
class Ques32
{
public static void main(String[]args)
{
Scanner m=new Scanner(System.in);
System.out.println("enter size of array");
int n=m.nextInt();
int a[]=new int[n];
int i;
System.out.println("enter array elemnts");
for(i=0;i<n;i++)
{a[i]=m.nextInt();}
int min,max;
min=a[0];
max=a[0];
for(i=1;i<n;i++)
{
if(min>a[i])
{min=a[i];}
if(max<a[i])
{max=a[i];}
}
System.out.println("Maximum value of the array is "+max);
System.out.println("Minimum value of the array is "+min);
}}