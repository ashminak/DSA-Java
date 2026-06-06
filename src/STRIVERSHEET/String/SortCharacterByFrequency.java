package STRIVERSHEET.String;

import java.util.*;

public class SortCharacterByFrequency {
    public String Solution(String S) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (char c : S.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b)->b.getValue()-a.getValue());
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character,Integer> entry : list) {
            char c = entry.getKey();
            int freq = entry.getValue();
            for (int i = 0; i < freq; i++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String");
        String S = in.nextLine();
        SortCharacterByFrequency obj = new SortCharacterByFrequency();
        System.out.println(obj.Solution(S));

    }

}
