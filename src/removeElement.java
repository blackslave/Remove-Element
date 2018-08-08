/**
 * 	給一個陣列跟一個數字，移除陣列中所有跟數字相同的元素。
 *	不可以使用另外的陣列來處理，全部的操作都要在同一個陣列中。
 *	陣列中的元素可以隨意排序。
 * @author black
 *
 */
public class removeElement {
	public static void main(String []args){
		Solution Solution = new Solution();
		int [] num ={1,2,2,3};
		System.out.println(Solution.removeElement(num, 3));
	}
}
