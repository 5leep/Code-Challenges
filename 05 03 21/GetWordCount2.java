public class GetWordCount2 {  
    static int wordcount(String string)  
      {  
        int Wordcount=0;  
    
          char c[]= new char[string.length()];     
          for(int i=0;i<string.length();i++)  
          {  
              c[i]= string.charAt(i);  
              if( ((i>0)&&(c[i]!=' ')&&(c[i-1]==' ')) || ((c[0]!=' ')&&(i==0)) )  
                  Wordcount++;  
          }  
          return Wordcount;  
      }  
    public static void main(String[] args) {  
        String string ="Hello there, it's me, EV! ;)";  
       System.out.println(wordcount(string) + " words.");   
  }  
}  