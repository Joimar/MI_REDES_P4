/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginClasses;

/**
 *
 * @author joimar
 */
public class Session 
{
    
    private static Session instance = null;
    private User user;
    
    /**
	 * Loga um usuario sessão.
	 * 
	 * @param User user
	 * @return void
	 * */
    
    public void setUser(User user) 
    {
	this.user = user;
    }
    
    /**
	 * Usuario que está logado na sessão.
	 * 
	 * @param 
	 * @return Usuário logado
	 * */
    public User getUser() 
    {
	return this.user;
    }
    
    /**
	 * Inicia uma sessão, se já não exitir outra.
	 * 
	 * @param User user
	 * @return void
	 * */
    
    public static Session getInstance() 
    {
	if (Session.instance == null) 
        {
            instance = new Session();
	}
	return Session.instance;
    }
    
    /**
	 * Finaliza a sessão do usuário ativa.
	 * 
	 * @param User user
	 * @return void
	 * */
	public void finalize() 
        {
            if (Session.instance != null) 
            {
		this.setUser(null);
            }
	}
    
    
    
}
