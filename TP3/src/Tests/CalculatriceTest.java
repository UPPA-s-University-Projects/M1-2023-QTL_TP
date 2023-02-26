package test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import entity.Calculatrice;

/*
 * La classe Test liée à la classe Calculatrice
 * Contient les tests unitaires pour tester les méthodes de la classe Calculatrice
 */
public class CalculatriceTest {
	
    /*
     * Explications :
     * Pour chaque méthode que nous souhaitons tester, nous allons créer une méthode de test
     * Ces méthodes de test doivent être annotées avec @Test
     * D'autres annotations existent pour définir des conditions de test 
     * (ex : @Disabled pour désactiver un test, @Timeout pour définir un temps d'exécution maximum)
     */


    //Attributs
    //Ils vont nous permettre de calculer le temps d'exécution des tests
    //En faisant la différence entre le temps de début et le temps de fin
	private static long startTime;
	private long testStartTime;
	
    /*
    * Test de la méthode addition
    * On vérifie que l'addition de 4 et -2 est bien égale à 2
    * On utilise la méthode assertEquals de la classe Assertions
    * Elle prend en paramètre la valeur attendue et la valeur obtenue
    * Si les deux valeurs sont égales, le test est réussi
    */
	@Test
    void testCalculatriceAddition() {
		Calculatrice calculatrice = new Calculatrice();
        assertEquals(2, calculatrice.addition(4, -2));
    }
	
    /*
     * Test de la méthode soustraction
     * On vérifie que la soustraction de 4 et 2 est bien égale à 2
     */
	@Test
    void testCalculatriceSoustraction() {
		Calculatrice calculatrice = new Calculatrice();
        assertEquals(2, calculatrice.soustraction(4, 2));
    }
	
    /*
     * Test de la méthode multiplication
     * On vérifie que la multiplication de 434 et 3645 est bien égale à 1577700 (434*3645)
     */
	@Test
    void testCalculatriceMultiplication() {
		Calculatrice calculatrice = new Calculatrice();
        assertEquals(434*3645, calculatrice.multiplication(434, 3645));
    }
	
    /*
     * Test de la méthode division
     * On vérifie que la division de 42 et 4 est bien égale à 10
     */
	@Test
    void testCalculatriceDivision() {
		Calculatrice calculatrice = new Calculatrice();
        assertEquals(10.0, calculatrice.division(42,4));
    }
	
    /*
     * Test de la méthode calcul avec l'opérateur +
     * On vérifie que le calcul de 42+4 est bien égale à 46
     */
	@Test
    void testCalculatriceCalcul() {
		Calculatrice calculatrice = new Calculatrice();
        assertEquals(46, calculatrice.calcul(42,4,"+"));
    }
	
    /*
     * Test de la méthode factorielle récursive
     * On vérifie que la factorielle de 5 est bien égale à 120
     */
	@Test
    void testCalculatriceFactorielleRecursive() {
		Calculatrice calculatrice = new Calculatrice();
        assertEquals(120, calculatrice.factorielleRecursive(5));
    }
	
    /*
     * Test de la méthode factorielle itérative
     * On vérifie que la factorielle de 5 est bien égale à 120
     * On utilise l'annotation @Disabled pour désactiver le test
     * Il ne sera pas exécuté
     */
	@Test
	@Disabled
    void testCalculatriceFactorielleIterative() {
		Calculatrice calculatrice = new Calculatrice();
        assertEquals(120, calculatrice.factorielleIterative(5));
    }
	
	/*
     * Test de la méthode wait
     * On vérifie bien que la méthode wait avec un paramètre de 10 prend bien 10 secondes à s'exécuter
     * On utilise l'annotation @Timeout pour définir un temps maximum d'exécution du test
     * Si le test dépasse ce temps, il est considéré comme échoué
     * Ici, le test est considéré comme échoué si il prend plus de 10 secondes à s'exécuter
     */
	@Test
	@Timeout(value = 10000)
    void testCalculatriceWait() {
		Calculatrice calculatrice = new Calculatrice();
        assertEquals(true, calculatrice.wait(10));
    }
	
	/*
     * Test de la méthode addition avec plusieurs valeurs
     * On utilise l'annotation @ParameterizedTest pour définir un test paramétré
     * On utilise l'annotation @CsvSource pour définir les valeurs à tester
     * Pour chaque ligne, on exécute le test avec les valeurs de la ligne (dans le fichier CSV)
     * 
     * Ici, le test est exécuté 3 fois avec les valeurs suivantes :
     * a=1, b=2, expected=3
     * a=4, b=5, expected=9
     * a=7, b=8, expected=15
     */
	@ParameterizedTest
    @CsvSource({ "1, 2, 3", "4, 5, 9", "7, 8, 15" })
    void testCsvSource(int a, int b, int expected) {
		Calculatrice calculatrice = new Calculatrice();
        int result = calculatrice.addition(a, b);
        assertEquals(expected, result);
    }
	
	/*
     * Test de la méthode addition avec plusieurs valeurs
     * Même principe que le test précédent, mais les valeurs sont lues dans un fichier CSV	
     */
	@ParameterizedTest
    @CsvFileSource(resources="~/test.csv")
    void testCsvFileSource(int a, int b, int expected) {
		Calculatrice calculatrice = new Calculatrice();
        int result = calculatrice.addition(a, b);
        assertEquals(expected, result);
    }
	
	/*
     * Nous allons utiliser les méthodes @BeforeAll et @AfterAll pour afficher le temps d'exécution total des tests
     * Nous allons utiliser les méthodes @BeforeEach et @AfterEach pour afficher le temps d'exécution de chaque test
     * 
     * Les méthodes @BeforeAll et @AfterAll sont exécutées une seule fois avant et après tous les tests
     * Les méthodes @BeforeEach et @AfterEach sont exécutées avant et après chaque test
     * 
     * Pour chaque test, on affiche le temps d'exécution du test
     */
	@BeforeAll
    static void setUpAll() {
        startTime = System.currentTimeMillis();
        System.out.println("Démarrage des tests...");
    }

    @BeforeEach
    void setUp() {
        testStartTime = System.currentTimeMillis();
        System.out.println("Démarrage d\'un test...");
    }
    
    
    @AfterEach
    void afterTest() {
        long testEndTime = System.currentTimeMillis();
        long testDuration = testEndTime - testStartTime;
        System.out.println("Test fini en " + testDuration + "ms");
    }

    @AfterAll
    static void afterAllTest() {
        long endTime = System.currentTimeMillis();
        long totalDuration = endTime - startTime;
        System.out.println("Tous les tests finis en " + totalDuration + "ms");
    }

}
