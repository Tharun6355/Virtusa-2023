import java.util.*;
import java.io.*;
public class Main
{
  static int binarySearch(int array[], int x, int low, int high) {
/*
    if (high >= low) {
      int mid =  (high + low) / 2;

      // If found at mid, then return it
      if (array[mid] == x)
        return mid;

      // Search the left half
      if (array[mid] > x)
        return binarySearch(array, x, low, mid - 1);

      // Search the right half
      return binarySearch(array, x, mid + 1, high);
    }
*/
while (low <= high) {
      int mid = low + (high - low) / 2;

      if (array[mid] == x)
        return mid;

      if (array[mid] < x)
        low = mid + 1;

      else
        high = mid - 1;
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
		int m=binarySearch(a,9,0,n-1);
		if(m==-1)
		System.out.println("element not found");
		else
		System.out.println("element found at index:"+m);
	}
}

/*
Output :
enter the size of the array:
5
enter the 0st of the array:
2
enter the 1st of the array:
5
enter the 2st of the array:
3
enter the 3st of the array:
9
enter the 4st of the array:
7
[2, 5, 3, 9, 7]
element found at index:3
*/
