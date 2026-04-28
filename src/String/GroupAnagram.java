package String;

import java.util.*;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (!map.containsKey(key)) {
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter total number of string: ");
        int n = in.nextInt();
        String[] strs = new String[n];
        System.out.println("Enter strings: ");
        for (int i = 0; i < n; i++) {
            strs[i] = in.next();
        }
        GroupAnagram groupAnagram = new GroupAnagram();
        List<List<String>> result = groupAnagram.groupAnagrams(strs);
        System.out.println(result);
    }
}
