import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner myScan = new Scanner(System.in);
        String input = myScan.nextLine();
        System.out.println(valid(input));
    }
    
    public static String valid(String input){
        char[] chars = input.toCharArray();
        int[] counts = new int[26];
        HashMap<Integer, ArrayList<Character>> map = new HashMap<>();
        for(char c:chars){
            counts[c-'0'-49]++;
        }
        for(int i=0; i<26; i++){
            if(counts[i] != 0){
                if(!map.keySet().contains(counts[i])){
                    ArrayList<Character> cur = new ArrayList<>();
                    cur.add(Integer.toString(i+49).charAt(0));
                    map.put(counts[i], cur);
                }
                else{
                    ArrayList<Character> cur = map.get(counts[i]);
                    cur.add(Integer.toString(i+49).charAt(0));
                    map.put(counts[i], cur);
                }
            }
        }
        if(map.keySet().size() > 2){
            return "NO";
        }
        if(map.keySet().size() == 1){
            return "YES";
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int x: map.keySet()){
            list.add(x);
        }
        if(Math.min(list.get(0), list.get(1)) == 1 && map.get(Math.min(list.get(0), list.get(1))).size() == 1 ){
            return "YES";
        }
        if(Math.abs(list.get(0)-list.get(1)) == 1 && map.get(Math.max(list.get(0), list.get(1))).size() == 1){
            return "YES";
        }
        return "NO";

    }
}