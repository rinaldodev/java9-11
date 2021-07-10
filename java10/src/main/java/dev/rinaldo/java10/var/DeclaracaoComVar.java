package dev.rinaldo.java10.var;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Java 10 - Declara��o com var
 * @author youtube.com/RinaldoDev
 */
public class DeclaracaoComVar {

	// var nome = "Seja membro e apoie o canal!";
	
//	public DeclaracaoComVar(var nome) {
//	}
	
	public static void main(String[] args) {
		pode();
		naoPode(null);
	}

	private static void pode() {
		var var = new Var(); // n�o fa�a!!
		var i = 52;
		var apoie = "Seja membro do canal!";
		var s = new Scanner(apoie);
		var increvase = getNome(); // n�o gosto
		
		var bais = new ByteArrayInputStream(null);
		
		var list = List.of("Deixe", "um", "comentario");
		for (var elemento : list) { // cuidado
		}

		for (var j = 0; j < 50; j++) {
		}
		
		var lista = new ArrayList<String>();
	}
	
//	private static var naoPode(var nome) {
	private static void naoPode(String nome) {
		// var i = null;
		// var apoie;
		// var r = () -> System.out.println("Curta o v�deo!");
		
//		try {
//		} catch (var e) {
//		}
	}
	
	private static String getNome() {
		return "Inscreva-se no canal!";
	}
	
	static class Var {
	}
	
}
// Twitter: twitter.com/rinaldodev
// LinkedIn: linkedin.com/in/rinaldodev/
// Twitch: twitch.tv/rinaldodev
// GitHub: github.com/rinaldodev
// Facebook: facebook.com/rinaldodev/
// Site: rinaldo.dev