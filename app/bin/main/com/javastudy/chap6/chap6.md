### class

##### 6-8
다음 중 정의된 변수들을 구분하라.
```
class   PlayingCard   {
    int   kind;
    int   num;
    
    static   int   width;
    static   int   height;
    
    PlayingCard(int   k,   int   n)   {
        kind = k;
        num = n;
    }
    public static void main(String args[])   {
        PlayingCard card   = new PlayingCard(1,1);
    }
}
```
- 클래스변수(static변수) : width, height
- 인스턴스 변수 : kind, num
- 지역변수 : k, n, card, args

##### 6-9
이 클래스의 멤버 중에 static을 붙여야 하는 것은 어떤것이고 이유는?
```
class   Marine    {
int   x=0,    y=0; //   Marine의   위치좌표(x,y)
int   hp   =   60; //   현재   체력
int   weapon =   6; //   공격력
int   armor =    0;       //    방어력
void   weaponUp()  {
 weapon++;
}
void  armorUp()   {
armor++; 
}
void move(int   x,   int   y)   {
 this.x   =   x;
 this.y   =   y; }
}
```
개별적인 값을 가져야 하는 값과 공통적으로 가져야 하는 값의 차이이다.   
공격력, 방어력이 그에 해당되므로   
weapon, armor, 메서드 weaponUp()과 armorUp()이 static이 붙는다.

##### 6-10
######다음 중 생성자에 대한 설명으로 옳지 않은 것은?   
a.    모든    생성자의   이름은   클래스의    이름과   동일해야한다.  
b.    생성자는    객체를   생성하기   위한    것이다.   
c.    클래스에는    생성자가   반드시   하나    이상   있어야   한다.  
d.    생성자가    없는   클래스는   컴파일러가    기본   생성자를    추가한다.  
e.    생성자는    오버로딩   할   수    없다.   

b -> 객체를 초기화 하기위해 사용되는 것이 생성자이고, 객체를 생성하는 것은 new이다.   
e -> 생성자도 오버로딩이 가능하고 한 클래스에 여러 생성자를 정의 할수 있다.

##### 6-11
######다음   중    this에    대한   설명으로   맞지    않은   것은?   (모두   고르시오)   
a.    객체    자신을   가리키는   참조변수이다.   
b.    클래스    내에서라면   어디서든   사용할    수   있다.   
c.    지역변수와    인스턴스변수를   구별할   때    사용한다.   
d.    클래스    메서드   내에서는   사용할    수   없다.

b-> this는 자신의 인스턴스 자신의 주소를 저장하고 있으며, 클래스 멤버에서는 사용 할수 없다.

##### 6-12
######다음 중 오버로딩이 성립하기 위한 조건이 아닌 것은? (모두 고르시오)
a.    메서드의    이름이   같아야   한다.   
b.    매개변수의    개수나   타입이   달라야    한다.   
c.    리턴타입이    달라야   한다.   
d.    매개변수의    이름이   달라야   한다   

c, d

##### 6-13
######다음 중 아래의 add메서드를 올바르게 오버로딩 한 것은? (모두 고르시오)
```
long add(int a, int b)   { return a+b; }
```
a.   long    add(int   x,    int   y)   {   return   x+y;}   
b.   long    add(long    a,   long   b)   {   return   a+b;}   
c.   int   add(byte   a,    byte   b)   {   return   a+b;}   
d.   int   add(long   a,    int   b)   {   return   (int)(a+b); }   

-> b,c,d

##### 6-14
######다음   중    초기화에   대한   설명으로   옳지   않은   것은?   (모두   고르시오)
a.멤버변수는   자동    초기화되므로   초기화하지    않고도   값을    참조할   수    있다.   
b.지역변수는   사용하기    전에   반드시    초기화해야    한다.   
c.초기화   블럭보다    생성자가   먼저    수행된다.   
d.명시적   초기화를    제일   우선적으로    고려해야   한다.   
e.클래스변수보다   인스턴스변수가    먼저   초기화된다.   

->c,e

##### 6-15
######다음중   인스턴스변수의    초기화   순서가    올바른   것은?
a.    기본값-명시적초기화-초기화블럭 -생성자           
b.    기본값-명시적초기화-생성자-초기화블럭   
c.    기본값-초기화블럭-명시적초기화  -  생성자            
d.    기본값-초기화블럭-생성자  -  명시적초기화 

->  a

##### 6-16
###### 다음   중    지역변수에   대한    설명으로   옳지    않은   것은?   (모두   고르시오)
a.    자동    초기화되므로   별도의   초기화가    필요없다.   
b.    지역변수가    선언된   메서드가   종료되면    지역변수도   함께    소멸된다.   
c.    매서드의    매개변수로   선언된   변수도    지역변수이다.   
d.    클래스변수나    인스턴스변수보다   메모리   부담이    적다.   
e.    힙(heap)영역에    생성되며   가비지    컬렉터에    의해    소멸된다.   

-> a, e   
e. heap 영역은 인스턴스가 생성되는 영역이며 지역변수는 호출 스택에 생성된다.

##### 6-17
######호출스택이   다음과    같은   상황일    때    옳지    않은   설명은?   (모두   고르시오)
```aidl
main - method2 - method1 - println 으로 스택되어있는 상태
```

a.    제일    먼저   호출스택에   저장된    것은   main메서드이다.   
b.   println메서드를   제외한    나머지   메서드들은    모두   종료된   상태이다.   
c.   method2메서드를   호출한    것은   main메서드이다.   
d.   println메서드가   종료되면    method1메서드가   수행을    재개한다.   
e.   main-method2-method1-println의   순서로    호출되었다.   
f.    현재    실행중인   메서드는   println    뿐이다.   

-> b

##### 6-18
에러가 발생하는 라인과 이유를 설명하라
```aidl
class MemberCall   {
int iv = 10;
static int cv = 20;

int iv2 = cv;
static int cv2   =   iv; // 라인 A

static void staticMethod1() {
    System.out.println(cv);
    System.out.println(iv); // 라인   B 
}
void instanceMethod1() {
    System.out.println(cv);
    System.out.println(iv); // 라인   C 
}
static void staticMethod2()   {
 staticMethod1();
 instanceMethod1();  //    라인   D
}
void instanceMethod2()   {
 staticMethod1(); // 라인   E
 instanceMethod1();
 }
}
```
-> 라인 A : static 변수 초기화에 인스턴스 변수를 사용할 수 없다. 사용해야 한다면 객체를 생성해야 한다.      
-> 라인 B : static 메서드에서 인스턴스 변수를 사용할 수 없다.   
-> 라인 D : static 메서드에서 인스턴스 메서드를 사용할 수 없다.

##### 6-19
다음 코드의 실행결과를 예측하라.
```aidl
class   Exercise6_19 {
    public   static    void   change(String   str) {
    str   +=   "456";
 }
    public   static    void   main(String[]   args) {
        String   str   =   "ABC123";
        System.out.println(str);
        change(str);
        System.out.println("After change:"+str);
 }
}
```
ABC123  
After change:ABC123

ABC123456이 될 것 같지만 반영되지 않았다.   
str가 지역변수이기 때문에 처음의 값과 변함없는 값이 출력된다.

