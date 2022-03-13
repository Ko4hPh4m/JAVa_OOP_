package com.phenikaa;


import static com.phenikaa.Point.Analysis;

public class Main {

    public static void main(String[] args) {
    Point a=new Point(0,0);
    Point b=new Point(3,5);
    Point c=new Point(2,4);
    Point.Analysis(a, b, c);

    Stack stack = new Stack(4); // Khoi tao stack voi max 5 phan tu
        stack.push(16);
        stack.push(3);
        stack.push(24);
        stack.push(10);

        System.out.println("Peek : "+stack.peek());
        System.out.println("Pop : "+stack.pop());
        stack.push(2002);
        System.out.println(stack.isEmpty()?"Stack rong ":"Stack khong rong");
        System.out.println(stack.isFull()?"Stack day":"Stack chua day");
    }
}
