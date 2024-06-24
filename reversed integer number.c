#include<stdio.h>
void main(){
    int n,k=0;
    printf("enter number");
    scanf("%d",&n);
    while(n>0){
        k=k*10+n%10;
        n=n/10;
    }
    printf("reversed digits %d",k);
}