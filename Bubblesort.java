class Bubblesort{
public static void main( String args[]){
int array[]= {10,-3,60,78,7,0,11,100,15,1};
int a,b,t;
int size=10;
for( a=1; a<10 ; a++)
for( b=size-1; b>=a; b--)
{
if(array[b-1]>array[b]){
t=array[b-1]; 
array[b-1]=array[b];
array[b]=t;
}
}
System.out.println(" sorted array is");
for(int i=0; i<size; i++)
{
System.out.println( array[i]);
}
}
}