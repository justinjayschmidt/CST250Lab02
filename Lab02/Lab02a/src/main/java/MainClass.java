/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author justinschmidt
 */
public class MainClass {
    
    public static void main(String[] args){
        
//        System.out.println("Hello world");
//        
//        int[] arr = {1,2,3};
//        
//        System.out.println(arr[1]);
//        
//        for (int index = 0; index < arr.length; index++){
//            System.out.println(arr[index]);
//        }
//        
//        for (int element : arr){
//            System.out.println{element);
//        }

    int[] myarray = new int[4]; //this means there are 4 blocks of memory in the new array called myarray//
        //this is an empty array, you can add to it//
        
        
        
        for (int index = 0; index < myarray.length; index++){
            myarray[index] = index + 5;
        }
        
        for (int element : myarray){
            System.out.println(element);
        }
        //this prints out 5 6 7 8 NOT 5 10 15 20 because it prints out the index which starts at 0 then 1, +5 to each of those// 
        
        
        int [] myarray2 = myarray;
        
        myarray[0] = 3;
        
        for (int element : myarray2){
            System.out.println(element + "...");
        }
        
    }
    
}
