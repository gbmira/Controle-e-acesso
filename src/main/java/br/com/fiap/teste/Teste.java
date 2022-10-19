package br.com.fiap.teste;

import br.com.fiap.dao.UsuarioDAO;
import br.com.fiap.to.UsuarioTO;

public class Teste {

	public static void main(String[] args) {
		
		UsuarioDAO ud = new UsuarioDAO();
		UsuarioTO ut = new UsuarioTO("Selva", "12345");
		
		System.out.println("Resposta: " + ud.loginDAO(ut).getLogin());

	}

}
