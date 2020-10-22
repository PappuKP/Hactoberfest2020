import java.util.*;
public class LinearSearch{
public static void main(String[] args){
int[] arr={1,9,78,67,90,45};
int n=arr.length;
int key=90;
int i=0;
for(;i<n;i++){
if(arr[i]==key){
System.out.println("Key found at index"+(i+1));
return;
}
}
if(i==n){
System.out.println("Key Not found ");
}
}
}
