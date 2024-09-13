package thalles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Outro {

	public static void main(String[] args) throws IOException {
		Scanner leitura = new Scanner(System.in);
		System.out.println("digite um numero"); 
		int numero = leitura.nextInt();
		String nomearquivo = "tabuada_"+ numero + "txt";  
		File f1 = new File(nomearquivo);
		 
			 if (!f1.exists()) {
				System.out.println("arquivo não existe");
			 }else {
				 	System.out.println("o arquivo existe"+ nomearquivo);
				 
				 String caminhoDoArquivo = "C:\\Users\\Aluno\\eclipse-workspace\\thalles\\tabuada_8.txt";
					try {
						@SuppressWarnings("resource")
						BufferedReader leitor = 
								new BufferedReader(new FileReader(caminhoDoArquivo));
						System.out.println("Lendo arquivo...");
						String linha = "";
						while((linha = leitor.readLine()) != null) {
							System.out.println(linha);
						}
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					}
			 }
			
	}
}


