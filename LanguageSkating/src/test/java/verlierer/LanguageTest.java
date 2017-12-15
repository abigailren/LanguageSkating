package verlierer;

import junit.framework.TestCase;

/**
 * Test class for Language
 */
public class LanguageTest extends TestCase {
    Language lang1 = new German();
    Language lang2 = new Japanese();

    public void testGetWordList0() throws Exception {
        assertEquals("Hallo",lang1.getWordList().get(0));
    }

    public void testMatching() throws Exception {

        assertEquals("Hello",lang1.getList().get(lang1.getWordList().indexOf("Hallo")));
    }
    public void testGetLanguageNameG() throws Exception {
        assertEquals("German",lang1.getLanguageName());
    }
    public void testGetLanguageNameJ() throws Exception {
        assertEquals("Japanese",lang2.getLanguageName());
    }


}