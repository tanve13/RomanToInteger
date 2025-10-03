class Solution {
    public String intToRoman(int num) {
        // Values and their corresponding Roman symbols
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder sb = new StringBuilder();

        // Greedy approach
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                sb.append(symbols[i]);
            }
        }

        return sb.toString();
    }
}
public class IntegerToRoman {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.intToRoman(3));    // "III"
        System.out.println(sol.intToRoman(58));   // "LVIII" (50+5+3)
        System.out.println(sol.intToRoman(1994)); // "MCMXCIV" (1000+900+90+4)
    }
}
