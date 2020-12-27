import printpackage.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1 for queue , 2 for stack");
		int s = sc.nextInt();
		switch(s)
		{
			case 1:
				Scanner sa = new Scanner(System.in);
				System.out.println("enter 1 for pop  and 2 for push");
				int p = sa.nextInt();
				switch(p)
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

			case 2:
				Scanner sw = new Scanner(System.in);
				System.out.println("enter 1 for pop  and 2 for push");
				int r = sw.nextInt();
				switch(r)
				{
					case 1:
						printpackage.PrintLogicStack printLogicStackInstance = new printpackage.PrintLogicStack();
						printLogicStackInstance.printLogicPop();

					case 2:
						printpackage.PrintLogicStack printLogicStackInstance1 = new printpackage.PrintLogicStack();
						printLogicStackInstance1.printLogicPush();
						break;

					default:
						System.out.println("wrong option");
				}
				


			
		}
}
}
