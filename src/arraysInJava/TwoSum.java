package arraysInJava;

import java.util.*;

public class TwoSum {

	public static int[] bruteForceTwoSum(int[] nums, int target) {
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[j]==target-nums[i]) {
					return new int[] {i,j}; 
				}
			}
		}
		return new int[] {};
	}
	
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> hm = new HashMap<>();
		
		for(int i=0;i<nums.length;i++) {
			hm.put(nums[i],i);
		}
		
		for(int i=0; i<nums.length;i++) {
			int diff = target-nums[i];
			if(hm.containsKey(diff) && hm.get(diff)!=i) {
				return new int[] {i, hm.get(diff)};
			}
		}
		
		return new int[] {};
	}
	
	public int[] bestTwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[] { map.get(diff), i };
            }
            map.put(nums[i], i);
        }
        // Return an empty array if no solution is found
        return new int[] {};
    }
	
	public static void main(String[] args) {
		int[] arr = {3,2,4};
		int target = 6;
		

	}

}
