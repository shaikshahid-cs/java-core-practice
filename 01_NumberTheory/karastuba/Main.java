import java.util.*;
public class Main
{
	public static long k(long x,long y) {
	    if(x<10||y<10) return x*y;
	    long len=Math.max(String.valueOf(x).length(),String.valueOf(y).length());
	    long l=len/2;
	    long a=x/(long)Math.pow(10,l);
	    long b=x%(long)Math.pow(10,l);
	    long c=y/(long)Math.pow(10,l);
	    long d=y%(long)Math.pow(10,l);
	    long s1=k(a,c);
	    long s2=k(b,d);
	    long s3=k(a+b,c+d)-s1-s2;
	    long s4=s1*(long)Math.pow(10,2*l)+s3*(long)Math.pow(10,l)+s2;
	    return s4;
	}
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    long x=sc.nextLong();
	    long y=sc.nextLong();
	    System.out.println(k(x,y));
	}
}
