package br.ufs.dcomp.InetAddressTest;

import java.net.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try{
            
            String name = "google.com.br";
            InetAddress address = InetAddress.getByName(name); //dado o nome de um servidor, conseguir o IP dele
            System.out.println( "Name:      "+ name);
            System.out.println( "Address:   "+ address.getHostAddress());
        } catch (UnknownHostException e){
            System.out.println(e.getMessage());
        }                
    }
}
