package es.iessoterohernandez.daw.endes.ej2_test;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class SerieTest {
    private series serie;

    @Before
    public void setUp() {
        serie = new series();
        serie.setTitulo("Miercoles");
        serie.setnumeroTemporadas(2);
        serie.setGenero("Drama");
        serie.isEntregado();
        serie.setcreador("Jenna Ortega");
    }

    @Test
    public void testGetTitulo() {
        assertEquals("Miercoles", serie.getTitulo());
    }

    @Test
    public void testSetTitulo() {
        serie.setTitulo("Torrente");
        assertEquals("Torrente", serie.getTitulo());
    }

    @Test
    public void testGetNumeroTemporadas() {
        assertEquals(2, serie.getnumeroTemporadas());
    }

    @Test
    public void testSetNumeroTemporadas() {
        serie.setnumeroTemporadas(4);
        assertEquals(4, serie.getnumeroTemporadas());
    }

    @Test
    public void testGetGenero() {
        assertEquals("Drama", serie.getGenero());
    }

    @Test
    public void testSetGenero() {
        serie.setGenero("Comedia");
        assertEquals("Comedia", serie.getGenero());
    }

    @Test
    public void testEntregado() {
        assertEquals(false, serie.isEntregado());
    }

    @Test
    public void testSetEntregado() {
        serie.isEntregado();
        assertEquals(true, serie.isEntregado());
    }

    @Test
    public void testGetCreador() {
        assertEquals("Jenna Ortega", serie.getcreador());
    }

    @Test
    public void testSetCreador() {
        serie.setcreador("El Parlita");
        assertEquals("El Parlita", serie.getcreador());
    }
}