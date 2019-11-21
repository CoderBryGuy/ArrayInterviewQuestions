package com.company;

public class MyArrayClass {


    int[] intArray =  {1,2,3,4,5};
    int[] newIntArray;

    public void average(int... numbers){
        int sum =0;
        for (int num: numbers) {
            sum+=num;
        }

        System.out.println("Avg of varargs numbers is:" + (sum)/numbers.length);
    }

    public void extendArray(int newLength){
        newIntArray = new int[newLength];

        for (int i = 0; i < intArray.length; i++) {
            newIntArray[i] = intArray[i];
        }

        intArray=newIntArray;
    }

    public void extendArrayUsingArrayCopyMethod(int newLength){
        newIntArray = new int[newLength];
        System.arraycopy(intArray, 0 , newIntArray, 0, intArray.length);
        intArray = newIntArray;
    }

    public void printArray(int[] Array1){
        for (int i = 0; i < Array1.length ; i++) {
            System.out.print(Array1[i]);
        }
        System.out.println();
    }
}
