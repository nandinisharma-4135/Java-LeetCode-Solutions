class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        s = s.toLowerCase();
        for(int i = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
        map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(Map.Entry<Character, Integer> i: map.entrySet())
        {
            if(i.getValue() == 1)
            {
                return s.indexOf(i.getKey());
            }
        }
        return -1;
    }
}