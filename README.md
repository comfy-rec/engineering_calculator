# engineering_calculator

## 1. Purpose

    design an engineering calculator.
    
    implement an engineering calculator as an application.
    
    JAVA , XML, Eclipse, Android studio

## 2. Design

### 2-1. UML(Unified Modeling Language) Diagram

#### 2-1-1. Use Case Diagram

#### 2-1-2. Sequence Diagram

#### 2-1-3. Class Diagram

### 2-2. Class

    activity_main.xml - layout

    MainActivity.java - button listener & selection, output display

    operation.java - operation definition

    stackPriority.java - operation & stack priority decision, postfix operation

### 2-3. Constructor

    stackPriority.java  
    stackPriority() - stack initialization & allocation

### 2-4. Method

    MainActivity.java  
    void init() - initialization  
    void setNumListener() - number display  
    void setOperaListener() - operator display

    operation.java  
    void split(Stack<String> st_num, Stack<String> op, String s) - number & operator split

    stackPriority.java  
    void makeStack(String inputFormula) - stack control  
    void calStack(String op) - calculation  
    void assignPri(String post) - priority assignment & comparision  
    boolean isOperator(String s) - ( & operator verification  
    boolean isdigit(String s) - number verification

### 2-5. Layout

    activity_main.xml
    
    LinearLayout - higher hierarchy
    
    TextView - outputLog display
    
    TexrView - inputFormula display
    
    TableLayout - button display

### 2-6. Data Type

    data include numbers and operators.

    input data type - String
   
    operating data type - Double
   
    output data type - String

## 3. Conclusion
