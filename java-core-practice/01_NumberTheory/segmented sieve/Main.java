import java.util.*;
public class Main
{
	public static void ss(int l,int h){
	    boolean b[]=new boolean[h+1];
	    for(int i=2;i*i<=h;i++){
	        int sm=(l/i)*i;
	        if(sm<l) sm=sm+i;
	        for(int j=sm;j<=h;j=j+i){
	            b[j]=true;
	        }
	    }
	    for(int i=l;i<=h;i++){
	        if(b[i]==false){
	            System.out.print(i+" ");            
	        }
	    }
	}
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    int l=sc.nextInt();
	    int h=sc.nextInt();
	    ss(l,h);
	}
}
