# 공부한 내용 정리

## Week01

##### [printf 서식문자 활용]

---------------
+ 문자열

입력한 숫자만큼의 공간을 할당한다. 음수는 왼쪽부터 문자열을 출력  
```java
System.out.printf("[%15s]",java);
System.out.printf("[%-15s]",java);
```


+ 실수 소수점 출력

소수점 3째자리까지 출력  
```
  System.out.printf("%.3f",10.0/3);
```
---------------------

##### [charAt(), indexOf(), equals(), length() , subString()]

해당 메서드를 사용하기 위해 String 변수명 뒤에 . 을 붙여 사용한다.

char  charAt(int index) : 문자열에서 해당 index에 있는 문자를 출력한다. -48 또는 -'0' 등을 통하여 정수값으로 사용할 수 있다.  
int  indexOf(String str) : 문자열에서 특정 '문자'가 시작되는 '위치(index)'를 반환한다. 해당 문자가 없으면 -1을 출력한다.  
int  length() : 문자열의 길이를 반환한다.    
boolean  equals(String str) : 문자열이 동일한지 확인한다. 같으면 true를 반환한다.   
String  subString(int index1, int index2) : 시작 인덱스의 문자 부터 끝 인덱스의 문자까지의 문자열을 반환한다.  

------------------------

##### [for-each 문]
```
for(변수타입 변수이름 : 배열이름)
  실행부분;
```

반복이 이루어 질때 마다 배열의 항목을 순서대로 꺼내어 변수에 자동으로 대입시킨다.

ArrayIndexOutOfBoundsException 예외를 피할 수 있으나, 배열의 값을 사용하는 것만 가능하고 수정할 수 없다는 단점이 있다.


_____________

##### [java api document]

+ java.lang
자바 프로그램의 기본적인 클래스를 담고 있는 패키지. import 없이 사용할 수 있다.
  + Object  
자바 클래스의 최상위 클래스
  + System   
키보드 등으로부터 데이터를 입력받을때, 모니터 등으로 데이터를 출력할 때, 자바 가상기계를 종료시킬 때 등 사용
  + Class    
클래스를 메모리로 로딩 할때
  + String  
문자열을 저장하고 여러 정보를 얻어 올때 사용   
  + StringBuffer, StringBuilder   
문자열을 저장하고 내부 문자열을 조작할 때
  + Math   
수학 함수를 사용할 때
  + Wrapper(Byte,Short,Character,Integer ... )    
데이터에 맞는 객체를 만들 때, 문자열을 기본 타입으로 변환 할 때 등..

+ java.util   
유용한 클래스, 자료구조에 사용되는 클래스 등을 담고 있다.
  + Arrays   
배열을 조작시에 사용
  + Calendar , Date   
날짜와 시간 정보를 얻고 조작시 사용
  + Objects   
객체 비교, null 여부등을 조사시 사용
  + StringTokenizer   
특정 문자로 구분된 문자열을 뽑아올때 사용
  + Random   
난수를 얻을 때 사용

------------------------------

##### StringTokenizer

+ 문자열을 지정한 구분자로 쪼개주는 클래스이다.   
  + public StringTokenizer(String str);   
매개변수 str을 기본 공백 문자들을 기준으로 분리한다.
  + public StringTokenizer(String str, String delim);   
특정 delim으로 문자열을 분리한다.
  + public StringTokenizer(String str, String delim, boolean returnDelims);   
str을 특정 delim으로 분리시키고 그 delim까지 token으로 포함시킬지 결정한다. true일시 포함한다.
  + int countTokens()   
남아있는 token의 수를 반환한다. 전체 token이 아닌 현재 남아있는 token의 수 임에 유의
  + boolean hasMoreElements(), boolean hasMoreTokens()   
다음의 token이 존재하면 true값을 반환한다. 두 메서드 모두 같은 값을 반환한다. 
  + Object nextElementt(), String nextToken()   
다음의 token을 반환한다.

## Week02

##### vscode emmet 기능 활용
