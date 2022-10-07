class Solution {
    public int searchInsert(int[] nums, int target) 
    {
        int i = 0; //First index
        int j = nums.length - 1; //last index
        while(i <= j)
        {
          int mid = (i + j) / 2;
            
            if(nums[mid] == target) 
            {
                return mid;
            }
            else if (target > nums[mid]) 
            {
                i = mid + 1;
            }
             else {
                j = mid - 1;
            }
        }
        return j + 1;
    }
}