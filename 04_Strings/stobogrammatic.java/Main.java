import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=String.valueOf(n);
		String s1="";
		for(int i=0;i<s.length();i++){
		    char c=s.charAt(i);
		    if(c=='1'||c=='0'||c=='8') s1=c+s1;
		    else if(c=='6') s1="9"+s1;
		    else if(c=='9') s1="6"+s1;
		}
		if(s1.equals(s)) System.out.println("is stob");
		else System.out.println("no stob");
	}
}
