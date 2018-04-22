/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;
import java.net.*;
import java.io.*;
public class Server
{
public static void main(String[] args)
{
try
{
ServerSocket s=new ServerSocket(4500);
System.out.println("trying to connect ");
Socket s1=s.accept();
DataInputStream d=new DataInputStream(s1.getInputStream());
String str=(String)d.readUTF();
System.out.println("message recieved ="+ str);
DataOutputStream dOut= new DataOutputStream(s1.getOutputStream());
dOut.writeUTF("you are connected..can send message");
s.close();
}
catch(Exception e)
{
System.out.println("exception caught"+e);
}
}
}