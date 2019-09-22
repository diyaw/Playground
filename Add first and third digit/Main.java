#include<stdio.h>
int main()
{
  int num;
  scanf("%d",&num);
  int d1 = num/100;
  int d3 = num%10;
  printf("%d",(d1+d3));
  return 0;
}