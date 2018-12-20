/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testermic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;
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
     
    public void escreveArq(String nome, String dado) throws RemoteException
    {
       
         try { 
             FileWriter escritor = new FileWriter("./"+nome+".txt", false);
             PrintWriter gravar = new PrintWriter(escritor);
             gravar.println(dado);
             gravar.close();
             escritor.close();
         } catch (IOException ex) {
             Logger.getLogger(ServicoImple.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
    public String getArq(String nome) throws RemoteException
    {
       String  linha = new String();
       String retorno = new String();
         try {
             FileReader arq = new FileReader("./"+nome+".txt");
             BufferedReader lerArq = new BufferedReader(arq);
             linha = lerArq.readLine();
             retorno+= linha;
             while (linha != null) 
             {
                System.out.printf("%s\n", linha);
 
                linha = lerArq.readLine(); // lê da segunda até a última linha
               if(linha!= null) retorno += linha;
            }
             arq.close();
              
         } catch (FileNotFoundException ex) {
             Logger.getLogger(ServicoImple.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
             Logger.getLogger(ServicoImple.class.getName()).log(Level.SEVERE, null, ex);
         }
         //ystem.out.print("IMPLE "+retorno);
         return retorno;
    }
}
