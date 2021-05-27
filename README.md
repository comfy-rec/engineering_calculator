# engineering_calculator

## 1. 목적
    design an engineering calculator.  
    implement an engineering calculator as an application.
    
    JAVA , XML, Eclipse, Android studio

## 2. 설계

### 2-1. UML(Unified Modeling Language) Diagram

#### 2-1-1. Use Case Diagram

#### 2-1-2. Sequence Diagram

#### 2-1-3. Class Diagram

### 2-2. Class

    activity_main.xml - layout

    MainActivity.java - button listener & selection, output display

    operation.java - operation definition

    stackPriority.java - operation & stack priority decision, postfix operation

### 2-3. Method

    activity_main.xml

    MainActivity.java  
    void init() - initialization  
    void setNumListener() - number display  
    void setOperaListener() - operator display

    operation.java  
    void split(Stack<String> st_num, Stack<String> op, String s) - number & operator split

    stackPriority.java  
    stackPriority() - stack initialization & allocation  
    void makeStack(String inputFormula) - stack control  
    void calStack(String op) - calculation  
    void assignPri(String post) - priority assignment & comparision  
    boolean isOperator(String s) - ( & operator verification  
    boolean isdigit(String s) - number verification

### 2-4. Layout

    activity_main.xml - LinearLayout에서 TextView 출력창(outputLog), TexrView 입력창(inputFormula), TableLayout에서 버튼 배치.

### 2-5. Data Definition

    input datatype - String
   
    operating datatype - Double
   
    output datatype - String

## 3. 결과
