/**
 * §κΒwWcountCpηKnumsδovalδCαs―₯XVvΙνΐXVnumsΘΊδB
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
