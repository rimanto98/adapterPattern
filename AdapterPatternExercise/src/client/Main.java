package client;

import interfacciaGrafica.Output;
import pattern.*;
public class Main {

	public static void main(String[] args) {
		
		int[][] matrice =
			{
					{1,2,0},
					{0,0,2},
					{1,2,2}
			};
		
		ElementiInMatrice elementi = new AdapterDaMatriceInArray(matrice);
		
		Output out = new Output(elementi);	
	}
}
