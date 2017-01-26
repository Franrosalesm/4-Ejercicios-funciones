package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		
		float numero=0;
		String aux="";
		System.out.println("Introduce el radio: ");
		numero= teclado.nextFloat();
		
		System.out.println("El área es: "+areacircunferencia(numero));
		System.out.println("La longitud es: "+longitudcircunferencia(numero));
		

	}
	public static float longitudcircunferencia(float radio){
		
		float longi = 0;
		longi=(float) (2*Math.PI*radio);
		return longi;
	}
	public static float areacircunferencia(float radio){
		float area=0;
		area = (float) Math.PI * (radio*radio);
		return area;
	
	
}

}
