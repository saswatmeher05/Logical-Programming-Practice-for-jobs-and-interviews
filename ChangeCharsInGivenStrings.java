/*  
Q.The program will recieve 3 English words inputs from STDIN

These three words will be read one at a time, in three separate line
The first word should be changed like all vowels should be replaced by %
The second word should be changed like all consonants should be replaced by #
The third word should be changed like all char should be converted to upper case
Then concatenate the three words and print them
Other than these concatenated word, no other characters/string should or message should be written to STDOUT

For example if you print how are you then output should be h%wa#eYOU.

You can assume that input of each word will not exceed more than 5 chars
*/

import java.util.*;
import java.lang.*;
class ChangeCharsInGivenStrings {
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
