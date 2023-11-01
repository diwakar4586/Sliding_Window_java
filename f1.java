import java.util.*;
class f1{
    public static boolean chk(String str,int l,int r){

        Set<Character> st = new HashSet<>();


        for(int i =l;i<=r;i++){
            if(st.contains(str.charAt(i))){
                return false;
            }
            st.add(str.charAt(i));
        }
        return true;
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        int max = 0;

        for(int i =0;i<x.length();i++){
            for(int j =i+1;j<=x.length();j++){
                if(chk(x,i,j)){
                    max= Math.max(max,j-i);
                }
            }
        }
        
        System.out.println(max);
        

 
    }
}