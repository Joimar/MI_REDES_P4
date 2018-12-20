/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testermic;

import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 *
 * @author joimar
 */
public class Cliente { 
    
    private static Servico c;
    private String nome;
    
    public Cliente()
    {
         try
        {
            //Calculadora c = (Calculadora) Naming.lookup("rmi://192.168.86.10:1099/CalculadoraService");
            c = (Servico) Naming.lookup("rmi://127.0.1.1:1099/Service");
            System.out.println("Adição : " + c.add(10, 15));
         //   c.criaArq("TESTE");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args)
    {
        try
        {
            //Calculadora c = (Calculadora) Naming.lookup("rmi://192.168.86.10:1099/CalculadoraService");
            c = (Servico) Naming.lookup("rmi://127.0.1.1:1099/Service");
           // System.out.println("Adição : " + c.add(10, 15));
            c.criaArq("TESTE");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void criaAqruivo(String nome) throws RemoteException
    {
        c.criaArq(nome);
    }
    
    
    
    public Servico getService()
    {
        return c;
    }
    
    public void set(String nome)
    {
        this.nome = nome;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    
    
     
    
}
