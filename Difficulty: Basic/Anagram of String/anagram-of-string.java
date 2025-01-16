//{ Driver Code Starts
// saksham raj seth
import java.util.*;
import java.util.stream.*;

class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            String s1 = sc.next();
            GfG g = new GfG();
            System.out.println(g.remAnagrams(s, s1));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/
class GfG {
    public int remAnagrams(String s1, String s2) {
        int removedElements = 0;
        StringBuilder sb = new StringBuilder(s2); 
        
        for (char ch : s1.toCharArray()) {
            int index = sb.indexOf(String.valueOf(ch)); 
            if (index != -1) {
                sb.deleteCharAt(index); 
            } else {
                removedElements++; 
            }
        }
        
        
        removedElements += sb.length();
        
        return removedElements;
    }
}
