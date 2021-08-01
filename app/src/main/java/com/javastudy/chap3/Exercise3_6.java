package com.javastudy.chap3;
// num값보다 크면서 가장 가까운 10의배수에서 num값을 뺀 나머지를 구하는 코드
// 
class       Exercise3_6   {
  public   static    void   main(String[]   args)    {
    int   num   =   24;
    System.out.println((num/10+1)*10 - num); }
}
