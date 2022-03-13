package com.phenikaa;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public static boolean isBoolean(Point a, Point b, Point c){
        //-------------------------------- khoang cach 2 giua 2 diem-----------------------------
        double d1=Math.sqrt((a.getX()-b.getX())*(a.getX()-b.getX())+(a.getY()-b.getY())*(a.getY()-b.getY()));
        double d2=Math.sqrt((a.getX()-c.getX())*(a.getX()-c.getX())+(a.getY()-c.getY())*(a.getY()-c.getY()));
        double d3=Math.sqrt((c.getX()-b.getX())*(c.getX()-b.getX())+(c.getY()-b.getY())*(c.getY()-b.getY()));
        if (d1+d2==d3||d1+d3==d2||d2+d3==d1) {
            return true;
        }
        return false;
    }
    //-----------------------kiem tra thang hang-------------------------
    public static void Analysis(Point a, Point b, Point c){
        if (isBoolean(a, b, c)){
            System.out.println("thang hang");
        }
        else {

            double d1=Math.sqrt((a.getX()-b.getX())*(a.getX()-b.getX())+(a.getY()-b.getY())*(a.getY()-b.getY()));
            double d2=Math.sqrt((a.getX()-c.getX())*(a.getX()-c.getX())+(a.getY()-c.getY())*(a.getY()-c.getY()));
            double d3=Math.sqrt((c.getX()-b.getX())*(c.getX()-b.getX())+(c.getY()-b.getY())*(c.getY()-b.getY()));
            System.out.println("3 diem tao thanh tam giac");


            //--------------chu vi----------------
            double p=d1+d2+d3;
            double p1=p/2;


            //------------------dien tich-----------------
            double S=Math.sqrt(p1*(p1-d1)*(p1-d2)*(p1-d3));
            System.out.printf("AB = "+d1 + "\nAC = "+d2+ "\nBC = "+d3);
            System.out.println("\nChu vi : "+p);
            System.out.println("Dien tich : "+S);
        }
    }


}
