import java.io.*;
public class FileIO1
{
public static void main(String args[])
throws FileNotFoundException,IOException
{
String str=new String();
byte [] bstr=str.getBytes();
InputStream fileIn=new FileInputStream("my File");
System.out.println("contents ");
for(int i=0;i<=bstr.length;i++)
System.out.print((char)fileIn.read());
System.out.println();
fileIn.close();
}
}