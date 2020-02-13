import java.util.*;
class bubbleSort{

	static void bubble(int a[]){
		int n=a.length;
		int temp=0;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
				  temp=a[j];
				  a[j]=a[j+1];
				  a[j+1]=temp;
				}
			}
		}


	}

public static void main(String args[])
{
	Scanner input=new Scanner(System.in);
	int n=5;
	int arr[]=new int[n];
	for(int i=0;i<n;i++){
		arr[i]=input.nextInt();
	}
	bubble(arr);
	System.out.println();
	for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+"   ");
	}
}
}
