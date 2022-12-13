
package fes.aragon.metodos;
import java.util.Random;
import fes.aragon.utilerias.dinamicas.listasimple.ListaSimple;
import fes.aragon.utilerias.dinamicas.pila.Pila;

public class Pruebas {
	ListaSimple<Integer> lista = new ListaSimple<>();
	public static void main(String[] args) {
		
		Pruebas faster = new Pruebas();
		faster.numAleatorios(14);
		faster.lista.imprimirElementos();
		faster.quickSort(0, faster.lista.getLongitud()-1);
		System.out.println();
		faster.lista.imprimirElementos();
		
		
	}
	
	private void numAleatorios(int num) {
		Random rd = new Random();
		for(int i =0; i<num; i++) {
			lista.agregarEnCola(rd.nextInt(100));
		}
	}
	
	public void quickSort(int primero, int ultimo) {
		int i,j,pivote, auxiliar;
		i=primero;
		j=ultimo;
		
		pivote=lista.obtenerNodo((primero+ultimo)/2);
		//System.out.println(pivote);
		do {
			while(lista.obtenerNodo(i)<pivote) {
				i++;
			}
			
			while(lista.obtenerNodo(j)>pivote) {
				j--;
			}
			
			//aqui el intercambio
			if(i<=j) {
				auxiliar=lista.obtenerNodo(i);
				lista.asignar(lista.obtenerNodo(j), i);
				lista.asignar(auxiliar, j);
				i++;
				j--;
			}
		} while (i<=j);
		
		if(primero<j) {
			quickSort(primero, j);
		}
		if(i<ultimo) {
			quickSort(i, ultimo);
		}
	}
}
	
