package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities._6_Employee;

public class _6_ProgramEmployee {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<_6_Employee> lista = new ArrayList<>();
		
		System.out.print("Quantos funcion�rios ser�o registrados? ");
		int n = sc.nextInt();
		System.out.println();
		
		for (int i = 0; i<n; i++) {
			System.out.println("Employee #" + (i+1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while (hasId(lista, id)) {
				System.out.println("Id j� existe!!! Tente novamente: ");
				id = sc.nextInt();
			}
			
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Sal�rio: ");
			Double salary = sc.nextDouble();
			_6_Employee emp = new _6_Employee(id, name, salary);
			lista.add(emp);
		}
		
		System.out.print("Entre com o id do funcion�rio que ter� seu sal�rio aumentado: ");
		int idsalary = sc.nextInt();
		
		_6_Employee emp = lista.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("Esse id n�o existe!!!");
		}
		else {
			System.out.print("Entre com a porcentagem: ");
			Double percent = sc.nextDouble();
			emp.increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("Lista de empregados: ");
		for (_6_Employee e : lista) {
			System.out.println(e);
		}
		
		
		/*Integer pos = position(lista, idsalary);
		if (pos == null) {
			System.out.println("Esse id n�o existe!!!");
		}
		else {
			System.out.print("Entre com a porcentagem: ");
			Double percent = sc.nextDouble();
			lista.get(pos).increaseSalary(percent);
		}
				
		System.out.println();
		System.out.println("Lista de empregados: ");
		for (_6_Employee emp : lista) {
			System.out.println(emp);
		}
		*/
		
		
		
		sc.close();

	}
	
	/*
	public static Integer position(List<_6_Employee> lista, int id) {
		for (int i = 0 ; i < lista.size(); i++) {
			if (lista.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	*/

	public static boolean hasId(List<_6_Employee> lista, int id) {
		_6_Employee emp = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
