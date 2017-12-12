import java.io.*;
import java.util.Scanner;

public class Func
{
    public int countLines(File f) throws FileNotFoundException, IOException
    {
        InputStream fr = new FileInputStream(f);
          byte b[] = new byte[1024];
        int c=0,l;
        while((l=fr.read(b))>0)
        {
            for(int i=0;i<l;i++)
            {
                if(b[i]=='\n')
                    c++;
            }
        }
        return c;
    }
    public int countWords(File f) throws FileNotFoundException, IOException
    {
        Scanner s=new Scanner(new FileInputStream(f));
          byte b[] = new byte[1024];
        int c=0,l;
        while(s.hasNext())
        {
           s.next();
           c++;
        }
        return c;
    }
    public int countChars(File f) throws FileNotFoundException, IOException
    {
       InputStream fr = new FileInputStream(f);
        byte b[] = new byte[1024];
        int c=0,l;
        while((l=fr.read(b))>0)
        {
          c+=l;
        }
        return c;
    }
}