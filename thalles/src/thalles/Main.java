package thalles;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		System.out.println("digite um numero de 1 a 10");
		int num =  leitura.nextInt();
		String nomearquivo = "tabuada_" + num + ".txt";
		
		try (BufferedWriter escrita = new BufferedWriter(new FileWriter(nomearquivo))){
			for (int i = 1; i <= 10; i++) {
				escrita.write(num + "X" + i + "=" + (num * i));
				
				escrita.newLine();
			}
			System.out.println("Tabuada salva no arquivo: "+ nomearquivo);
		} catch (IOException e) {
			System.out.println("erro ao escrever no arquivo"+ e.getMessage());
			
		}finally {
			leitura.close();
		}

}
	
}
