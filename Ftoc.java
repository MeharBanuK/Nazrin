import java.util.Scanner;
class Ftoc
{
public static void main (String args[])
{
float tem;
Scanner s=new Scanner(System.in);
System.out.println("enter the tem in F:");
tem=s.nextInt();
tem=((tem-32)*5)/9;
System.out.println("tem in celcius:"+tem);
}
}