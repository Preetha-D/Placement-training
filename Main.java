import java.util.*;
public class Main
{
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  if(n==0){
	      System.out.println("binary:0");
	      return;
	  }
	  int[] binary=new int[32];
	  int i=0;
	  while(n>0){
	      binary[i]=n%2;
	      n=n/2;
	      i++;
	  }
	  System.out.println("Binary:");
	  for(int j=i-1;j>=0;j--){
	      System.out.print(binary[j]);
	  }
	}
}