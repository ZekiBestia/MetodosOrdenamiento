package fes.aragon.metodos;

import fes.aragon.datos.Leer;
import fes.aragon.datos.Persona;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;


import fes.aragon.utilerias.dinamicas.listasimple.ListaSimple;

public class Burbuja {
	public ListaSimple<Integer> datos = new ListaSimple<>();
	public ListaSimple<Double> dato = new ListaSimple<>();

	ArrayList<Persona> al = new ArrayList<Persona>();
	ListaSimple<Persona> no = new ListaSimple<>();
	ListaSimple<Integer> es = new ListaSimple<>();
	ListaSimple<Persona> ed = new ListaSimple<>();
	ListaSimple<Persona> pe = new ListaSimple<>();
	ListaSimple<Integer> lista = new ListaSimple<>();
	BufferedReader br = null;
	String line = "";
	// Se define separador ","
	String cvsSplitBy = ",";
	Persona p;
	Persona n;
	Persona e;
	Persona eda;

	public void leer(String archivo) {
		try {
			br = new BufferedReader(new FileReader(archivo));
			while ((line = br.readLine()) != null) {
				String[] datos = line.split(cvsSplitBy);
				// p = new
				// Persona(datos[0],Double.parseDouble(datos[1]),Integer.parseInt(datos[2]),
				// Float.parseFloat(datos[3]))
				p = new Persona(0);
				
			}
		} catch (Exception e) {

		}

		System.out.println(lista);
//	no.imprimirElementos();
//	es.imprimirElementos();
	}

	public Burbuja() {

		// TODO Auto-generated constructor stub

	}

	public static void main(String[] args) {
		Burbuja as = new Burbuja();
		Burbuja app = new Burbuja();
		 app.randmun(10);
		 app.datos.imprimirElementos();
		System.out.println("*******************");
		System.out.println("Numeros ordenados");

		// app.datos.imprimirElementos();

		app.quickSort(0, app.datos.getLongitud()-1);
		
		
		
		//app.burbuja();
		app.datos.imprimirElementos();
	}

	public void randmun(int ransmuns) {
		Random rd = new Random();
		for (int i = 0; i < ransmuns; i++) {
			datos.agregarEnCola(rd.nextInt(200));
		}
	}
	public void burbuja() {
		for (int i = 0; i < datos.getLongitud() - 1; i++) {
			for (int j = i + 1; j < datos.getLongitud(); j++) {
				if (datos.obtenerNodo(i) >= datos.obtenerNodo(j)) {
					Integer temp = datos.obtenerNodo(i);
					datos.asignar(datos.obtenerNodo(j), i);
					datos.asignar(temp, j);
				}

			}

		}
	}

	public void seleccion() {
		int min = 0;
		for (int i = 0; i < datos.getLongitud(); i++) {
			min = i;
			for (int j = i + 1; j < datos.getLongitud(); j++) {
				if (datos.obtenerNodo(j) <= datos.obtenerNodo(min)) {
					min = j;
				}
			}
			if (i != min) {
				Integer tmp = datos.obtenerNodo(i);
				datos.asignar(datos.obtenerNodo(min), i);
				datos.asignar(tmp, min);

			}
		}
	}

	private void insercion() {
		int i = 1;
		int j = i;
		for (i = 1; i < datos.getLongitud(); i++) {
			Integer tmp = datos.obtenerNodo(i);
			for (j = i; j > 0 && tmp < datos.obtenerNodo(j - 1); j--) {
				datos.asignar(datos.obtenerNodo(j - 1), j);

			}
			datos.asignar(tmp, j);

		}
	}

	public void quickSort(int primero, int ultimo) {
		int i,j,pivote, auxiliar;
		i=primero;
		j=ultimo;
		
		pivote=datos.obtenerNodo((primero+ultimo)/2);
		//System.out.println(pivote);
		do {
			while(datos.obtenerNodo(i)<pivote) {
				i++;
			}
			
			while(datos.obtenerNodo(j)>pivote) {
				j--;
			}
			
			//aqui el intercambio
			if(i<=j) {
				auxiliar=datos.obtenerNodo(i);
				datos.asignar(datos.obtenerNodo(j), i);
				datos.asignar(auxiliar, j);
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

	private void burbujaL() {
		for (int i = 0; i < dato.getLongitud() - 1; i++) {
			for (int j = i + 1; j < dato.getLongitud(); j++) {
				if (dato.obtenerNodo(i) >= dato.obtenerNodo(j)) {
					Double temp = dato.obtenerNodo(i);
					dato.asignar(dato.obtenerNodo(j), i);
					dato.asignar(temp, j);
				}

			}

		}
	}
	
	
	
	
}
