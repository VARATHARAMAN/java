/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inet;
import java.net.*;
class Inet 
{
public static void main(String[] args)
{
try
{
InetAddress a=InetAddress.getLocalHost();
System.out.println(a);
}
catch(UnknownHostException Exc)
{
System.out.println("Address not known");
}
}
}