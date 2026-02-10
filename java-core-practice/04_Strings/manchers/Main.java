import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(lps(s));
	}
	public static String lps(String s){
	    StringBuilder t=new StringBuilder();
	    t.append('#');
	    for(int i=0;i<s.length();i++){
	        t.append(s.charAt(i)).append('#');
	    }
	    char c[]=t.toString().toCharArray();
	    int p[]=new int[c.length];
	    int ml=0,ci=0;
	    for(int i=0;i<c.length;i++){
	         p[i]=0;
	        while(i+p[i]+1<c.length&&i-p[i]-1>=0&&c[i+p[i]+1]==c[i-p[i]-1]){
	            p[i]++;
	        }
	        if(p[i]>ml){
	            ml=p[i];
	            ci=i;
	        }
	    }
	    int si=(ci-ml)/2;
	    return s.substring(si,si+ml);
	}
}
