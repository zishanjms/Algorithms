package arrayAndStrings;

public class Test {
    public static String compressString(String str){
         char[] chars = str.toCharArray();
            StringBuffer string = new StringBuffer();
            int count = 1;
            char prev = chars[0]; // at starting prev will be the first char of string.
            for (int i = 1; i < chars.length; i++) {
                char current = chars[i];
                //System.out.println(chars[i]);
                if (current == prev) {
                    count++;
                } else {
                    string.append(prev).append(count); 
                    count = 1;
                }
                prev = current; 
            }
        
            return string.append(prev).append(count).toString();
    }
    public static void main(String args []){
        String str = compressString("asdfaf");
        System.out.println(str);
    }
}