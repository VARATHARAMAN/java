import java.io.*;
public class FileIO
{
public static void main(String args[])
throws FileNotFoundException,IOException
{
String str="It is My file";
byte [] bstr=str.getBytes();
OutputStream fileOut=new FileOutputStream("my File");
for(int k=0;k<bstr.length;k++)
fileOut.write(bstr[k]);
fileOut.close();
InputStream fileIn=new FileInputStream("my File");
System.out.println("contents ");
for(int i=0;i<=bstr.length;i++)
System.out.print((char)fileIn.read());
System.out.println();
fileIn.close();
}
}