# 배운내용 정리

## 07/20

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
