package edu.badpals.RicksyBusiness;

import junit.framework.TestCase;

public class ReceptivoTest extends TestCase {

    public void testReceptivoSingleton(){
        Receptivo receptivo = Receptivo.getReceptivo();
        Receptivo clonreceptivo = Receptivo.getReceptivo();
        assertEquals(clonreceptivo,receptivo);
        assertSame(clonreceptivo,receptivo);
    }

}