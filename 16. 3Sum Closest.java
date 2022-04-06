
Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.

 

Example 1:

Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
Example 2:

Input: nums = [0,0,0], target = 1
Output: 0
 

Constraints:

3 <= nums.length <= 1000
-1000 <= nums[i] <= 1000
-104 <= target <= 104


Success
Details 
Runtime: 8 ms, faster than 82.53% of Java online submissions for 3Sum Closest.
Memory Usage: 41.9 MB, less than 85.95% of Java online submissions for 3Sum Closest.

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        int minValue = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i =0; i< nums.length-2; i++){
            int left =i+1;
            int right = nums.length-1;
            
            while(left < right){
                int total = nums[left] + nums[i] + nums[right];
                if(Math.abs(total- target) < Math.abs(minValue)){
                    minValue = target - total;
                }
                if(total < target){left++;}
                else{right--;}
            }
        }
        
        return target- minValue;
    }
}
