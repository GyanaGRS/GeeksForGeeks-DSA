//{ Driver Code Starts
import java.util.*;

public class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        while (t-- > 0) {
            List<String> names = new ArrayList<>();
            String input1 = sc.nextLine();
            Scanner ss1 = new Scanner(input1);
            while (ss1.hasNext()) {
                names.add(ss1.next());
            }
            Solution obj = new Solution();
            String res = obj.longest(names);
            System.out.println(res);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends



class Solution {
    public String longest(List<String> arr) {
        // code here
        int maxlen= 0;
        String str="";
        
        for(int i=0; i<arr.size(); i++){
            
            if(arr.get(i).length()==maxlen){
                continue;
            }
            if(arr.get(i).length()>maxlen){
                maxlen= arr.get(i).length();
                str=arr.get(i);
            }
            
        }
        return str;
    }
}
