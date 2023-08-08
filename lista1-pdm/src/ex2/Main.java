package ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		ArrayList<Pessoa> Pessoa = new ArrayList<>();
		System.out.println("Informe a quantidade de pessoas que você quer adicionar a lista");
		Integer num = Integer.valueOf(a.nextLine());
		
		for (int i = 0; i < num; i++) {
			Pessoa pessoa = new Pessoa();
			System.out.println("Informe o nome: ");
			pessoa.nome = a.nextLine();
			System.out.println("Informe o telefone: ");
			pessoa.telefone = a.nextLine();
			System.out.println("Informe o email: ");
			pessoa.email = a.nextLine();
			System.out.println("Informe a cidade: ");
			pessoa.cidade = a.nextLine();
			System.out.println("Informe a rua: ");
			pessoa.rua = a.nextLine();
			System.out.println("Informe o número da casa: ");
			pessoa.nCasa = Integer.valueOf(a.nextLine());
			
			Pessoa.add(pessoa);
		}
		
		for (Pessoa p : Pessoa) {
			System.out.println("Nome: "+ p.nome);
			System.out.println("Email: "+ p.email);
			System.out.println("Telefone: "+ p.telefone);
			System.out.println("Cidade: "+ p.cidade);
			System.out.println("Rua: "+ p.rua);
			System.out.println("Número da casa: "+ p.nCasa);
		}
		
	}

}
