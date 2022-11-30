package Week4;

import java.util.Arrays;

public class weeks3and4HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// #1	
	int [] ages = {3, 9, 23, 64, 2, 8, 28, 93, 10};
	
	System.out.println(ages[ages.length - 1] - ages [0]);
	
	double num = 0;
	for (int age : ages) {
		num += age;
	}
	
	double average = num/ages.length;
	
	System.out.println(average);
	
	
	
	//#2
	double sumOfLetters = 0;
	
	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	for (String name : names) {
		sumOfLetters += name.length();
	}
		double avg = sumOfLetters/names.length;
		System.out.println(avg);		
	
	for (String name2 : names) {
		name2.concat(name2);
		System.out.print(name2 + " ");
	} 
	
	System.out.println();

	
	//#3
	//array[array.length - 1]
	
	//#4
	//array[0]
	
	//#5 
	int[] nameLengths = new int[names.length];
	for (int i = 0; i < names.length; i++) {
		nameLengths[i] = names[i].length();
	}
	System.out.println(Arrays.toString(nameLengths));
	//i points to index in names array and sets value of name length to same index in nameLengths array
	
	//#6
	int sum = 0;
	for (int num2 : nameLengths) {
		sum += num2;
	}
	System.out.println(sum);
	
	
	}
	
	//#7
	public static String concactString (String word, int n) {
		return word.repeat(n);
	}
	
	//#8
	public static String fullName (String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	//#9
	public static boolean isSumGreaterThan100 (int[] array) {
		int sum = 0;
		for (int numbers : array) {
			sum += numbers;
		} if (sum > 100) {
			return true;
		} return false;
	}
	
	//#10
	public static double avgOfArray (double [] array) {
		double sum = 0;
		for (double num : array) {
			sum += num;
		} return sum/array.length;
	}
	
	//#11
	public static boolean compareAvg (double [] array, double [] array2) {
		double sum = 0;
		double sum2 = 0;
		double average = 0;
		double average2 = 0;
		for (double num : array) {
			sum += num;
			average = sum/array.length;
		}
			for (double num2 : array2) {
			sum2 += num2;
			average2 = sum2/array2.length;
			}
			if (average > average2) {
			return true;
		} return false;
		
		
	}
	//#12
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
		
	}

	
	
	//#13
	//Take an int age and return a string if the user is old enough to buy alcohol. 
	
	public static String isOldEnoughToBuyAlcohol (int age) {
		if (age >= 21) {
			return "You can buy alcohol";
		} else {
			return "You cannot buy alcohol";
		}
	}

}
