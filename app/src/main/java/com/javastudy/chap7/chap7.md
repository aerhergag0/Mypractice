### 상속

##### 7-3
###### 오버라이딩의 정의와 필요성
오버라이딩 : 조상 클래스로부터 상속 받은 매서드를 자손 클래스에 맞게 재정의   
필요 이유 : 상속받은 매서드를 그대로 사용 할 수 없는 경우를 위해

##### 7-4
###### 다음 중 오버라이딩의 조건으로 옳지 않은 것은? (모두 고르시오)
a.   조상의   메서드와    이름이    같아야    한다.   
b.   매개변수의   수와    타입이    모두   같아야   한다.   
c.   접근   제어자는   조상의   메서드보다    좁은   범위로만    변경할   수   있다.   
d.   조상의   메서드보다    더    많은    수의   예외를    선언할   수   있다.   

-> c , d 

##### 7-6
###### 자손 클래스의 생성자에서 조상 클래스의 생성자를 호출해야 하는 이유는?

조상에 정의된 인스턴스 변수들이 초기화 되도록 하기 위해

##### 7-7
###### 코드 실행시 호출되는 생성자의 순서와 실행 결과?
```aidl
class   Parent    {
 int   x=100;
 Parent()   {
  this(200);
 }
 
 Parent(int x) { 
  this.x   =   x;
}

 int getX()   {
  return x;
  } 
}

class Child extends Parent {
 int   x    =   3000;

 Child()   {
  this(1000);
}
 Child(int x) { 
 this.x   =   x;
 }
}
class   Exercise7_7   {
    public   static    void   main(String[]   args)    {
    Child   c   =   new   Child();
    System.out.println("x="+c.getX());
   }
}
```
Child() - Child(int x) - Parent() - Parent(int x) - Object()의 순으로 실행된다.   
실행결과 x=200

##### 7-8

######접근 제어자를 접근 범위가 넓은 순으로

public - protected - default - private

##### 7-9

###### 제어자 final을 붙일 수 있는 대상과 붙였을 때 의미

지역변수, 멤버변수 - 값을 변경 할 수 없다.   
메서드 - 오버라이딩을 할 수 없다.   
클래스 - 확장할 수 없는 클래스가 된다.

##### 7-12
###### 접근 제한자에 대한 설명으로 옳지 않은 것은?

a. public은 접근제한이 전혀 없는 접근 제어자이다.   
b. (default)가 붙으면, 같은 패키지 내에서만 접근이 가능하다.   
c. 지역변수에도 접근 제어자를 사용할 수 있다.   
d. protected가 붙으면,같은 패키지 내에서도 접근이 가능하다.   
e. protected가 붙으면,다른 패키지의 자손 클래스에서 접근이 가능하다.   

c - 접근 제한자가 사용될 수 있는 곳 - 클래스, 멤버변수, 메서드, 생성자

##### 7-13
###### Math클래스의 생성자는 접근 제어자가 private인 이유는?

Math클래스의 모든 메서드가 static 메서드이고 인스턴스 변수가 존재하지 않기 떄문
, 외부에서의 불필요한 접근을 막기 위해

##### 7-15
###### 형변환을 올바르게 한 것은?
```aidl
class   Unit   {}
class   AirUnit   extends   Unit   {}
class   GroundUnit   extends    Unit   {}
class   Tank   extends   GroundUnit   {}
class   AirCraft   extends   AirUnit   {}
Unit   u   =   new   GroundUnit();
Tank   t   =   new   Tank();
AirCraft   ac   =    new   AirCraft();
```
a.   u   =   (Unit)ac;  
b.   u   =   ac;  
c.   GroundUnit    gu    =    (GroundUnit)u;  
d.   AirUnit   au    =   ac;  
e.   t   =   (Tank)u;  
f.   GroundUnit    gu    =    t;  

e - 조상타입의 인스턴스를 자손타입으로 형변환 할 수 없다.

##### 7-16 다음 중 연산결과가 true 가 아닌 것은?