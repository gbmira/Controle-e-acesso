package br.com.fiap.to;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UsuarioTO {
	public String login;
	public String senha;
	
	public UsuarioTO() {
		super();
	}

	public UsuarioTO(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
