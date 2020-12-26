package printpackage;
import java.io.*;
import java.lang.*;
import java.util.*;
//this class onatins logic for queue operations
public class PrintLogicQueue
{
	public void printLogicPop()
	{
		int i;
		//to take length of array
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of array:");
		int length = sc.nextInt();
		int last = length-1;
		int arr[] = new int[length];
		for (int j=0;j<=last ;j++ ) 
		{
			System.out.println("enter the"+j+"th element of array:");
			Scanner sa = new Scanner(System.in);
			int e = sa.nextInt();
			arr[j] = e;
		}
		for (i=0;i<=last ;i++ ) 
		{
			if (arr[i] == 0) 
			{
				continue;
			}	
			else
			{
				System.out.print("the popped element is:"+arr[i]);

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
		int arr[] = new int[length];
		for (int j=0;j<=last ;j++ ) 
		{
			System.out.println("enter the"+j+"th element of array:");
			Scanner sa = new Scanner(System.in);
			int e = sa.nextInt();
			arr[j] = e;
		}
		Scanner se =new Scanner(System.in);
		System.out.println("enter the element u want to enter in the array:");
		int element = se.nextInt();
		for (i=0;i<=last ;i++ ) 
		{
			if (arr[i] == arr[last]) 
			{
				arr[i]=element;
			}
			else
			{
				int temp;
				temp = arr[i+1];
				arr[i]= temp;
				
			}
			
		}
		System.out.println("the array after performing the push operation is:");
		for (int k=0;k<=last;k++) 
		{
			System.out.println(arr[k]);
		}
	}
}
/*
	
		//running for loop from the last porition of array to the 0th index
		for (i=last;i>=0 ;i-- ) 
		{
			//checking if the ith index already has a value , if not then put value of 
			//input element at ith inde else fo to for loop iterator and check again 
			if (array[i] == 0) 
			{	
				array[i] = element;	
				break;
			}	
			else
			{
				continue;
			}
		}*/
