import java.util.*;
    class perfcont{
    	public static void main(String []args){
    		Scanner s= new Scanner (System.in);
    		int t= s.nextInt();
    		for(int i=0;i<t;i++){
    			int count1=0,count2=0;
    			int n= s.nextInt();
    			int p= s.nextInt();
    			int []a= new int[n];
    			for(int j=0; j<n; j++){
    				a[j]=s.nextInt();
    				if(a[j]<=p/10) count1++;
    				if(a[j]>=p/2) count2++;
    			}
    			if(count1==2 && count2==1) 
				System.out.println("yes");
    			else 
				System.out.println("no");
    		}
    	}
    } 
