import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sw = new Scanner(System.in);
        int r = sw.nextInt();
        int c = sw.nextInt();
        int maze[][] = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++) maze[i][j] = sw.nextInt();
        }
        int sol[][] = new int[r][c];//to store the o/p path 
        if(path(r,c,maze,sol,0,0)){//checks path is available from src to dest
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++) System.out.print(sol[i][j]+" ");
                System.out.println();
            }
        }
        else System.out.print("No path available");
    }
    static boolean path(int r,int c,int maze[][],int sol[][],int i,int j){
        if(i==r-1&&j==c-1){//base case i.e.., reached the destination
            sol[i][j] = 1;
            return true;
        }
        if(i>=0&&j>=0&&i<r&&j<c&&maze[i][j]==1){
            sol[i][j] = 1;
            if(path(r,c,maze,sol,i+1,j)) return true;
            if(path(r,c,maze,sol,i,j+1)) return true;
            sol[i][j] = 0;//if both forward and downward we don't have any path.
        }
        return false;//if no condition is satisfied 
    }
}