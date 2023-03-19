package Tarea3;

public class Circulo extends Figura implements Comparable<Circulo> {
	
	private double radio;
	
	
	public Circulo(double pRadio){
		this.radio = pRadio;
	}

	public double calcularArea() {
		return Math.pow(radio, 2)*Math.PI;
	}
	
	public int cantidadLados() {
		return 1;
	}
	
	public int compareTo(Circulo circPorComparar){
		double areaPorComparar = circPorComparar.calcularArea();
		int ladosPorComparar = circPorComparar.cantidadLados();
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
		String datosFigura = "Circulo: " + "Area: " + area + " -- Lados: " + lados;
		return datosFigura;
	}

}
