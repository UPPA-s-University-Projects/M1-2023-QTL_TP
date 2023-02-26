package test;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

import entity.Calculatrice;

/*
 * La classe Test liée à la classe Calculatrice
 * Contient les tests unitaires pour tester les méthodes de la classe Calculatrice
 */
public class CalculatriceTest {

	/*
	 * Test de la méthode addition
	 * On vérifie que l'addition de 4 et -2 est bien égale à 2 comme au TP1
	 * 
	 * On utilise la méthode assertThat de la classe MatcherAssert
	 * Elle prend en paramètre la valeur attendue et la valeur obtenue
	 * Si les deux valeurs sont égales, le test est réussi
	 * 
	 * On utilise la méthode is de la classe CoreMatchers
	 * Elle prend en paramètre la valeur attendue
	 * 
	 * On utilise la méthode equalTo de la classe CoreMatchers
	 * Elle prend en paramètre la valeur attendue
	 */
	@Test
    void testCalculatriceAddition() {
		Calculatrice calculatrice = new Calculatrice();
		//Nous pouvons lire cette ligne comme cela :
		//Nous supposons (assertThat) que 2 est (is) égual à equalTo(calculatrice.addition(1, 1) à 2
        assertThat(2,is(equalTo(calculatrice.addition(1, 1))));
    }
	
	@Test
    void testCalculatriceSoustraction() {
		Calculatrice calculatrice = new Calculatrice();
		assertThat(2,is(equalTo(calculatrice.soustraction(4, 2))));
    }
	
	@Test
    void testCalculatriceMultiplication() {
		Calculatrice calculatrice = new Calculatrice();
        assertThat(1581930.0,is(equalTo(calculatrice.multiplication(434, 3645))));
    }
	
	@Test
    void testCalculatriceDivision() {
		Calculatrice calculatrice = new Calculatrice();
		assertThat(10.0,is(equalTo(calculatrice.division(42,4))));
    }
	
	@Test
    void testCalculatriceCalcul() {
		Calculatrice calculatrice = new Calculatrice();
		assertThat(46.0,is(equalTo(calculatrice.calcul(42,4,"+"))));
    }
}
