/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import java.net.*;
import java.io.*;
public class Data
{
public static void main(String args[])throws Exception
{
DatagramSocket ds= new DatagramSocket(505);
String str="Prudhvi krishna";
byte[] buff=new byte[300];
buff=str.getBytes();
try{
InetAddress ad;
    ad = InetAddress.getByName(www.varatha.com);
DatagramPacket dp=new DatagramPacket(buff,buff.length,ad,505);
ds.send(dp);
ds.close();
}
catch(UnknownHostException e)
{
System.out.println(e);
}
}
}