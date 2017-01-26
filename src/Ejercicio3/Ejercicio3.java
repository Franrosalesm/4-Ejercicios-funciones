package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float kmporhora=0;
		float mpors=0;
		kmporhora= validarkmporhora();
		System.out.println("Son : "+convertirampors(kmporhora)+" m/s");
		
		


	}
	public static float validarkmporhora(){
		Scanner teclado= new Scanner(System.in);
		boolean esNumero=false;
		float kmporhora = 0;
		String aux=null;
		do{
		System.out.println("Introduce los kilómetros por hora: ");
		aux=teclado.nextLine();
		try{
			esNumero=true;
			kmporhora=Integer.parseInt(aux);
			
		}
			catch(Exception e){
				System.out.println("ERROR: no es correcto");
				esNumero=false;
		
		}
		}
		while(esNumero==false);
		
		
		return kmporhora;
		}
	public static float convertirampors(float kmporhora){
		float mpors;
		mpors=(float) (kmporhora/3.6);
		return mpors;
	}

}

