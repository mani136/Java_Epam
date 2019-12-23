import java.util.*;
class Ques33
{
public static void main(String[]args)
{
Scanner m=new Scanner(System.in);
int a[]={1,4,34,56,7};
int n=m.nextInt();
int j,count=0;
for(j=0;j<5;j++)
{
if(n==a[j])
{System.out.println("index is "+(j+1));
break;}
else
{count++;}
}
if(count==5)
{System.out.println("-1");}
}}