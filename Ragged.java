class Ragged{
public static void main( String args[]){
int array[][] = new int[7][];
array[0]=new int[10];
array[1]=new int[10];
array[2]=new int[10];
array[3]=new int[10];
array[4]=new int[10];
array[5]=new int[2];
array[6]=new int[2];
for(int i=0;i<5;i++)
for(int j=0;j<10;j++)
{
array[i][j]= i+j+10;
}
for(int i=5;i<7;i++)
for(int j=0;j<2;j++){
array[i][j]= i+j+10;
}
System.out.println("riders per week");
for(int i=0;i<5;i++)
for(int j=0;j<10;j++)
{
array[i][j]= i+j+10;
System.out.println(array[i][j]);
System.out.println();
}
System.out.println();

System.out.println("riders on weekend");
for(int i=5;i<7;i++)
for(int j=0;j<2;j++){
array[i][j]= i+j+10;
System.out.println(array[i][j]);
System.out.println();
}
}
}
