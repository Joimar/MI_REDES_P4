/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testermic;

import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author joimar
 */
public class CalculadoraServer 
{
    CalculadoraServer()
    {
        try
        {
            //System.setProperty("java.rmi.server.hostname", "192.168.86.10");
            System.setProperty("java.rmi.server.hostname", "127.0.1.1");
            LocateRegistry.createRegistry(1099);
            Calculadora c = new CalculadoraImple();
            Naming.bind("CalculadoraService", (Remote) c);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
    
    public static void main(String[] args)
    {
        new CalculadoraServer();
    }
}
