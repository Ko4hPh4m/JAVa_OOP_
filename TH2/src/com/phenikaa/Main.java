package com.phenikaa;
import com.phenikaa.Stack.Stack;

public class Main {

    public static void main(String[] args) {
        long []arr={1,2,3,4,5};
        long []arrReverse = new long[arr.length];
        System.out.print("\nDanh sach cho truoc : ");
        for(long x:arr){
            System.out.print(x+" ");
        }

        Stack stack= new Stack(arr.length);
        for(int i=0;i<arr.length;i++){
            stack.push(arr[i]);
        }

        for(int i=0;i<stack.getMaxSize();i++){
            arrReverse[i]=stack.pop();
        }

        System.out.print("\nHam sau khi dao nguoc : ");
        for(long x:arrReverse){
            System.out.print(x+" ");
        }
    }
}
