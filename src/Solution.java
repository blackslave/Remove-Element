/**
 * 建立一個指標count，利用迴圈走訪nums與val比對，若不同則更新計數器並更新nums以利下次比對。
 * @author black
 *
 */
public class Solution {
	public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i = 0; i < nums.length;i++)
        {
        	if(nums[i]!=val)
        	{
        		nums[count++]=nums[i];
        	}
        }
        return count;
    }
}
