package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		// TODO
		throw new UnsupportedOperationException("Metoden skrivUt ikke implementert");
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("Metoden tilStreng ikke implementert");
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		// TODO
		throw new UnsupportedOperationException("Metoden skaler ikke implementert");
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden erLik ikke implementert");
		
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