package com.javastudy;
// 문자형 변수 ch가 영문자이거나 숫자일때만 변수b의 값이 true가 되게한다.
class       Exercise3_9   {
  public   static    void   main(String[]   args)    { 
    char   ch   =   'z';
    boolean   b   =    (ch>='a'||ch<='z'||ch>='A'||ch<='Z'||ch>='0'||ch<='9'); 
    System.out.println(b);
  } }
