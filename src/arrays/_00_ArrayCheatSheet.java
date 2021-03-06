package arrays;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] words = new String[5];
		//2. print the third element in the array
		System.out.println(words[2]);
		//3. set the third element to a different value
		words[2]="Hello world!";
		//4. print the third element again
		System.out.println(words[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]);
		}
		
		//6. make an array of 50 integers
		String[] nums=new String[50];
		//7. use a for loop to make every value of the integer array a random number
		for(int i=0;i<nums.length;i++) {
			nums[i]=""+i;
		}
		//8. without printing the entire array, print only the smallest number in the array
		System.out.println(nums[0]);
		//9 print the entire array to see if step 8 was correct
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		//10. print the largest number in the array.
	}
}
