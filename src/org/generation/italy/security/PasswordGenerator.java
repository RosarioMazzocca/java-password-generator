package org.generation.italy.security;

public class PasswordGenerator {
	
	public static void main(String[] args) {
		
		String mioNome = "Rosario";
		String mioCognome = "Mazzocca";
		String colorePreferito = "Cobalto";
		int giornoNascita = 04;
		int meseNascita = 04;
		int annoNascita = 1997;
		
		int sommaNascita = giornoNascita + meseNascita + annoNascita;
		
		System.out.println("Password generata: " + mioNome + "-" + mioCognome + "-" + colorePreferito + "-" + sommaNascita);
	}

}
