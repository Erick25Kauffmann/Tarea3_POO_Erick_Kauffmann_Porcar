package Tarea3;

import java.lang.Comparable;

public class Rectangulo extends Figura implements Comparable<Rectangulo> {
	private double base;
	private double altura;
	
	
	public Rectangulo(double pBase, double pAltura){
		this.base = pBase;
		this.altura = pAltura;
	}

	public double calcularArea() {
		return base * altura;
	}
	
	public int cantidadLados() {
		return 4;
	}
	
	public int compareTo(Rectangulo rectPorComparar){
		double areaPorComparar = rectPorComparar.calcularArea();
		int ladosPorComparar = rectPorComparar.cantidadLados();
		double miArea = this.calcularArea();
		int misLados = this.cantidadLados();
		
		if(miArea==areaPorComparar){
			if(misLados==ladosPorComparar){
				return 0;
			}
			else if (misLados > ladosPorComparar){
				return 1;
			}
			else{
				return -1;
			}
		}
		else if (miArea > areaPorComparar){
			return 1;
		}
		else{
			return -1;
		}
		
	}
	
	public String toString() {
		double area = this.calcularArea();
		int lados = this.cantidadLados();
		String datosFigura = "Rectangulo: " + "Area: " + area + " -- Lados: " + lados;
		return datosFigura;
	}

}
