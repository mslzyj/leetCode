package arrays;

/**
 * git push -u origin master
 */
public class RestoreString {
    public static void main(String[] args) {
        String s = "codeleet";
        int [] a = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s, a));
    }

    public static  String restoreString(String s, int[] indices) {
        char [] str = new  char[s.length()];
        char [] chars = s.toCharArray();
        for (int i = 0; i < indices.length; i++) {
            int temp = indices[i];
            char c = chars[i];
            str[temp] = c;
        }
        String s1 = "";
        for (int i = 0; i < str.length; i++) {
            s1 += str[i];
        }
       return s1;
    }
}
