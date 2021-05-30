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

    initial screen
    
    ![initial](https://user-images.githubusercontent.com/62055003/120094033-f3699d80-c158-11eb-9a0b-ab571747bc65.png)

    binary operation
    
    four fundamental rules of arithmetics(sum, sub, mul, div), mod
    
    ![binaryop](https://user-images.githubusercontent.com/62055003/120094045-05e3d700-c159-11eb-9346-3f80848c5a19.png)

    transcendental function
    
    trigonometrical function(sin, cos, tan)
    
    common logarithm(log)
    
    natural logarithm(ln)
    
    exponential(10E7=10000000)

    ![transcendental function](https://user-images.githubusercontent.com/62055003/120094053-11cf9900-c159-11eb-864b-d465ca22adf8.png)

    unary operation
    
    factorial absulute value inverse power square root

    ![unaryop](https://user-images.githubusercontent.com/62055003/120094060-198f3d80-c159-11eb-84a9-69695f7dba99.png)

    π pi circular constant
    
    ![pi](https://user-images.githubusercontent.com/62055003/120094066-214ee200-c159-11eb-979c-5c5df1852d49.png)

    e Euler's Number Napier's Constant

    ![e](https://user-images.githubusercontent.com/62055003/120094074-31ff5800-c159-11eb-94d6-201281793ea2.png)

    clear & scroll
    
    ![clear scroll](https://user-images.githubusercontent.com/62055003/120094080-3af02980-c159-11eb-9ebd-316c8566f08d.png)
