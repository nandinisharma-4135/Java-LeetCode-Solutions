class Solution {
    public int[] getConcatenation(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i<nums.length ; i++)
        {
            list.add(nums[i]);
        }
        ArrayList<Integer> copy = new ArrayList<Integer>(list);
        list.addAll(copy);
        int arr[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;


    }
}