package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for(int[] rad : matrise) {
			for(int tall : rad) {

				System.out.print(tall + " ");
			}
			System.out.println();
		}

	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String resultat = "";

		for (int[] rad : matrise) {
			for (int i = 0; i < rad.length; i++) {
				resultat += rad[i];

				if (i < rad.length - 1) {
					resultat += " ";
				}
			}
			resultat += "\n";
		}

		return resultat;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int [][] nyMatrise = new int[matrise.length][];

		for (int i = 0; i < matrise.length; i++){
			nyMatrise[i] = new int[matrise[i].length];

			for (int j = 0; j < matrise[i].length; j++){
				nyMatrise[i][j] = matrise[i][j] * tall;
			}
		}
		return nyMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		if (a.length != b.length){
			return false;
		}

		for (int i = 0; i < a.length; i++){
			if (a[i].length != b[i].length) {
				return false;
			}
			for (int j = 0; j < a[i].length; j++){
				if (a[i][j] != b[i][j]){
					return false;
				}
			}
		}

		return true;
		
	}

	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		int[][] nyMatrise= new int[3][3];
		int i;
		int j = 0;
		for (int kolonne[] : matrise) {
			i = 0;
			for (int rad : kolonne) {
				nyMatrise[i][j] = matrise[j][i];
				i++;
			}
			j++;
		}
		return nyMatrise;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		int n = a.length;
		int m = b[0].length;
		int[][] nyMatrise = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				for (int k = 0; k < m; k++) {
					nyMatrise[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return nyMatrise;
	}

}
