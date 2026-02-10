import java.util.Scanner;
class Solution{
    public static void main(String ar[]){
        Scanner sw = new Scanner(System.in);
        int n = sw.nextInt();//starting time array size 
        int s[] = new int[n];//starting time array 
        for(int i=0;i<n;i++) s[i] = sw.nextInt();
        int m = sw.nextInt();//finishing time array size 
        int f[] = new int[m];//finishing time array 
        for(int i=0;i<m;i++) f[i] = sw.nextInt();
        int j = 0;
        System.out.print(j+" ");//always 0th activity should be completed 
        for(int i=1;i<n;i++){
            if(s[i]>=f[j]){
                System.out.print(i+" ");
                j=i;//j should move to currently completed activity index
            }
        }
    }
}