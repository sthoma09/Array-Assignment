import java.util.Random;

public class Problem1 {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		int num = 10; //these are to reference in another method or are if needed//
		int start = 1;
		
		loadArray(numbers,num,start); //can use actual numbers in num and start if only using in this method//
		showArray(numbers);
		
		int target = 16;
		int resultIndex = linearSearch(numbers, target);
		
		if (resultIndex != -1) {
			System.out.printf("\nValue %d found at index: %d\n", target, resultIndex);
		}else {
			System.out.println(linearSearch(numbers, target));
		}
	}
	
	public static int linearSearch(int[] theArray, int value) {
		int index;
		for (index = 0; index < theArray.length; index++) {
			if (theArray[index] == value) {
				return index;
				
			}	
		}
		return -1;
	}
	
		
	public static void loadArray(int[] theArray, int num, int start) {
		int index;
		Random rand = new Random();
		
		for(index = 0;  index < theArray.length; index++) {
			theArray[index] = rand.nextInt(num)+start;
		}
		
	}
	public static void showArray(int[] theArray) {
		int index;
		
		for(index = 0;  index < theArray.length; index++) {
			System.out.printf("[%d]: %d\n", index, theArray[index]);
		}
	}

}
