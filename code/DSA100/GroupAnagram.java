package DSA100;

import java.util.*;

public class GroupAnagram {

    public static List<List<String>> groupAnagram(String[] strArr){
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strArr){ //eat, tea,tan....
            char[] charArr = str.toCharArray(); //[e,a,t]
            Arrays.sort(charArr); //[a,e,t]
            String st = new String(charArr); //aet
            map.putIfAbsent(st, new ArrayList<String>()); // 1st = aet {}
            map.get(st).add(str); //aet {eat....}
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> res = groupAnagram(str);
        System.out.println(res);
    }
}
