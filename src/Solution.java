/**
 * ������w�Wcount�C���p珚����Knums�oval�䛔�C��s�����X�V�v�Ɋ���X�Vnums�ȗ������䛔�B
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
