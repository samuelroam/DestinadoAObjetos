import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import ciudad.Trabajador;


/**
 * clase principal del proyecto
 * @author ik012982i9
 *
 */
public class Main {

	/**
	 * metodo principal
	 * @param args
	 */
	public static void main(String[] args){

		Trabajador t = new Trabajador("Mikel", "34343434i", 1300);
		t.mostrarInfo();
		
}
}
