public class Main
{
public static void select(int a[]){
    int n=a.length;
    int min,j,i;
    for(i=0;i<n-1;i++){
      min=i;
     for(j=i+1;j<n-1;j++){
           if(a[j]<a[min])
           min=j;
        }
       if(min!=i){
           int temp=a[min];
           a[min]=a[i];
           a[i]=temp;
       }
    }
}
public static void main(String[] args) {
	    int arr[]={3,2,4,1,8,0,15};
System.out.println("Before Insertion Sort");
for(int i:arr)
System.out.print(i+" ");
select(arr);
System.out.println();
System.out.println("After Insertion Sort");
for(int i:arr)
System.out.print(i+" ");
	}
}


/*Output:
Before Insertion Sort
3 2 4 1 8 0 15 
After Insertion Sort
0 1 2 3 4 8 15 
*/
