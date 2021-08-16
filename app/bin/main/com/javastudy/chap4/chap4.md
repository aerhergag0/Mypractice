### if, while, for

#### 4-1 
1. if(10>=x && x<=20)   
      true;    
2. if(ch!=' ' || '  ')   
      true;    
3. if(ch=='x' || ch=='X')   
      true;    
4. if(ch>='0' && ch<='9')   
      true;    
5. if(ch>='A' && ch<='z')   
      true;    
6. if((year%400 == 0 || year%4 ==0) && year%100 !=0)   
      true;    
7. if(powerOn == false)   
      true;    
8. if(str == "yes")    
      true;    

#### 4-2
1부터 20까지의 정수 중 2의배수와 3의배수가 아닌 수의 총합
```
int sum=0;
for(int i=1 ; i<=20; i++) {
      if(i%2 ==0 || i%3 == 0)
            continue;
      sum += i;
}
```

#### 4-3
1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+..+10)의 결과를 구하시오   
```
int sum=0;
int count=0;
for(int i=1; i<=10; i++) {
      for(int j=1; j<=10; j++) {
            count=count + j;
            
      }
      sum = sum + count;
}
```
#### 4-4
1+(-2)+3+(-4)+... 같은식으로 더해갈때 몇까지 더해야 총합이 100이상인가
```
int count=1;
int sum=0;
while(sum<100) {
      sum += count;
      count = (count+1)*(-1);
}
System.out.print(count);
```


