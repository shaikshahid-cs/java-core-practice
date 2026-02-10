// import java.util.*;
// public class josh {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int k=sc.nextInt();
//         List<Integer>l=new ArrayList<>();    
//         for(int i=1;i<=n;i++) l.add(i);
//         int res=0;
//         while(l.size()!=1){
//             res=(res+k-1)%l.size();
//             l.remove(res);
//         }
//         System.out.println(l.get(0));
//     }    
// }

//O(n);time and space

import java.util.*;
class Main{
    static int jos(int n,int k){
        if(n==k) return 1;
        return(jos(n-1,k)+k-1)%n+1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        System.out.println(jos(n,k));
    }
}