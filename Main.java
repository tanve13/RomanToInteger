import java.util.*;

class Solution {
    public int romanToInt(String s) {
        // Roman numeral map
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            int value = map.get(s.charAt(i));

            // Look ahead to next character (if exists)
            if (i + 1 < s.length() && value < map.get(s.charAt(i + 1))) {
                total -= value;  // Subtract if smaller comes before larger
            } else {
                total += value;  // Otherwise add
            }
        }
        return total;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.romanToInt("III"));    // 3
        System.out.println(sol.romanToInt("IV"));     // 4
        System.out.println(sol.romanToInt("IX"));     // 9
        System.out.println(sol.romanToInt("LVIII"));  // 58  (L=50 + V=5 + III=3)
        System.out.println(sol.romanToInt("MCMXCIV")); // 1994 (M=1000 + CM=900 + XC=90 + IV=4)
    }
}
