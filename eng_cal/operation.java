package com.example.eng_cal;

import java.util.Stack;

public class operation {
    double x;
    double y;

    void split(Stack<String> st_num, Stack<String> op, String s) {
        String str = s.substring(0,3);
        String num = s.substring(3);
        op.push(str);
        st_num.push(num);
    }
    double sum(double x, double y) {
        return x + y;
    }
    double sub(double x, double y) {
        return x - y;
    }
    double mul(double x, double y) {
        return x * y;
    }
    double div(double x, double y) {
        return x / y;
    }

    double sin(double x) {
        return Math.sin(Math.toRadians(x));
    }
    double cos(double x) {
        return Math.cos(Math.toRadians(x));
    }
    double tan(double x) {
        return Math.tan(Math.toRadians(x));
    }

    int fac(double y) {
        int x = (int) y;
        int res = 1;
        if (x <= 0)
            return 1;
        if (x > 0)
            for(int i = 0; i < x; i++)
                return res = fac(x-1)*x;
        return res;
    }

    double mod(double x, double y) {
        return (x % y);
    }
    double abs(double x) {
        return Math.abs(x);
    }
    double pi(double x) {
        return Math.PI;
    }
    double e(double x) {
        return Math.E;
    }

    double inv(double x) {
        return (1/x);
    }
    double pow(double x, double y) {
        return Math.pow(x,y);
    }
    double rt(double x) {
        return Math.sqrt(x);
    }
    double log(double x) {
        return Math.log10(x);
    }
    double ln(double x) {
        return Math.log(x);
    }

    double negative(double x) {
        return ((-1)*x);
    }
    double exp(double x, double y) {
        return (x* Math.pow(10, y));
    }
}