// import java.util.*;
// public class man {
//     static int man1(int r,int c,int lr,int lc){
//         if(r==lr||c==lc) return 1;
//         return man1(r,c+1,lr,lc)+man1(r+1,c,lr,lc);
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int r=sc.nextInt();
//         int c=sc.nextInt();
//         System.out.println(man1(0,0,r-1,c-1));
//     }
// }


import java.util.*;
class Main{
    static int man1(int r,int c){
        if(r==0||c==0) return 1;
        return man1(r,c-1)+man1(r-1,c);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(man1(r-1,c-1));
    }
}
