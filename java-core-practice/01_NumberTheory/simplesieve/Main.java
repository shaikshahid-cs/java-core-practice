import java.util.*;
public class Main
{
	public static void sieve(int n){
	    boolean b[]=new boolean[n+1];
	    for(int i=2;i*i<=n;i++){
	        for(int j=i*i;j<=n;j=j+i){
	            b[j]=true;
	        }
	    }
	    for(int i=2;i<=n;i++){
	        if(b[i]==false){
	            System.out.print(i+" ");
	        }
	    }
	}
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    sieve(n);
	}
}
