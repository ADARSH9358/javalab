import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
     public static int count(String str) {
        Set<Character> set = new HashSet<>();

        // Convert the string to a char array and add each character to the set
        for(int i=0;i<str.length();i++){
             set.add(str.charAt(i));        
        }

        return set.size();
    }
    public static void main(String[] args) {
        List<String> string = new ArrayList<>();

        // Add some strings to the list
        string.add("hello");
        string.add("world");
        string.add("java");

        // for (String str : string) {
            // int disint_count = count(str);
            // System.out.println("String: " + str);
            // System.out.println("Number of unique characters: " + disint_count);
            for(int i = 0; i < string.length(); i++) {
                   Set<Character> set = new HashSet<>();
            for(int j = 0; j < string[i].length(); j++) {
                       set.add(str.charAt(i));  
            }
            System.out.println(set.size());
        }
    }

   
}
