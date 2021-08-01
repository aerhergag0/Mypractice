package com.javastudy.chap3;

// num 값에 따라 양수, 음수, '0'을 출력한다. 삼항 연산자를 사용하라
class       Exercise3_3   {
  public   static    void   main(String[]   args)    { 
    int   num   =   10;
    System.out.println(num>0 ? "양수": (num <0 ? "음수" : '0')); }
}
