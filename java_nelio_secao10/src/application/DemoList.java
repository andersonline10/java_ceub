package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoList {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		
		lista.add("Maria");
		lista.add("Alex");
		lista.add("Bob");
		lista.add("Anna");
		
		
		System.out.println(lista.size());
		System.out.println("---------------------------");
		for (String x : lista) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------");
		
		lista.removeIf(x -> x.charAt(0) == 'M');

		for (String x : lista) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------");
		System.out.println("Index of Bob: " + lista.indexOf("Bob"));
		System.out.println("Index of Marco" + lista.indexOf("Marco"));
		
		System.out.println("---------------------------");
		
		
		
		List<String> resultado = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toUnmodifiableList());
		
		for (String x : resultado) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------");
		
		String nome = lista.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(nome);
		
		
	}

}
