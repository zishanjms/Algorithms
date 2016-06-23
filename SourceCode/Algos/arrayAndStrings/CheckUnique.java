package arrayAndStrings;

import java.util.Arrays;

public  class CheckUnique{
    
    public static void main(String args[]){
       
        String str = "ilovezishan";
        boolean c = check(str);
        System.out.println("c : "+c);
   }
    
    public static boolean check(String str){
           boolean t = true;
           boolean f = false;
           char [] ch = str.toCharArray();
           Arrays.sort(ch);
            for(int a = 0; a < ch.length -1 ; a++){
               //System.out.println("ch : "+ch[a]);
               if(ch[a] == ch[a+1]){
                   System.out.println("ch : "+ch[a]+ "," + "ch[a+1] : "+ch[a+1]);
                   return f;
               }
           }
           return t;

    }
}
