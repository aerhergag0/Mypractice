### class

##### 6-8
다음 중 정의된 변수들을 구분하라.
```
class   PlayingCard   {
    int   kind;
    int   num;
    
    static   int   width;
    static   int   height;
    
    PlayingCard(int   k,   int   n)   {
        kind = k;
        num = n;
    }
    public static void main(String args[])   {
        PlayingCard card   = new PlayingCard(1,1);
    }
}
```
- 클래스변수(static변수) : width, height
- 인스턴스 변수 : kind, num
- 지역변수 : k, n, card, args

##### 6-9 