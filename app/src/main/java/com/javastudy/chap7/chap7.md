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
