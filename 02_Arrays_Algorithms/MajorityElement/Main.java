import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) a[i]=sc.nextInt();
		int c=0,ele=0;
		
		for(int i=0;i<n;i++){
		    if(c==0){
		        ele=a[i];
		        c++;
		    }
		    else if(ele==a[i]) c++;
		    else c--;
		}
		int count=0;
		for(int i=0;i<n;i++){
		    if(ele==a[i]) count++;
		}
		if(count>n/2) System.out.println("major ele is "+ ele);
		else System.out.println("no major");
	}
}
