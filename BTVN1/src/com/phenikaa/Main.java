package com.phenikaa;

import java.util.Scanner;

public class Main {

    public static void Sort(int[] arr){
        int swap;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    swap=arr[i];
                    arr[i]=arr[j];
                    arr[j]=swap;
                }
            }
        }
    }
    public static int BinarySearch(int a[],int x,int low,int hight){
        if(low>hight){
            return -1;
        }
        int mid=(low+hight)/2;
        if(x==a[mid]){
            return mid;
        }
        if(x<a[mid]){
            return BinarySearch(a,x,low,mid-1);
        }
        return BinarySearch(a,x,mid+1,hight);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap so luong phan tu cua mang : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("In mang : ");
        for(int a : arr){
            System.out.print(a+" ");
        }

        System.out.print("\nMang sau khi sap xep : ");
        Sort(arr);
        for(int z:arr){
            System.out.print(" "+z);
        }

        System.out.println("\nPhan tu can tim kiem trong mang : ");
        int x = sc.nextInt();
        int result = BinarySearch(arr,x,0,arr.length-1);
        if(result==-1){
            System.out.print("Khong tim thay phan tu " + x + " trong mang");
        }
        else{
            System.out.print("phan tu " + x + " co trong mang");
        }
    }
}