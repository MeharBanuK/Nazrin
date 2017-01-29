import java.util.Scanner;

class Ad
{
public static void main (String args[])
{
Ex e=new Ex();

Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
int sq=n*n,sqr,sqrr;
int r;
System.out.println("square of n"+sq);
r=e.reverse(sq);
System.out.println("reverse of sq"+r);
sqr=(int)Math.sqrt(r);
System.out.println("reverse of squared num"+sqr);
sqrr=e.reverse(sqr);
if(n==sqrr)
{
System.out.println("it is a ada num");
}
else
{
System.out.println("not an adam no");
}
System.out.println("reverse of square"+sqrr);

}
}

class Ex
{
public int reverse(int sq)
{
int r=0;

while(sq>0)
{
r=r*10+sq%10;
sq=sq/10;
}
return(r);
}
}
