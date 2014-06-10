
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author walexi4great
 */
public class BinarySearchAlgorithm {

      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter the value you wanna search for, number must be from 1 to 2000 inclusve");
        Scanner keyInput = new Scanner(System.in);
        int key = keyInput.nextInt();
        System.out.println("Enter the limit of the arraylist you wanna auto-generate");
        Scanner listLimitInput = new Scanner(System.in);
        int listLimit = listLimitInput.nextInt();
        System.out.println("Enter the limit of the array you wanna auto-generate");
        Scanner arrayLimitInput = new Scanner(System.in);
        int arrayLimit = arrayLimitInput.nextInt();
        System.out.println("You should find the index of the value you searched"
                + " for below this line both in the array and arrayList." + "\n" + 
                "Never mind, jsut playing with arraylist and array." + "\n" + "The "
                + "values of the indexes should be same nevertheless, just showing"
                + " how to do recursive binary search with both array and arraylist");
        
       System.out.print(binarySearchArrayList(fillArrayList(listLimit), key, 0, fillArrayList(listLimit).size()) + "\n");
       System.out.print(binarySearchArray(fillArray(arrayLimit), key, 0, fillArray(arrayLimit).length) + "\n");
        
 }
   
    
public static int binarySearchArrayList(ArrayList<Integer> intArray, int key, int low, int high){
//I didnt bother checking if the array is empty 
      int mid = (low+high) /2;
      if (key<intArray.get(mid)){
      return binarySearchArrayList(intArray, key, low, mid-1); // search for the value in the lower half of the array
      } else if(key>intArray.get(mid)){ 
      return binarySearchArrayList(intArray, key, mid+1, high);   // search for the value in the upper half of the array
      } else  
    return (int)mid;      //value has been found, return the index
      }
      
public static int binarySearchArray(int[] arraytoSearch, int key, int low, int high){
    
    //compute the middle index
    int mid = (low + high)/2;
    if(key<arraytoSearch[mid]){
        return binarySearchArray(arraytoSearch, key, low, mid -1);// search for the value in the lower half of the array
    } else if (key > arraytoSearch[mid]){
        return binarySearchArray(arraytoSearch, key, mid+1, high); // search for the value in the upper half of the array
    } else 
        return mid; //  the index of the key value i.e the index of the value you searched for

}

public static int[] fillArray(int arrayLimit){
    
    int [] arraytoFill = new int[arrayLimit];
    for (int i = 0; i < arrayLimit; i++) {
        arraytoFill[i] = i + 1; //adding 1 to exclude 0
    }
return arraytoFill;
}

public static ArrayList<Integer> fillArrayList(int listSize){
    ArrayList<Integer> arrayTobesoted= new ArrayList();
        for (int i = 0; i < 2000; i++) {
            arrayTobesoted.add(i+1);
        }
return arrayTobesoted;
}

}
