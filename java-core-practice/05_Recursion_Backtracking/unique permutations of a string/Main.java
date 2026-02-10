import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		per(s,0,s.length()-1);
	}
	public static void per(String s,int l,int r){
	    if(l==r) System.out.println(s);
	    for(int i=l;i<=r;i++){
	        s=swap(s,l,i);
	        per(s,l+1,r);
	        s=swap(s,l,i);
	    }
	}
	public static String swap(String s,int i,int j){
	    char c[]=s.toCharArray();
	    char temp=c[i];
	    c[i]=c[j];
	    c[j]=temp;
	    return String.valueOf(c);
	}
}
