package com.javastudy.chap3;
//대문자를 소문자로 변경하는 코드, 문자ch에 저장된 문자가 대문자인 경우에만 소문자로 변경
// 소문자가 대문자보다 32만큼 더크다
class       Exercise3_10   {
  public   static    void   main(String[]   args)    {
    char   ch   =   'A';
    char   lowerCase   =   ('z' >ch + 32)   ?   (char)(ch + 32)   :   ch;
    System.out.println("ch:"+ch);
    System.out.println("ch   to   lowerCase:"+lowerCase); }
}
