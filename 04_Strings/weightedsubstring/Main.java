import java.util.*;
class Main{
    public static void main(String ar[]){
        Scanner sw = new Scanner(System.in);
        String s1 = sw.next();
        String s2 = sw.next();
        sw.nextLine();
        int n = sw.nextInt();
        System.out.print(wt(s1,s2,n));
    }
    static int wt(String s1, String s2,int k){
        LinkedHashSet<String> hs = new LinkedHashSet<>();
        for(int i=0;i<s1.length();i++){
            int sum = 0;//to store the wt of substrings 
            String sub = "";//to store the sbstrings 
            for(int j=i;j<s1.length();j++){
                int idx = s1.charAt(j) - 'a';
                int w = s2.charAt(idx) - '0';
                sum = sum + w;
                sub = sub+s1.charAt(j);
                if(sum<=k) hs.add(sub);
                else break;
            }
        }
        for(String st:hs) System.out.print(st+" ");
        return hs.size();
    }
}
