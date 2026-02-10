import java.util.*;
public class Main
{
    public static int gcd(int a,int b){
        if(a<b) return gcd(b,a);
        else if(b==0) return a;
        else return gcd(b,a%b);
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		for(int i=0;i<n;i++){
		    if(gcd(n,i)==1) c++;
		}
		System.out.println(c);
	}
}
