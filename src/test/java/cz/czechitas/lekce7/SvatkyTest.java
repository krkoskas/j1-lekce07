package cz.czechitas.lekce7;

import org.junit.jupiter.api.Test;

import java.time.Month;
import java.time.MonthDay;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Filip Jirsák
 */
class SvatkyTest {

    /**
     * Testuje metodu {@link Svatky#vratKdyMaSvatek(String)}
     */
    @Test
    void testVratkdyMaSvatek() {
        Svatky svatky = new Svatky();
        assertEquals(MonthDay.of(5, 18), svatky.vratKdyMaSvatek("Nataša"));
        assertNull(svatky.vratKdyMaSvatek("Eva"));
    }

    /**
     * Testuje metodu {@link Svatky#jeVSeznamu(String)}
     */
    @Test
    void testJeVSeznamu() {
        Svatky svatky = new Svatky();
        assertTrue(svatky.jeVSeznamu("Monika"));
        assertFalse(svatky.jeVSeznamu("Evženie"));
        //TODO Otestovat, že najde v seznamu existující jméno a nenajde neexistující jméno
    }

    /**
     * Testuje metodu {@link Svatky#getPocetJmen()}
     */
    @Test
    void testGetPocetJmen() {
        Svatky svatky = new Svatky();
        assertEquals(37, svatky.getPocetJmen());
        //TODO Otestovat, že vrací počet jmen, která máme v seznamu
    }

    /**
     * Testuje metodu {@link Svatky#getSeznamJmen()}
     */
    @Test
    void TestGetSeznamJmen() {
        Svatky svatky = new Svatky();
        //TODO Zkontrolovat, že seznam jmen má správný počet položek.
    }

    /**
     * Testuje metodu {@link Svatky#pridejSvatek(String, int, int)}
     */
    @Test
    void TestPridejSvatekDenMesicInt() {
        Svatky svatky = new Svatky();
        svatky.pridejSvatek("Zuzana", 11, 8);
        assertTrue(svatky.jeVSeznamu("Zuzana"));
        assertEquals(MonthDay.of(8, 11), svatky.vratKdyMaSvatek("Zuzana"));
        //TODO Otestuje, že je jméno v seznamu svátků a že má přiřazen správný den
    }

    /**
     * Testuje metodu {@link Svatky#pridejSvatek(String, int, Month)}
     */
    @Test
    void pridejSvatekDenMesicMonth() {
        Svatky svatky = new Svatky();
        svatky.pridejSvatek("Zuzana", 11, Month.AUGUST);
        assertTrue(svatky.jeVSeznamu("Zuzana"));
        assertEquals(MonthDay.of(8, 11), svatky.vratKdyMaSvatek("Zuzana"));
        //TODO Otestuje, že je jméno v seznamu svátků a že má přiřazen správný den
    }

    /**
     * Testuje metodu {@link Svatky#pridejSvatek(String, MonthDay)}
     */
    @Test
    void pridejSvatekMonthDay() {
        Svatky svatky = new Svatky();
        svatky.pridejSvatek("Zuzana", MonthDay.of(8, 11));
        assertTrue(svatky.jeVSeznamu("Zuzana"));
        assertEquals(MonthDay.of(8, 11), svatky.vratKdyMaSvatek("Zuzana"));
        //TODO Otestuje, že je jméno v seznamu svátků a že má přiřazen správný den
    }

    /**
     * Testuje metodu {@link Svatky#smazSvatek(String)}
     */
    @Test
    void smazSvatek() {
        Svatky svatky = new Svatky();
        assertEquals(37, svatky.getPocetJmen());
        svatky.smazSvatek("Monika");
        assertEquals(36, svatky.getPocetJmen());
    }
}
