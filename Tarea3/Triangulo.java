package Tarea3;

public class Triangulo extends Figura implements Comparable<Triangulo> {
	
	private double base;
	private double altura;
	
	
	public Triangulo(double pBase, double pAltura){
		this.base = pBase;
		this.altura = pAltura;
	}

	public double calcularArea() {
		return (base * altura)/2;
	}
	
	public int cantidadLados() {
		return 3;
	}
	
	public int compareTo(Triangulo triPorComparar){
		double areaPorComparar = triPorComparar.calcularArea();
		int ladosPorComparar = triPorComparar.cantidadLados();
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
		String datosFigura = "Triangulo: " + "Area: " + area + " -- Lados: " + lados;
		return datosFigura;
	}

}
