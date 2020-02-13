package edu.elsmancs.Cotxox;


public class Cotxox {

	public static void main(String[] args) {

		/* 
		 * Configuracion del usuario
		 * y de la Carrera.
		 * 
		 */

		String tarjetaCredito = "4916119711304546";
		String origen = "Aeroport Son Sant Joan";
		String destino = "Magaluf";
		double distancia = 7.75;
		int tiempoEsperadoMinutos = 10;

		Carrera carrera = new Carrera(tarjetaCredito);
		carrera.setOrigen(origen);
		carrera.setDestino(destino);
		carrera.setDistancia(distancia);
		carrera.setTiempoEsperado(tiempoEsperadoMinutos);

		System.out.println("\n#####" + "\t Set Pickup: \t" + "#####\n");

		System.out.println("Visa: " + carrera.getTarjetaCredito());
		System.out.println("From: " + carrera.getOrigen());
		System.out.println("To: " + carrera.getDestino());
		System.out.println("Distance: " + carrera.getDistancia());

		System.out.println("\n#####" + "\t See your Cost: \t" + "#####\n");

		System.out.println("Visa: " + carrera.getTarjetaCredito());
		System.out.println("From: " + carrera.getOrigen());
		System.out.println("To: " + carrera.getDestino());
		System.out.println("Distance: " + carrera.getDistancia());
		System.out.println("Total: " + carrera.getCosteEsperado() + "€");

		System.out.println("\n#####" + "\t Get a ride: Driver: \t" + "#####\n");

		/* Necesitamos crear la flota de conductores de donde seleccionar uno
		 * para ofrecer el servicio.
		 * La flota es un objeto de tipo PoolConductores.
		 */

		
	}
}
