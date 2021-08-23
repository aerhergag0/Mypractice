### Exception handling

#### 8-1 예외처리의 정의와 목적

정의 : 프로그램 실행 시 발생할 수 있는 예외에 대비하기 위한 코드를 작성하는 것   
목적 : 비정상 종료를 막고, 정상 실행을 유지시키는 것


#### 8-2 다음 중 옳지 않은 것은?
```
java.lang.ArithmeticException   :   /    by   zero   
at ExceptionEx18.method2(ExceptionEx18.java:12)    
at ExceptionEx18.method1(ExceptionEx18.java:8)    
at ExceptionEx18.main(ExceptionEx18.java:4)
```
a.   위의   내용으로   예외가   발생했을    당시   호출스택에    존재했던   메서드를   알    수   있다.   
b. 예외가 발생한 위치는 method2 메서드이며, ExceptionEx18.java파일의 12번째 줄이다.   
c.   발생한   예외는   ArithmeticException이며,   0으로   나누어서    예외가   발생했다.   
d.    method2메서드가    method1메서드를    호출하였고    그    위치는    ExceptionEx18.java파일의    8 번째   줄이다.

12번째 줄에서 예외가 발생하였다.

#### 8-3 다음 중 오버라이딩이 잘못된 것은?
```
void   add(int   a,   int   b) 
    throws   InvalidNumberException,   NotANumberException { }
class   NumberException   extends   Exception   {}
class   InvalidNumberException   extends    NumberException   {}
class   NotANumberException   extends    NumberException   {}
```

a.   void    add(int    a,   int   b)   throws   InvalidNumberException,    NotANumberException   {}   
b.   void    add(int    a,   int   b)   throws   InvalidNumberException   {}   
c.   void    add(int    a,   int   b)   throws   NotANumberException   {}   
d.   void    add(int    a,   int   b)   throws   Exception   {}   
e.   void    add(int    a,   int   b)   throws   NumberException   {}   

d,e 오버라이딩을 할 때, 조상 클래스보의 메서드보다 많은 수의 예외를 선언 할 수 없다.

#### 8-4 