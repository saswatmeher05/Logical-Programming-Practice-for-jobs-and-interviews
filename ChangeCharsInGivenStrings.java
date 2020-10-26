
import java.util.*;
import java.lang.*;
class Main {
  public static void main(String[] args) {
    //System.out.println();
    Scanner scanner=new Scanner(System.in);
    String s1=scanner.next();
    String s2=scanner.next();
    String s3=scanner.next();
    char c;
    String str1="",str2="",str3="";
    //int count=s1.length()+s2.length()+s3.length();
    //System.out.println(count);  
    for(int i=0;i<s1.length();i++){
      c=s1.charAt(i);
      if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u' ||
         c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
        str1=str1+"%";
      }
      else{
        str1=str1+c;
      }
    }
    for(int i=0;i<s2.length();i++){
      c=s2.charAt(i);
      if(c>='A' && c<='Z' || c>='a' && c<='z'){
        if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u' ||
         c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
           str2=str2+c;
        }
        else{
          str2=str2+"#";
        }
        
      }  
    }
    str3=s3.toUpperCase();
    System.out.println(str1+str2+str3);   
  }
}
