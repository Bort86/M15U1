/**
 * Tests de la clase ADN
 * @author Pablo Rodriguez
 * @date 21/11/2018
 */
package examen;

import java.io.IOException;
import static junit.framework.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author tarda
 */
public class ADNTEST {
    
    /**
     * Test para confirmar funcionalidad del método searchSequence()
     * @throws IOException 
     */
    @Test
    public void testsearchSequence() throws IOException{
        ADN a = new ADN();
        String string_to_search="AA";
        int search_string=a.searchSequence(string_to_search);
        assertTrue(search_string == 3);
        
    }

    /**
     * Test para confirmar la funcionalidad del método testIsSequence()
     * @throws IOException 
     */
    @Test
    public void testisSequence() throws IOException{
        ADN a = new ADN();
        String seq_searched="AA";
        boolean answer=a.isSequence(seq_searched);
        assertTrue(answer == true);
    }
    
    /**
     * Test para confirmar la funcionalidad del método eraseSequence()
     * @throws IOException 
     */
    @Test
    public void testeraseSequence() throws IOException{
        ADN a = new ADN();
        String string_to_erase="CCC";
        String modified_adn = a.erase_Sequence(string_to_erase);
        assertTrue(modified_adn=="AAATTTCCGGATCGATTTTACCAATTG");
    }
}
