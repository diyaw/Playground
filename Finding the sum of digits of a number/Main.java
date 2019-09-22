#include <stdio.h>
int main() {
	int number;
  	scanf("%d",&number);
  int sum=0,temp=number;
  while(temp>0){
 sum=sum+temp%10;
    temp=temp/10;
    
  }
  printf("%d",sum);
	return 0;
}