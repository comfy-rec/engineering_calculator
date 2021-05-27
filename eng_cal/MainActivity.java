package com.example.eng_cal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.text.method.ScrollingMovementMethod;

public class MainActivity extends AppCompatActivity {
    //변수 선언
    Button sin, cos, tan, clear, del;
    Button fac, mod, abs, pi, e;
    Button inv, pow, rt, log, ln;
    Button num7, num8, num9, par1, par2;
    Button num4, num5, num6, mul, div;
    Button num1, num2, num3, sum, sub;
    Button num0, point, negative, exp, answer;
//onClick
//btSin, btCos, btTan, btC, btDel
//btFac, btMod, btAbs, btPi, btE
//btInv, btPow, btRt, btLog, btLn
//bt7, bt8, bt9, btPar1, btPar2
//bt4, bt5, bt6, btMul, btDiv
//bt1, bt2, bt3, btSum, btSub
//bt0, btPoint, btNeg, btExp, btAns

    TextView inputFormula;
    TextView outputLog;

    String operator, inFor;
    String logData;
    Double res;
    stackPriority sp;

    //public static final double π = Math.PI;
    //public static final double e = Math.E;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //초기화
        init();
        //버튼 리스터
        setNumListener();
        setOperaListener();
    }
    //초기화 함수
    void init(){
        //버튼 연결
        sin = (Button) findViewById(R.id.sin);
        cos = (Button) findViewById(R.id.cos);
        tan = (Button) findViewById(R.id.tan);
        clear = (Button) findViewById(R.id.clear);
        del = (Button) findViewById(R.id.del);

        fac = (Button) findViewById(R.id.fac);
        mod = (Button) findViewById(R.id.mod);
        abs = (Button) findViewById(R.id.abs);
        pi = (Button) findViewById(R.id.pi);
        e = (Button) findViewById(R.id.e);

        inv = (Button) findViewById(R.id.inv);
        pow = (Button) findViewById(R.id.pow);
        rt = (Button) findViewById(R.id.rt);
        log = (Button) findViewById(R.id.log);
        ln = (Button) findViewById(R.id.ln);

        num7 = (Button) findViewById(R.id.num7);
        num8 = (Button) findViewById(R.id.num8);
        num9 = (Button) findViewById(R.id.num9);
        par1 = (Button) findViewById(R.id.par1);
        par2 = (Button) findViewById(R.id.par2);

        num4 = (Button) findViewById(R.id.num4);
        num5 = (Button) findViewById(R.id.num5);
        num6 = (Button) findViewById(R.id.num6);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);

        num1 = (Button) findViewById(R.id.num1);
        num2 = (Button) findViewById(R.id.num2);
        num3 = (Button) findViewById(R.id.num3);
        sum = (Button) findViewById(R.id.sum);
        sub = (Button) findViewById(R.id.sub);

        num0 = (Button) findViewById(R.id.num0);
        point = (Button) findViewById(R.id.point);
        negative = (Button) findViewById(R.id.negative);
        exp = (Button) findViewById(R.id.exp);
        answer = (Button) findViewById(R.id.answer);

        inputFormula = (TextView) findViewById(R.id.inputFormula);
        outputLog = (TextView) findViewById(R.id.outputLog);
        outputLog.setMovementMethod(new ScrollingMovementMethod());

        sp = new stackPriority();

        //변수 초기화
        operator = "";
        inFor = "";
        res = 0.0;
    }
    // number listener
    void setNumListener(){
        View.OnClickListener NumberListener = new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.num0:
                        inFor += "0";
                        operator += "0";
                        break;
                    case R.id.num1:
                        inFor += "1";
                        operator += "1";
                        break;
                    case R.id.num2:
                        inFor += "2";
                        operator += "2";
                        break;
                    case R.id.num3:
                        inFor += "3";
                        operator += "3";
                        break;
                    case R.id.num4:
                        inFor += "4";
                        operator += "4";
                        break;
                    case R.id.num5:
                        inFor += "5";
                        operator += "5";
                        break;
                    case R.id.num6:
                        inFor += "6";
                        operator += "6";
                        break;
                    case R.id.num7:
                        inFor += "7";
                        operator += "7";
                        break;
                    case R.id.num8:
                        inFor += "8";
                        operator += "8";
                        break;
                    case R.id.num9:
                        inFor += "9";
                        operator += "9";
                        break;
                }
                //inputFormula 출력
                inputFormula.setText(operator);
            }
        };
        num0.setOnClickListener(NumberListener);
        num1.setOnClickListener(NumberListener);
        num2.setOnClickListener(NumberListener);
        num3.setOnClickListener(NumberListener);
        num4.setOnClickListener(NumberListener);
        num5.setOnClickListener(NumberListener);
        num6.setOnClickListener(NumberListener);
        num7.setOnClickListener(NumberListener);
        num8.setOnClickListener(NumberListener);
        num9.setOnClickListener(NumberListener);
    }
    // operator listener
    void setOperaListener(){
        View.OnClickListener OperatorListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.sin:
                        inFor += "sin";
                        operator += "sin";
                        break;
                    case R.id.cos:
                        inFor += "cos";
                        operator += "cos";
                        break;
                    case R.id.tan:
                        inFor += "tan";
                        operator += "tan";
                        break;
                    case R.id.clear:
                        inFor="";
                        operator="";
                        inputFormula.setText("");
                        break;
                    case R.id.del:
                        inFor = inFor.substring(0, inFor.length()-1);
                        operator = inFor;
                        break;
                    case R.id.fac:
                        inFor += "!";
                        operator += "!";
                        break;
                    case R.id.mod:
                        inFor += "%";
                        operator += "%";
                        break;
                    case R.id.abs:
                        inFor += "abs";
                        operator += "abs";
                        break;
                    case R.id.pi:
                        inFor += "π";
                        operator += "π";
                        break;
                    case R.id.e:
                        inFor += "e";
                        operator += "e";
                        break;
                    case R.id.inv:
                        inFor += "^(neg1)";
                        operator += "^(neg1)";
                        break;
                    case R.id.pow:
                        inFor += "^";
                        operator += "^";
                        break;
                    case R.id.rt:
                        inFor += "√";
                        operator += "√";
                        break;
                    case R.id.log:
                        inFor += "log";
                        operator += "log";
                        break;
                    case R.id.ln:
                        inFor += "ln_";
                        operator += "ln";
                        break;
                    case R.id.par1:
                        inFor += "(";
                        operator += "(";
                        break;
                    case R.id.par2:
                        inFor += ")";
                        operator += ")";
                        break;
                    case R.id.mul:
                        inFor += "×";
                        operator += "×";
                        break;
                    case R.id.div:
                        inFor += "÷";
                        operator += "÷";
                        break;
                    case R.id.sum:
                        inFor += "+";
                        operator += "+";
                        break;
                    case R.id.sub:
                        inFor += "-";
                        operator += "-";
                        break;
                    case R.id.point:
                        inFor += ".";
                        operator += ".";
                        break;
                    case R.id.negative:
                        inFor += "neg";
                        operator += "-";
                        break;
                    case R.id.exp:
                        inFor += "E";
                        operator += "E";
                        break;
                    case R.id.answer:
                        inFor += "";
                        operator += "=";
                        sp.makeStack(inFor);
                        res = Double.parseDouble(sp.stackNum.pop());
                        operator = res+"";

                        logData = inFor+"="+res;
                        outputLog.append(logData+"\n");
                        break;
                }
                // inputFormula 출력
                inputFormula.setText(operator);

            }
        };
        sin.setOnClickListener(OperatorListener);
        cos.setOnClickListener(OperatorListener);
        tan.setOnClickListener(OperatorListener);
        clear.setOnClickListener(OperatorListener);
        del.setOnClickListener(OperatorListener);

        fac.setOnClickListener(OperatorListener);
        mod.setOnClickListener(OperatorListener);
        abs.setOnClickListener(OperatorListener);
        pi.setOnClickListener(OperatorListener);
        e.setOnClickListener(OperatorListener);

        inv.setOnClickListener(OperatorListener);
        pow.setOnClickListener(OperatorListener);
        rt.setOnClickListener(OperatorListener);
        log.setOnClickListener(OperatorListener);
        ln.setOnClickListener(OperatorListener);

        par1.setOnClickListener(OperatorListener);
        par2.setOnClickListener(OperatorListener);
        mul.setOnClickListener(OperatorListener);
        div.setOnClickListener(OperatorListener);
        sum.setOnClickListener(OperatorListener);
        sub.setOnClickListener(OperatorListener);

        point.setOnClickListener(OperatorListener);
        negative.setOnClickListener(OperatorListener);
        exp.setOnClickListener(OperatorListener);
        answer.setOnClickListener(OperatorListener);
    }
}
