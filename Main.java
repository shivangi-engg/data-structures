import printpackage.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1 for pop , 2 for push");
		int s = sc.nextInt();
		switch(s)
		{
			case 1:
				printpackage.PrintLogicQueue printLogicQueueInstance = new  printpackage.PrintLogicQueue();
				printLogicQueueInstance.printLogicPop();
				break;


			case 2:
				printpackage.PrintLogicQueue printLogicQueueInstance1 = new printpackage.PrintLogicQueue();
				printLogicQueueInstance1.printLogicPush();
				break;


			default:
				System.out.println("that is not an option");
		}
}
}