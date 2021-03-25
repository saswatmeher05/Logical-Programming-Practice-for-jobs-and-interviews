import javax.xml.namespace.QName;

//Find the position of 2nd w in the given String
//"Saswat Swarup Meher"

public class FindACharacterInGivenString {
  public static void main(String[] args) {
      String str="Saswat Swarup Meher";
      char ch[]=str.toCharArray();
      int count=0;

      for(int i=0;i<ch.length;i++){
        if(ch[i]=='w' || ch[i]=='W'){
            count+=1;
        }
        if(count==2){
            System.out.println(i);
            break;
        }

      }

  }  
}
