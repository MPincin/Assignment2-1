////////////////////////////////////////////////////////////////////
// Matteo Pincin 2034306
// Pedro Leoni 2042359
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testProva(){
        assertEquals(App.prova(),1);
    }
}
