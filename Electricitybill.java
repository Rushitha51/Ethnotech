import java.util.Scanner;
public class Electricitybill
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Current Units: ");
	int u=sc.nextInt();
	int amount=0;
	if(u>250)
	{
		amount=((u-250)/50)*50;
	}
	System.out.println("Bill Amount = "+amount);
	sc.close();
	}
}