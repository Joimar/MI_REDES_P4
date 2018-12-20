/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginClasses;

import java.io.Serializable;

/**
 *
 * @author joimar
 */
public class User implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    private String name;
    private String nickname;
    private String email;
    private String password;
    
    public User(String name, String nickname, String email, String password) 
    {
		this.name = name;
		this.nickname = nickname;
		this.email = email;
		this.password = password;
    }
    
    /**
	 * @return the name
	 */
    public String getName() 
    {
	return name;
    }
	
	/**
	 * @param name the name to set
	 */
    public void setName(String name) 
    {
	this.name = name;
	
    }
	
	/**
	 * @return the nickname
	 */
    public String getNickname() 
    {
	return nickname;
	
    }
	
	/**
	 * @param nickname the nickname to set
	 */
    public void setNickname(String nickname) 
    {
	this.nickname = nickname;
    }
	
	/**
	 * @return the email
	 */
    public String getEmail() 
    {
	return email;
    }
	
	/**
	 * @param email the email to set
	 */
    public void setEmail(String email) 
    {
	this.email = email;
    }
	
	/**
	 * @return the password
	 */
    public String getPassword() 
    {
	return password;
    }
	
	/**
	 * @param password the password to set
	 */
    public void setPassword(String password) 
    {
        this.password = password;
    }
    
    /** 
	 * Equals, compara o email
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
    @Override
    public boolean equals(Object obj) 
    {
	if (obj instanceof User) 
        {
            User user = (User) obj;
            if (user.email.equals(this.email)) 
            {
		return true;
            }
	}
	return false;
        
    }
}
