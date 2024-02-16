package es.iessoterohernandez.daw.endes.ej2_test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class VideojuegoTest {
    private Videojuego videojuego;

    @Before
    public void setUp() {
        videojuego = new Videojuego();
        videojuego.setTitulo("Fornite");
        videojuego.setHorasEstimadas(190);
        videojuego.setGenero("Shooter");
        videojuego.setcompañia("Epic Games");
        videojuego.entregar();
    }

    @Test
    public void testGetTitulo() {
        assertEquals("Fortnite", videojuego.getTitulo());
    }

    @Test
    public void testSetTitulo() {
        videojuego.setTitulo("Cars");
        assertEquals("Cars", videojuego.getTitulo());
    }

    @Test
    public void testGetHorasEstimadas() {
        assertEquals(190, videojuego.getHorasEstimadas());
    }

    @Test
    public void testSetHorasEstimadas() {
        videojuego.setHorasEstimadas(80);
        assertEquals(80, videojuego.getHorasEstimadas());
    }

    @Test
    public void testGetGenero() {
        assertEquals("Shooter", videojuego.getGenero());
    }

    @Test
    public void testSetGenero() {
        videojuego.setGenero("Platform");
        assertEquals("Platform", videojuego.getGenero());
    }

    @Test
    public void testGetCompañia() {
        assertEquals("Nintendo", videojuego.getcompañia());
    }

    @Test
    public void testSetCompañia() {
        videojuego.setcompañia("Sony Interactive Entertainment");
        assertEquals("Sony Interactive Entertainment", videojuego.getcompañia());
    }

    @Test
    public void testEntregar() {
        assertTrue(videojuego.isEntregado());
    }

    @Test
    public void testDevolver() {
        videojuego.devolver();
        assertFalse(videojuego.isEntregado());
    }

    @Test
    public void testIsEntregado() {
        assertTrue(videojuego.isEntregado());
    }

    @Test
    public void testCompareToMayor() {
        Videojuego otroVideojuego = new Videojuego("Assassin's Creed Valhalla", 150, "Action-Adventure", "Ubisoft");
        assertEquals(1, videojuego.compareTo(otroVideojuego));
    }

    @Test
    public void testCompareToIgual() {
        Videojuego otroVideojuego = new Videojuego("Super Mario Odyssey", 120, "Platform", "Nintendo");
        assertEquals(0, videojuego.compareTo(otroVideojuego));
    }

    @Test
    public void testCompareToMenor() {
        Videojuego otroVideojuego = new Videojuego("Celeste", 20, "Platform", "Matt Makes Games");
        assertEquals(-1, videojuego.compareTo(otroVideojuego));
    }

    @Test
    public void testToString() {
        String expectedString = "Informacion del videojuego: \n" +
                                "\tTitulo: The Legend of Zelda: Breath of the Wild\n" +
                                "\tHoras estimadas: 120\n" +
                                "\tGenero: Action-Adventure\n" +
                                "\tcompañia: Nintendo";
        assertEquals(expectedString, videojuego.toString());
    }

    @Test
    public void testEqualsIguales() {
        Videojuego otroVideojuego = new Videojuego("Fortnite", 190, "Shooter", "Epic Games");
        assertTrue(videojuego.equals(otroVideojuego));
    }

    @Test
    public void testEqualsDistintos() {
        Videojuego otroVideojuego = new Videojuego("Super Mario Odyssey", 120, "Platform", "Nintendo");
        assertFalse(videojuego.equals(otroVideojuego));
    }
}