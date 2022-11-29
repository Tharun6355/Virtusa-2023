//Longest Substring Without Repeating Characters
import java.util.*;
public class Main
{
    public static int lengthOfLongestSubstring(String s) {
        int maximum_length = 0;
    
    int start = 0;
        HashMap<Character, Integer> map = new HashMap<>();
       for(int i=0; i<s.length(); i++){
          
          if(map.containsKey(s.charAt(i)))
      {
         start = Math.max(start, map.get(s.charAt(i)) + 1);
      }
 
      
      map.put(s.charAt(i), i);
      maximum_length = Math.max(maximum_length, i-start + 1);
    }
    return maximum_length;
    }
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    String m;
	    m="abcabcbb";
		System.out.println(lengthOfLongestSubstring(m));
	}
}
