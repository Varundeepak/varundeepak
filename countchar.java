import java.util.*;
public class countchar
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        char b=s.next().charAt(0);
        int count=0;
        int c=a.length();
        char[] d=new char[c];
        for(int i=0;i<c;i++) d[i]=a.charAt(i);
        for(int i=0;i<a.length();i++)
        {
            if(d[i]==b) count++;
        }
        System.out.println(count);
    }
}
