package com.proportiesFileExemple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		
		try {
			System.out.println("##################################################");
			System.out.println("#######Bem Vindo ao Proporties File Exemple#######");
			System.out.println("##################################################");
			System.out.println("Escolha uma das opções:");
			System.out.println("1 - Create");
			System.out.println("2 - Load");
			
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			int opcao = Character.getNumericValue(in.read());
			
			if (opcao == 1) {
				System.out.println("Defina a url de conexão, usuário e senha, "
						+ "sepadados por espaço e na respectiva ondem:");
				in = new BufferedReader(new InputStreamReader(System.in));
				String[] respostas = in.readLine().split(" ");
				
				if (respostas.length == 3) {
					CreateProporties cp = new CreateProporties();
					cp.setUrl(respostas[0])
					.setUser(respostas[1])
					.setPassword(respostas[2])
					.create();
				} else {
					System.out.println("Formato invalido!");
				}
				
			} else if (opcao == 2) {
				LoadProporties lp = new LoadProporties();
				System.out.println("##################################################");
				lp.loadProporties();
				System.out.println("##################################################");
			} else {
				System.out.print("Opção invalida!");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
