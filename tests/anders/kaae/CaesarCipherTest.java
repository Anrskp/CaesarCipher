package anders.kaae;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarCipherTest {

    private CaesarCipher CC = new CaesarCipher();

    @Test
    void CCEncrypt() {
    assertEquals("guvf vf n frperg zrffntr", CC.CCEncrypt("This is a secret message", 13));
    assertEquals("bcd", CC.CCEncrypt("abc",1));
    assertEquals("abc", CC.CCEncrypt("xyz", 3));
    }

    @Test
    void CCDecrypt() {

    String[] results = CC.CCDecrypt("guvf vf n frperg zrffntr");
    assertEquals("this is a secret message", results[13]);
    }

}