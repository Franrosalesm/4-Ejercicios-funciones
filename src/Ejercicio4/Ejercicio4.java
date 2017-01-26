package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float cateto=0;
		float cateto2=0;
		float mpors=0;
		cateto= validarprimercateto();
		cateto2= validarsegundocateto();
		System.out.println("La hipotenusa es: "+hipotenusa(cateto, cateto2)+ " metros");
		
		


	}
	public static float validarprimercateto(){
		Scanner teclado= new Scanner(System.in);
		boolean esNumero=false;
		float cateto = 0;
		String aux=null;
		do{
		System.out.println("Introduce primer cateto: ");
		aux=teclado.nextLine();
		try{
			esNumero=true;
			cateto=Integer.parseInt(aux);
			
		}
			catch(Exception e){
				System.out.println("ERROR: no es correcto");
				esNumero=false;
		
		}
		}
		while(esNumero==false);
		
		
		return cateto;
		}
	public static float validarsegundocateto(){
		Scanner teclado= new Scanner(System.in);
		boolean esNumero=false;
		float cateto2 = 0;
		String aux=null;
		do{
		System.out.println("Introduce segundo cateto: ");
		aux=teclado.nextLine();
		try{
			esNumero=true;
			cateto2=Integer.parseInt(aux);
			
		}
			catch(Exception e){
				System.out.println("ERROR: no es correcto");
				esNumero=false;
		
		}
		}
		while(esNumero==false);
		
		
		return cateto2;
		
		}
	public static float hipotenusa(float cateto, float cateto2){
		float hipotenusa;
		hipotenusa=(float) (cateto*cateto)*(cateto2*cateto2);
		return hipotenusa;
	}

}
