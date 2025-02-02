package problem;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class EncodeAndDecodeTinyURLTester {
    EncodeAndDecodeTinyURL encodeAndDecodeTinyURL = new EncodeAndDecodeTinyURL();

    @Test
    public void example1(){
        String url = "https://leetcode.com/problems/design-tinyurl";
        String result = "https://leetcode.com/problems/design-tinyurl";

        String actual = encodeAndDecodeTinyURL.decode(encodeAndDecodeTinyURL.encode(url));

        assertEquals(result, actual);
    }

    @Test
    public void example2(){
        String url = "https://leetcode.com/problems/design-tinyurl";
        String wrongShortUrl = "https://dufhfius.com/asdijoiw";

        String shortUrl =  encodeAndDecodeTinyURL.encode(url);
        String actual = encodeAndDecodeTinyURL.decode(wrongShortUrl);

        assertNull(actual);
    }
}
