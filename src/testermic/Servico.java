/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testermic;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author joimar
 */
public interface Servico extends Remote 
{
    public long add(long a, long b) throws RemoteException;
    public void criaArq(String nome) throws RemoteException;
    public void escreveArq(String nome, String dado) throws RemoteException;
}
