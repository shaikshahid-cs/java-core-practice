import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s="";
		String s1="";
		while(n>0){
		    s=n%2+s;
		    s1=s1+n%2;
		    n=n/2;
		}
		if(s1.equals(s)) System.out.println("bp");
		else System.out.println("no bp");
	}
}
