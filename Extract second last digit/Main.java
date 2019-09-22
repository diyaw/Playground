#include<stdio.h>
int main()
{
  int num;
  scanf("%d",&num);
  int dl = num/10;
  printf("%d",(dl%10));
  return 0;
}