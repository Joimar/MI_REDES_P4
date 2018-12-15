/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testermic;

import java.rmi.Naming;

/**
 *
 * @author joimar
 */
public class CalculadoraClient 
{
    public static void main(String[] args)
    {
        try
        {
            //Calculadora c = (Calculadora) Naming.lookup("rmi://192.168.86.10:1099/CalculadoraService");
            Calculadora c = (Calculadora) Naming.lookup("rmi://127.0.1.1:1099/CalculadoraService");
            System.out.println("Adição : " + c.add(10, 15));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
