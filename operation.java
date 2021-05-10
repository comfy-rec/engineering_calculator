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
    double add(double x, double y) {
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
    double exp(double x) {
        return Math.exp(x);
    }
    double log(double x) {
        return Math.log10(x);
    }
    double pow(double x, double y) {
        return Math.pow(x,y);
    }
}