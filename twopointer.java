import java.util.*;
public class twopointer
{
	public static void main(String[] args) {
		int arr[]={13,2,4,15,12,10,6,5};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int left=0;
		int right=arr.length-1;
		while(left<right){
		 int temp=arr[left];
		 arr[left]=arr[right];
		 System.out.print(arr[left]+" ");
		 arr[right]=temp;
		 System.out.print(arr[right]+" ");
		 left++;
		 right--;
		}
	
	}
}