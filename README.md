# 배운내용 정리

## 07/20

+[printf 서식문자 활용]

---------------
+문자열
%S : 문자열 대문자로 출력

```java
System.out.printf("[%15]",java);
System.out.printf("[%-15]",java);
```
입력한 숫자만큼의 공간을 할당한다. 음수는 왼쪽부터 문자열을 출력

+실수,출력
`System.out.printf("%.3f",10.0/3);
소수점 3째자리까지 출력
