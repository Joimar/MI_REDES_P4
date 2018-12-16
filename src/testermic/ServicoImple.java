/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testermic;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author joimar
 */
public class ServicoImple extends UnicastRemoteObject implements Servico {
    
     protected ServicoImple() throws RemoteException
    {
        super();
    }
    
    public long add(long a, long b) throws RemoteException
    {
        return a+b;
    }
    
     public void criaArq(String nome) throws RemoteException
     {
         
       try
       {
           File arq = new File("./"+nome+".txt");
           
           if (!arq.exists()) 
           {
                arq.createNewFile();
           }
       }
       catch (IOException e) 
       {
            e.printStackTrace();
            System.out.println("NÂO FOI");
        }  
     }
}
