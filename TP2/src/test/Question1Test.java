package test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

import entity.Personne;

/*
 * La classe Test liée à la classe Personne
 * Contient les tests unitaires pour tester les méthodes de la classe Personne
 */
public class Question1Test {
	
    /*
     * Eplications :
     * 
     * Nous utilisons différentes méthodes de la classe Assertions
     * assertEquals : vérifie que deux valeurs sont égales
     * assertNotEquals : vérifie que deux valeurs ne sont pas égales
     * assertNull : vérifie que la valeur est null
     * assertNotNull : vérifie que la valeur n'est pas null
     * assertTrue : vérifie que la valeur est true
     * assertFalse : vérifie que la valeur est false
     * fail : force l'échec du test
    */

    /*
    * Méthode utilisant la méthode assertEquals
    * On vérifie que le nom de la personne est bien "laville"
    * assertEquals prend en paramètre la valeur attendue et la valeur obtenue
    * Si les deux valeurs sont égales, le test est réussi
    */
	@Test
    void testEquals() {
        //Nous créons la personne Lise Laville
		Personne personne = new Personne("laville","lise");
        //Nous testons que le nom de la personne est bien "laville"
        assertEquals("laville",personne.getNom());
    }
	
    /*
     * Méthode utilisant la méthode assertNotEquals
     * On vérifie que le nom de la personne n'est pas "combier"
     * assertNotEquals prend en paramètre la valeur attendue et la valeur obtenue
     * Si les deux valeurs ne sont pas égales, le test est réussi
     */
	@Test
    void testNotEquals() {
        //Nous créons la personne Lise Laville
		Personne personne = new Personne("laville","lise");
        //Nous testons que le nom de la personne n'est pas "combier"
        assertEquals("combier",personne.getNom());
    }
	
    /*
     * Méthode utilisant la méthode assertNull
     * On vérifie que la personne est bien null
     * assertNull prend en paramètre la valeur attendue
     * Si la valeur est null, le test est réussi
     */
	@Test
    void testNull() {
        //Nous créons une personne null
		Personne personne = null;
        //Nous testons que la personne est bien null
        assertNull(personne);
    }
	
    /*
     * Méthode utilisant la méthode assertNotNull
     * On vérifie que la personne n'est pas null
     * assertNotNull prend en paramètre la valeur attendue
     * Si la valeur n'est pas null, le test est réussi
     */
	@Test
    void testNotNull() {
        //Nous créons la personne Lise Laville
		Personne personne = new Personne("laville","lise");
        //Nous testons que la personne n'est pas null
        assertNotNull(personne);
    }
	
    /*
     * Méthode utilisant la méthode assertTrue
     * On vérifie que la valeur est true
     * assertTrue prend en paramètre la valeur attendue
     * Si la valeur est true, le test est réussi
     */
	@Test
    void testTrue() {
		boolean test = true;
        assertTrue(test);
    }
	
    /*
     * Méthode utilisant la méthode assertFalse
     * On vérifie que la valeur est false
     * assertFalse prend en paramètre la valeur attendue
     * Si la valeur est false, le test est réussi
     */
	@Test
    void testFalse() {
		boolean test = false;
        assertFalse(test);
    }
	
    /*
     * Méthode utilisant la méthode fail
     * On force l'échec du test
     * fail ne prend pas de paramètre
     * Le test est forcément échoué
     */
	@Test
    public void testFail() {
        int expected = 2;
        int actual = 1 + 2;
        assertEquals(expected, actual);
    }
	

}
