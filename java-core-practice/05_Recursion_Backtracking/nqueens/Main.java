import java.util.Scanner;
class Main{
    public static void main(String ar[]){
        Scanner sw = new Scanner(System.in);
        int n = sw.nextInt();//no of queens 
        if(n<=3){
            System.out.print("Not possible");
            return;
        }
        int sol[][] = new int[n][n];//to store the o/p queens path 
        if(path(n,sol,0)){//if path is found 
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++) System.out.print(sol[i][j]+" ");
                System.out.println();
            }
        }
    }
    static boolean path(int n,int sol[][],int col){
        if(col>=n) return true;//all queens are placed or not 
        for(int i=0;i<n;i++){ //i => row traversing 
            if(safe(n,sol,i,col)){
                sol[i][col] = 1;
                if(path(n,sol,col+1)) return true;
                sol[i][col] = 0;//backtrack step 
            }
        }
        return false;//if above conditions are not satisfied then return false 
    }
    static boolean safe(int n,int sol[][],int r,int c){
        //first we need to check in current row for queens 
        for(int i=0;i<c;i++) if(sol[r][i]==1) return false;
        //upper left diagonal for queen checking 
        for(int i=r,j=c;i>=0&&j>=0;i--,j--) if(sol[i][j]==1) return false;
        //upper right diagonal for queen checking
        for(int i=r,j=c;i<n&&j>=0;i++,j--) if(sol[i][j]==1) return false;
        return true;//if above conditions are not satisfied then it is safe to 
        //place queen in current position 
    }
}