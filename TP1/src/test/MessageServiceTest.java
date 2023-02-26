package test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import entity.MessageService;

/*

 * La classe Test liée à la classe MessageService
 * Contient les tests unitaires pour tester les méthodes de la classe MessageService
 */
public class MessageServiceTest {

    /*
     * Test de la méthode get de la classe MessageService
     * On vérifie que le message retourné est bien "Hello JUnit 5"
     * @DisplayName permet de donner un nom plus parlant au test
     */
	@DisplayName("Test MessageService.get()")
    @Test
    void testGet() {
        assertEquals("Hello JUnit 5", MessageService.get());
    }
	
}
