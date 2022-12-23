import java.util.*;
public class anagram
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        boolean anag=false;
        boolean visited[]=new boolean[str2.length()];
        if(str1.length() == str2.length())
        {
            for(int i=0; i<str1.length(); i++)
            {
              char ch=str1.charAt(i);
              anag=false;
              for(int j=0; j<str2.length(); j++)
              {
                  char ch2=str2.charAt(j);
                  if(ch==ch2 && !visited[j])
                  {
                      visited[j]=true;
                     anag=true;
                     break;
                  }
              }
             if(!anag)
             break;
            }
        }  
     if(anag)
     {
        System.out.println("anagram");
     }
     else
     { 
      System.out.println("not anagram");
     }
    }
}




