package com.javastudy;
// 화씨를 섭씨로 C=5/9 * (F-32) 변환결과값은 소수 셋째자리에서 반올림
class       Exercise3_7   {
  public   static    void   main(String[]   args)    {
    int   fahrenheit   =   100;
    float   celcius   =   (int)((5/9f *(fahrenheit -32))* 100 + 0.1 )/ 100f;
    System.out.println("Fahrenheit:"+fahrenheit); System.out.println("Celcius:"+celcius);
  } }
