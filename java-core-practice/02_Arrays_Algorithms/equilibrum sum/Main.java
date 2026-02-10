import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) a[i]=sc.nextInt();
		int prefs=a[0],suffs=a[n-1];
		int max=Integer.MIN_VALUE;
		int i=0,j=n-1;
		while(i<=j){
		    if(prefs==suffs) max=Math.max(max,prefs);
		    if(prefs<suffs){
		        i++;
		        prefs=prefs+a[i];
		    }
		    else{
		        j--;
		        suffs=suffs+a[j];
		    }
		}
		if(max!=Integer.MIN_VALUE) System.out.println(max);
		else System.out.println("no");
	}
}
