/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udpclient;
import java.io.*;
import java.net.*;
public class Udpclient
{
public static void main(String[] args)throws Exception
{
BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
DatagramSocket d=new DatagramSocket();
InetAddress IPAddress=InetAddress.getByName("local host");
byte[] sendData=new byte[1024];
byte[] receiveData=new byte[1024];
System.out.println("hello--enter data");
String str=b.readLine();
sendData=str.getBytes();
DatagramPacket sendPacket=new DatagramPacket(sendData,sendData.length,IPAddress,9876);
d.send(sendPacket);
DatagramPacket receivePacket=new DatagramPacket(receiveData,receiveData.length);
d.receive(receivePacket);
String str1=new String(receivePacket.getData());
System.out.println("From server:"+str1);
d.close();
}
}