import java.util.Scanner;

class Lcm
{
public static void main(String args[])
{
int x,y,a;
Scanner s=new Scanner(System.in);
System.out.println("enter the num");
x=s.nextInt();
y=s.nextInt();

	a=(x>y)?x:y;
	while(true)
	{
		if(a%x==0 && a%y==0)
		{
		System.out.println("the lcm of" +x+ "and" +y+ "is" +a);
		break;
		}
	++a;

	}

}
}