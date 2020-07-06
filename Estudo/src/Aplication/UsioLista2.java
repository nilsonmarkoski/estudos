package Aplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UsioLista2 {

	public static void main(String[] args) {
		List<String> lista = new  ArrayList<>();
		lista.add("Markoski");
		lista.add("Butka");
		lista.add("Pavoski");
		lista.add("Boaski");
		lista.add("kotoski");
		lista.add("Rossini");
		
		for(String x : lista) {
			System.out.println("Nome:" + x);
		}
		System.out.println("-----------------------------------------------");
		//lista.remove(1);
		lista.removeIf(x -> x.charAt(0)=='B');
		for(String x : lista) {
			System.out.println("Nome:" + x);
		}
		System.out.println("-----------------------------------------------");
		List<String> resultado = lista.stream().filter(x -> x.charAt(0)=='M').collect(Collectors.toList());
		
		for(String x : resultado) {
			System.out.println("Nome:" + x);
		}
		
		
		
		
		
	}

}
