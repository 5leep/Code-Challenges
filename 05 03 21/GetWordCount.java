public class GetWordCount
{
    public static void main(String[] string)
    {
        int wordCount = 0;
        char ch[] = new char[string.length];

        System.out.println ( "\n<EV> \"Hello there sir. Please enter some words for me ;)\"\n");

        for ( int i = 0; i < string.length; i++)
        {
            ch[i]= (char) string.length;
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)))
            wordCount++;
        }
        return wordCount;
    }
}