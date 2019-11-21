package com.company;

public class Main {


    public static void main(String[] args) {
	MyArrayClass myArrayClass = new MyArrayClass();

	myArrayClass.printArray(myArrayClass.intArray);

	myArrayClass.extendArray(10);
	myArrayClass.printArray(myArrayClass.newIntArray);

	myArrayClass.average(2,4,5,7,8,987,56, 45, 34,23, 4,3,6,87,90);

	multiDimensionalArray();

		int j = 0;

		for (int i = 0; i < 10; ) {
			i=i++;
			System.out.println("hello");

			j++;
			if(j == 100){
				System.out.println("this loop is infinite and break procedure implemented");
				break;
			}
		}
    }

    public static void multiDimensionalArray(){
    	String[][] names = {{"Mr. ", "Mrs. ", "Ms. "}, {"Smith", "Jones"}};

		System.out.println(names[0][0] + names[1][0]);
		System.out.println(names[0][2] + names[1][1]);

		printMultiDimensionalArray(names);
		printMultiDimArrayTwoSteps(names);
		printMultiDimArrayForEachLoop(names);

	}

	public static void printMultiDimensionalArray(String[][] names){
		System.out.println("***print multi dimensional array***");
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j <names[i].length; j++) {
				System.out.print(names[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void printMultiDimArrayTwoSteps(String[][] names){
		System.out.println("***print multi dimensional array two steps***");
		for (int i = 0; i < names.length ; i++) {
			printOneDimArray(names[i]);
		}

	}

	private static void printOneDimArray(String[] name) {

		for (int j = 0; j <name.length ; j++) {
			System.out.print(name[j] + " ");
		}
		System.out.println();
	}

	public static void printMultiDimArrayForEachLoop(String[][] names){
		System.out.println("***print multi dimensional array foreach loop***");
		for (String[] fullName: names) {
			for (String name: fullName){
				System.out.print(name + " ");
			}
			System.out.println();
		}

	}
}
