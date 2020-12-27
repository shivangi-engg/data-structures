package printpackage;
import java.io.*;
import java.lang.*;
import java.util.*;
public class PrintLogicStack
{
	public void printLogicPop()
	{
		int i;
		//to take length of array
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of array:");
		int length = sc.nextInt();
		int last = length-1;
		//array
		int arr[] = new int[length];
		//for loop to take the elements for array
		for (int j=0;j<=last ;j++ ) 
		{
			System.out.println("enter the"+j+"th element of array:");
			Scanner sa = new Scanner(System.in);
			int e = sa.nextInt();
			arr[j] = e;
		}
		//for loop to traverse from starting to ending of array
		for (i=0;i<=last ;i++ ) 
		{
			//if ith element is 0 goto next element
			if (arr[i] == 0) 
			{
				continue;
			}	
			//if ith element is not 0 pop it
			else
			{
				System.out.println("the popped element is:"+arr[i]);
				//to pop the element
				arr[i] = 0;
				break;
			}
		}

	}
	public void printLogicPush()
	{
		int i;
		//to take length of array
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of array:");
		int length = sc.nextInt();
		int last = length-1;
		//array
		int arr[] = new int[length];
		//for loop to take values of element for array
		for (int j=0;j<=last ;j++ ) 
		{
			System.out.println("enter the"+j+"th element of array:");
			Scanner sa = new Scanner(System.in);
			int e = sa.nextInt();
			arr[j] = e;
		}
		//take input from user , i.e the value u want to push
		Scanner se =new Scanner(System.in);
		System.out.println("enter the element u want to enter in the array:");
		int element = se.nextInt();
		//for loop to traverse from ending to starting of array
		for (i=last;i>=0 ;i-- ) 
		{
			if (arr[i] == arr[0]) 
			{
				arr[i] = element;
			}
			else
			{
				int temp;
				temp = arr[i-1];
				arr[i] = temp;
			}
			
		}
		System.out.println("the array after performing the push operation is:");
		//for loop to give the final array after push operation
		for (int k=0;k<=last;k++) 
		{
			System.out.println(arr[k]);
		}
	}
}
