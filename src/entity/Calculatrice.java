package entity;

/*
 * Calculatrice.java
 * 
 * Contient des méthodes pour effectuer des calculs
 */
public class Calculatrice {
	
	// Constructeur par défaut
	public Calculatrice() {}
	
	/*
	 * Méthode qui additionne deux nombres
	 * @param a : le premier nombre
	 * @param b : le deuxième nombre
	 * @return : le résultat de l'addition
	 */
	public int addition(int a, int b) {
		return a+b;
	}
	
	/*
	 * Méthode qui soustrait deux nombres
	 * @param a : le premier nombre
	 * @param b : le deuxième nombre
	 * @return : le résultat de la soustraction
	 */
	public int soustraction(int a, int b) {
		return a-b;
	}
	
	/*
	 * Méthode qui multiplie deux nombres
	 * @param a : le premier nombre
	 * @param b : le deuxième nombre
	 * @return : le résultat de la multiplication
	 */
	public double multiplication(int a, int b) {
		return a*b;
	}
	
	/*
	 * Méthode qui divise deux nombres
	 * @param a : le premier nombre
	 * @param b : le deuxième nombre
	 * @return : le résultat de la division
	 */
	public double division(int a, int b) {
		return a/b;
	}
	
	/*
	 * Méthode qui fait le calcul correspondant à l'opérateur en paramètre
	 * @param a : le premier nombre
	 * @param b : le deuxième nombre
	 * @param operateur : l'opérateur
	 * @return : le résultat de la factorielle
	 */
	public double calcul(int a, int b, String operateur) {
		double resultat = 0;
		
		//Nous testons l'opérateur en paramètre pour effectuer le bon calcul
		//Le switch est plus rapide que les if/else
		switch(operateur) {
		case "+":
			resultat = a+b;
			break;
		case "-":
			resultat = a-b;
			break;
		case "*":
			resultat = a*b;
			break;
		case "/":
			resultat = a/b;
			break;
		}
		
		return resultat;
	}
	
	/*
	 * Méthode qui calcule la factorielle d'un nombre (de manière récursive)
	 * @param n : le nombre
	 * @return : le résultat de la factorielle
	 */
	public static int factorielleRecursive(int n) {
	    if (n == 0) {
	        return 1;
	    } else {
	        return n * factorielleRecursive(n-1);
	    }
	}
	
	/*
	 * Méthode qui calcule la factorielle d'un nombre (de manière itérative)
	 * @param n : le nombre
	 * @return : le résultat de la factorielle
	 */
	public static int factorielleIterative(int n) {
	    int result = 1;
	    for (int i = 1; i <= n; i++) {
	        result *= i;
	    }
	    return result;
	}
	
	/*
	 * Méthode qui met le programme en pause pendant un certain temps 
	 * @param time : le temps en secondes
	 * @return : true
	 * @throws InterruptedException
	 */
	public boolean wait(int time) {
		try {
			Thread.sleep(time*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

}


