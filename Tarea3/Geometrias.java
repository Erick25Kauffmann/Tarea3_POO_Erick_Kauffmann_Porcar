package Tarea3;

import java.util.Arrays;

public class Geometrias {
	
	public static void main(String args[]) {
		
		
		Rectangulo[] rects = new Rectangulo[4];
		
		rects[0] = new Rectangulo(2.5, 3.0);
		rects[1] = new Rectangulo(1.7, 2.2);
		rects[2] = new Rectangulo(2.8, 3.1);
		rects[3] = new Rectangulo(3.5, 1.2);
		Arrays.sort(rects);
		for(int i = 0; i!=4; i++) {
			Rectangulo rectanguloActual = rects[i];
			System.out.println(rectanguloActual);
		}
		
		
		Triangulo[] trias = new Triangulo[4];
		
		trias[0] = new Triangulo(2.5, 3.0);
		trias[1] = new Triangulo(1.7, 2.2);
		trias[2] = new Triangulo(2.8, 3.1);
		trias[3] = new Triangulo(3.5, 1.2);
		Arrays.sort(trias);
		for(int i = 0; i!=4; i++) {
			Triangulo trianguloActual = trias[i];
			System.out.println(trianguloActual);
		}
		
		
		Circulo[] circs = new Circulo[4];
		
		circs[0] = new Circulo(2.5);
		circs[1] = new Circulo(1.7);
		circs[2] = new Circulo(2.8);
		circs[3] = new Circulo(3.5);
		Arrays.sort(circs);
		for(int i = 0; i!=4; i++) {
			Circulo circuloActual = circs[i];
			System.out.println(circuloActual);
		}
		
	}
	

}
