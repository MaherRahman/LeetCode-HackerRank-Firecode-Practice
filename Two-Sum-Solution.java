class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        Map <Integer, Integer> hash = new HashMap <Integer, Integer>(); 
        for (int i = 0; i < nums.length; i++) {
            Integer complementIndex = hash.get(target - nums[i]);
            if (complementIndex == null) {
                hash.put(nums[i], i);
            } else {
                answer[0] =  complementIndex;
                answer[1] = i;
                break;
            }
        }
        return answer;
    }
}
