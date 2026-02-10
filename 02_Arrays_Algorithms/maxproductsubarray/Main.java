import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) a[i]=sc.nextInt();
		int max=Integer.MIN_VALUE;
		int pref=1,suff=1;
		for(int i=0;i<n;i++){
		    if(pref==0) pref=1;
		    if(suff==0) suff=1;
		    pref=pref*a[i];
		    suff=suff*a[n-1-i];
		    max=Math.max(max,Math.max(pref,suff));
		}
		System.out.println(max);
	}
}
