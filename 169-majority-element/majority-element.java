class Solution {
    public int majorityElement(int[] nums) {
      HashMap<Integer, Integer> map = new HashMap<>();
      for(int i : nums)
      {
        map.put(i, map.getOrDefault(i, 0)+1);
      }  
      int max = Integer.MIN_VALUE;
      int key = 0;
      for(Map.Entry<Integer, Integer> entry : map.entrySet()) {

    if(entry.getValue() > max) {
        max = entry.getValue();
        key = entry.getKey();
    }
}
return key;
    }
}