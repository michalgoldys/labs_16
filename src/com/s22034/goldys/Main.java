package com.s22034.goldys;

public class Main {

    public static void main(String[] args) {

        int a321132321132 = (int) Math.random() * 10;

        System.out.println(
                "==================================\n" +
                a321132321132   +
                "\n==================================\n"
        );

        char u = '1';
        switch (u){
            case 1: System.out.println("a");
                break;
            case 2: System.out.println("b");
                break;
        }


        System.out.println(
                "=================================="
        );

        int a = 5, b = 3, c = 4;
        a *= b + c;
        System.out.println((!(a == 19)) ? "OK" : "NIE OK");

        double k = 15/2;
        int cz = (!((Math.pow(Math.sqrt(2), 2) - 2) < 0)) ? 1 : 2 ;

        char [] tab11231 = {'a', 'b', 'c'};

        System.out.println(
                "==================================\n" +
                        cz      +
                "\n==================================\n"
        );

        int a1 = 4, b1 = 2, c1 = b1;
        a1 /= b1*c1--; System.out.println((a1 != 1) ? "OK" : "NIE OK");

        System.out.println(
                "=================================="
        );

        A var = new B();
        var.fun();

        D d = new D(3.14);
        System.out.println(
                "=================================="
        );

        int[] test = {1,2,3,4};
        int[] tes = new int[4];

        System.out.println(
                test.length
        );
        System.out.println(
                tes.length
        );

        System.out.println(
                test[3]
        );

        int binary = 0b00000000000000000000000000101111;


        System.out.println(
                binary
        );
        System.out.println(
                "=================================="
        );

        System.out.print(
                binary>>0 &1
        );
        System.out.print(
                binary>>1 &1
        );
        System.out.print(
                binary>>2 &1
        );
        System.out.print(
                binary>>3 &1
        );
        System.out.print(
                binary>>4 &1
        );
        System.out.print(
                binary>>5 &1
        );
        System.out.print(
                binary>>6 &1
        );
        System.out.print(
                binary>>7 &1
        );
        System.out.print(
                binary>>8 &1
        );
        System.out.print(
                binary>>9 &1
        );

        Zadanie przyklad = new Zadanie(12, 2.71, "e");
        przyklad.show();

    }
}

class NotVaildDataException extends Exception{

    public NotVaildDataException() {
        super("Not vaild data");
    }
}

class C{
    private int value;

    public C(int value) {
        this.value = value;
        System.out.print("_a" + value);
    }


    public C(double value) {
        this((int) value);
        System.out.print("_b" + value);
    }
}

class D extends C{

    public D(int value){
        super(value);
        System.out.print("_c" + value);
    }

    public D(double value){
        this((int) value);
        System.out.print("_d" + value);
    }


}

class A{

    public A(){
        System.out.print("A");
    }

    public void fun(){
        System.out.print("a");
    }
}

class B extends A{

    public void fun(){
        super.fun();
        System.out.print("b");
        super.fun();

    }
}

class Zadanie {
    int pole1;
    double pole2;
    String pole3;

    public Zadanie(int pole1, double pole2, String pole3) {
        this.pole1 = pole1;
        this.pole2 = pole2;
        this.pole3 = pole3;
    }

    public Zadanie(int pole1) {
        this(pole1, 3.14, "przyklad");
    }

    public void show() {
        System.out.println(pole1 + " " + pole2 + " " + pole3);
    }

    public static void main(String[] args) {
        Zadanie przyklad = new Zadanie(12, 2.71, "e");
        przyklad.show();
    }
}