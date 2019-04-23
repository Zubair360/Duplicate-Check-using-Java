//Author of this Code: DIN MOHAMMAD ZUBAIR

import java.util.*;
public class duplicateCheck{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please enter the no. of inputs below:");
    int n=sc.nextInt();
    int d=0;
    int c=0;
    int arr[]=new int[n];
    String num="";
    
    for(int x=0;x<n;x++){
      arr[x]=sc.nextInt();
    }
    
    for(c=0;c<n;c++){
      
      for(d=c+1;d<n;d++){
        if(arr[c]==arr[d]){
          num=num+arr[d]+" ";
        }
      } 
    }
    if(num.equals("")){System.out.println("No Duplicates found.\nThank You.");}
    else{
      System.out.println("These are the duplicate entries:");
      System.out.println(num);
    }
    
  }
}