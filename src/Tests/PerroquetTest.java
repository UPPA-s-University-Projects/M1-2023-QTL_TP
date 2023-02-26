package test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import entity.Perroquet;

/*
 * La classe Test liée à la classe Perroquet
 * Contient les tests unitaires pour tester les méthodes de la classe Perroquet
 */
public class PerroquetTest {
	
    /*
     * Test de la méthode perroquetParlant
     * On vérifie que le message retourné est bien "Hello"
     */
	@Test
    void testPerroquetParlant() {
		Perroquet perroquet = new Perroquet();
        assertEquals("Hello", perroquet.perroquetParlant("Hello"));
    }
	
    /*
     * Test de la méthode perroquetBonjour
     * On vérifie que le message retourné est bien "Bonjour Clément"
     */
	@Test
    void testPerroquetBonjour() {
		Perroquet perroquet = new Perroquet();
        assertEquals("Bonjour Clément", perroquet.perroquetBonjour("Clément"));
    }

}
