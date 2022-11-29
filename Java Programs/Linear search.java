import java.util.*;
import java.io.*;
public class Main
{
    public static int search(int a[],int m){
        int n=a.length;
        for(int i=0;i<n;i++){
            if(a[i]==m)
            return i;
        }   
       return -1;
        
    }
	public static void main(String[] args) {
	    int n;
	    Scanner s=new Scanner(System.in);
	    System.out.println("enter the size of the array:");
	    n=s.nextInt();
	    int[] a=new int[n];
	    for(int i=0;i<n;i++){
	   System.out.println("enter the "+i+"st of the array:");
	     a[i]=s.nextInt();
	    }
		System.out.println(Arrays.toString(a));
		int m=search(a,9);
		if(m!=-1)
		System.out.println("element found at index:"+m);
		else
		System.out.println("element not found");
	}
}


/*
Output:
enter the size of the array:
6
enter the 0st of the array:
3
enter the 1st of the array:
8
enter the 2st of the array:
1
enter the 3st of the array:
2
enter the 4st of the array:
0
enter the 5st of the array:
21
enter target:
8
[3, 8, 1, 2, 3, 2]
element found at index:1
*/
