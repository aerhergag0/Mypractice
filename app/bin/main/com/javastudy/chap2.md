### Variable

#### 2-1 
boolean : 1byte 논리형   
char : 4byte 문자형(0 ~ 65535)   
byte : 1byte 정수형(-128 ~ 127)      
short : 2byte 정수형(-32768 ~ 32767)      
int : 4byte 정수형(약 +-20억)      
long : 8byte 정수형(약 +-1800경)   
float : 4byte 실수형(정밀도 7자리)     
double : 8byte 실수형(정밀도 15자리)       

#### 2-2

long regNo = 9410151111111L;   
리터럴은 기존 우리가 알고 있는 상수의 이름이다. 상수는 프로그래밍에서 저장하면 변동 불가능 한 값으로 정의한다.   
long 타입은 리터럴의 접미사 L을 끝에 붙여 사용해야 한다.   

#### 2-3
```
int i=100;
long l = 100L;
final float PI = 3.14f;
```
리터럴 : 100, 100L, 3.14f   
변수 : i, l   
키워드 : int, long, final, float   
상수 : PI

#### 2-4

기본형 타입이 아닌 것은?    
=> Byte   
=> 기본형은 byte이고, 그 외의 타입은 reference type(참조형) 이다.

#### 2-5

```
System.out.println("1" + "2");
System.out.println(true + "");
System.out.println('A' + 'B');
System.out.println('1' + 2);
System.out.println('1' + '2');
System.out.println('J' + "ava");
System.out.println(true + null);
```

12   
true   
131   
51   
99   
Java   
오류   

문자열과 덧셈연산을 하면 결과는 문자열이된다.   
하지만 문자와 문자의 덧셈연산은 int형 정수값이 된다. 

#### 2-6

키워드는 소문자로 시작한다. true와 True는 다르다.

#### 2-7

변수 이름으로 사용할 수 있는 것 : $ystem, If, 자바, $MAX_NUM    
변수 이름으로 사용할 수 없는 것 : 예약어, 특수문자$와_ 를 제외한 나머지, 숫자로 시작

#### 2-8

참조형 변수와 같은 크기의 기본형?   
=> 모든 참조형 변수는 4byte이므로 같은 크기의 기본형은 int와 float이다.

#### 2-9

형변환을 생략할 수 있는 것은?   
=> 범위가 다르거나 더 작은 값에 넣을 때 반드시 형변환을 해주어야 한다.   
=> 특히, char

#### 2-10

char타입에 변수에 저장될 수 있는 값은?   
=> 0 - 65535

#### 2-11

변수를 잘못 초기화 한 것은?   
```
byte b = 256;
char c = '';
char answer = 'no';
float f = 3.14;
```
범위를 넘는값, char는 반드시 한 개의 문자를 저장 해야함, char에 두 문자를 저장할 수 없음, 3.14는 3.14d의 생략된 값이므로 3.14f이여야 한다.

#### 2-12
=> public static void main(String[] args)   
=> public static void main(String args[])   
=> public static void main(String arv)   
=> static public void main(String[] args)   
모두 같은 표현이다.

#### 2-13

타입의 기본값   
boolean - false   
char - '\u0000'   
float - 0.0f   
int - 0   
long - 0L   
String은 참조형(reference type) 타입 , 모든 참조형 타입은 기본값이 null이다.

#### 2-14

