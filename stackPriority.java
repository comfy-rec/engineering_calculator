package com.example.eng_cal;

import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;

public class stackPriority extends operation{
    Stack<String> stackOp = new Stack<>();
    Stack<String> stackNum = new Stack<>();
    HashMap<String, Integer> priorityMap;

    {
        priorityMap= new HashMap<>();
        priorityMap.put("(", 4);
        priorityMap.put("+", 3);
        priorityMap.put("-", 3);
        priorityMap.put("/", 2);
        priorityMap.put("*", 2);
        priorityMap.put("sin", 1);
        priorityMap.put("cos", 1);
        priorityMap.put("tan", 1);
        priorityMap.put("e", 1);
        priorityMap.put("log", 1);
        priorityMap.put("^", 0);

    }

    stackPriority(){
        if(!stackOp.isEmpty()) {
            stackOp.clear();
        }
        if(!stackNum.isEmpty()) {
            stackNum.clear();
        }
        stackOp = new Stack<>();
        stackNum = new Stack<>();
    }
    void makeStack(String inputFormula) {
        StringTokenizer str = new StringTokenizer(inputFormula, "+-*/()^",true);
        String tmp = "";
        while(str.hasMoreTokens()) {
            tmp = str.nextToken();
            if(isOperator(tmp) == true) {
                if(stackOp.isEmpty()) {
                    stackOp.push(tmp);
                    continue;
                }
                switch(tmp) {
                    case "(" :
                        stackOp.push(tmp);
                        break;
                    case ")":
                        while(!stackOp.peek().equals("(")) {
                            calStack(stackOp.pop());
                        }
                        stackOp.pop();
                        break;
                    default:
                        assignPri(tmp);
                        break;
                }
            }
            else {
                if(!isdigit(tmp)) {
                    split(stackNum, stackOp, tmp);
                }
                else {
                    stackNum.push(tmp);
                }
            }
        }
        while(!stackOp.isEmpty()) {  // *****stackNum 따로 처리 수정 필요****
            tmp = stackOp.pop();
            calStack(tmp);
        }
    }
    void calStack(String op) {
        String num1, num2;
        double n1, n2;
        double cal;

        switch(op) {
            case "+" :
                num2 = stackNum.pop();     //num2= pop
                n2 = Double.parseDouble(num2);
                num1 = stackNum.pop();     //num1 = pop
                n1 = Double.parseDouble(num1);
                cal = add(n1,n2);
                System.out.println(Double.toString(cal));

                stackNum.push(Double.toString(cal));
                break;
            case "-" :
                num2 = stackNum.pop();     //num2= pop
                n2 = Double.parseDouble(num2);
                num1 = stackNum.pop();     //num1 = pop
                n1 = Double.parseDouble(num1);
                cal = sub(n1,n2);
                System.out.println(Double.toString(cal));

                stackNum.push(Double.toString(cal));
                break;
            case "*" :
                num2 = stackNum.pop();     //num2= pop
                n2 = Double.parseDouble(num2);
                num1 = stackNum.pop();     //num1 = pop
                n1 = Double.parseDouble(num1);
                cal = mul(n1,n2);
                System.out.println(Double.toString(cal));

                stackNum.push(Double.toString(cal));
                break;
            case "/" :
                num2 = stackNum.pop();     //num2= pop
                n2 = Double.parseDouble(num2);
                num1 = stackNum.pop();     //num1 = pop
                n1 = Double.parseDouble(num1);
                cal = div(n1,n2);
                System.out.println(Double.toString(cal));

                stackNum.push(Double.toString(cal));
            case "sin" :
                num1 = stackNum.pop();
                n1 = Double.parseDouble(num1);
                cal = sin(n1);
                System.out.println(Double.toString(cal));

                stackNum.push(Double.toString(cal));
                break;
            case "cos" :
                num1 = stackNum.pop();
                n1 = Double.parseDouble(num1);
                cal = cos(n1);
                System.out.println(Double.toString(cal));

                stackNum.push(Double.toString(cal));
                break;
            case "tan" :
                num1 = stackNum.pop();
                n1 = Double.parseDouble(num1);
                cal = tan(n1);
                System.out.println(Double.toString(cal));

                stackNum.push(Double.toString(cal));
                break;
            case "exp" :
                num1 = stackNum.pop();
                n1 = Double.parseDouble(num1);
                cal = exp(n1);
                System.out.println(Double.toString(cal));

                stackNum.push(Double.toString(cal));
                break;
            case "log" :
                num1 = stackNum.pop();
                n1 = Double.parseDouble(num1);
                cal = log(n1);
                System.out.println(Double.toString(cal));

                stackNum.push(Double.toString(cal));
                break;
            case "^" :
                num2 = stackNum.pop();     //num2= pop
                n2 = Double.parseDouble(num2);
                num1 = stackNum.pop();     //num1 = pop
                n1 = Double.parseDouble(num1);
                cal = pow(n1,n2);
                System.out.println(Double.toString(cal));

                stackNum.push(Double.toString(cal));
                break;
        }
    }
    void assignPri(String post) {
        String pre = stackOp.peek();
        //연산자 우선순위 비교
        if(priorityMap.get(pre) > priorityMap.get(post)) { //post 우선순위가 높을때 -> 푸쉬
            stackOp.push(post);
        }
        else {                                             // pre 팝 post 푸쉬
            pre = stackOp.pop();
            calStack(pre);
            if(stackOp.isEmpty()) {
                stackOp.push(post);
            }
            else {
                assignPri(post);
            }
        }
    }
    boolean isOperator(String s) {
        if(s.equals(")")){
            return true;
        }
        return priorityMap.containsKey(s);
    }
    boolean isdigit(String s) {
        if(s.charAt(0) >= '0' && s.charAt(0) <= '9') {
            return true;
        }
        return false;
    }
}