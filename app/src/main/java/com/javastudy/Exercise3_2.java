package com.javastudy;

//사과의 수가 123개 이고 하나의 바구니에 10개를 담을 수 있다면 13개의 바구니가 필요할 것.
// (1)에 들어갈 말을 적으시오.

class       Exercise3_2   {
  public   static    void   main(String[]   args)    {
    int   numOfApples   =    123;                //   사과의   개수
    int   sizeOfBucket   =   10;                //   바구니의    크기    바구니에   담을   수   있는   사과의   개수                                                                                                                        (                                                                                                                                   )
    int   numOfBucket   =    (   numOfApples / sizeOfBucket + 1   );       //   모든   사과를   담는데   필요한   바구니의    수
    System.out.println("필요한   바구니의   수    :"+numOfBucket); }
}