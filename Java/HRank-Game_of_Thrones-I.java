import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();
       
        String ans = isPalindrome(inputString);
        // Assign ans a value of YES or NO, depending on whether or not inputString satisfies the required condition
        System.out.println(ans);
        myScan.close();
    }
    
    public static String isPalindrome(String input){
        char[] chars = input.toCharArray();
        int[] counts = new int[26];
        for(int i=0; i<chars.length; i++){
            counts[chars[i]-'0'-49]++;
        }
        int odd = 0;
        for(int j=0; j<counts.length; j++){
            if(counts[j]%2 != 0){
                odd++;
            }
        }
        if(odd == 1 || odd == 0){
            return "YES";
        }
        else{
            return "NO";
        }
    }
}
