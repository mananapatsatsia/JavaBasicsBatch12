package com.Repl;

public class Repl81 {

	public static void main(String[] args) {
		 int [][]arr={{0,0,0},
             { 5,4,8}};
		 int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr[i].length;j++){
        	   if(arr[i][j]>max) {
        		   max=arr[i][j];
        	   }
           }           
}
        System.out.println(max);
}
}
