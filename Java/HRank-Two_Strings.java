import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner myScan = new Scanner(System.in);
        int total = Integer.parseInt(myScan.nextLine());
        for(int i=0; i<total; i++){
            String inputa = myScan.nextLine();
            String inputb = myScan.nextLine();
            System.out.println(common(inputa, inputb));
        }
        myScan.close();
    }
    
    public static String common(String x, String y){
        char[] xchars = x.toCharArray();
        char[] ychars = y.toCharArray();
        HashSet<Character> set = new HashSet<>();
        for(char c: xchars){
            set.add(c);
        }
        for(char d: ychars){
            if(set.contains(d)){
                return "YES";
            }
        }
        return "NO";
    }
}