/*
* Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/

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
