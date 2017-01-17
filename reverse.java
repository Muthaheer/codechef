import java.util.*;
import java.lang.*;
import java.io.*;
 
class Codechef
{
	public static void main (String[] args)
	{
	    int n,i,rev;
	    
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
		    a[i]=s.nextInt();
		    rev=0;
		    while(a[i]!=0)
		    {
		        rev=rev*10+(a[i]%10);
		        a[i]=a[i]/10;
		    }
		    a[i]=rev;
		    
		}
		for(i=0;i<n;i++)
		    System.out.println(a[i]);
		
	}
}
