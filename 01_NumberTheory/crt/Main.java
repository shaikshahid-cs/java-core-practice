import java.util.*;
public class Main
{
	public static int gcd(int a,int b){
	    if(a<b) return gcd(b,a);
	    else if(b==0) return a;
	    else return gcd(b,a%b);
	}
	
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    int m[]=new int[n];
	    int M=1;
	    
	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	        m[i]=sc.nextInt();
	        M=M*m[i];
	    }
	    
	    for(int i=0;i<n-1;i++){
	        if(gcd(m[i],m[i+1])!=1||a[i]>m[i]) System.out.println("no sol");
	    }
	    int x=0;
	    for(int i=0;i<n;i++){
	        int Mi=M/m[i];
	        int Minv=1;
	        for(int j=1;j<m[i];j++){
	            if((Mi*j)%m[i]==1){
	                Minv=j;
	                break;
	            }
	        }
	        x=x+a[i]*Mi*Minv;
	    }
	    int c=x%M;
	    System.out.println(c);
	}
}
