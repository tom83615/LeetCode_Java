package problem;

import java.util.HashMap;
import java.util.Random;

public class EncodeAndDecodeTinyURL {
//    TinyURL is a URL shortening service where you enter a URL such as https://leetcode.com/problems/design-tinyurl and it returns a short URL such as http://tinyurl.com/4e9iAk. Design a class to encode a URL and decode a tiny URL.
//    There is no restriction on how your encode/decode algorithm should work. You just need to ensure that a URL can be encoded to a tiny URL and the tiny URL can be decoded to the original URL.
//    Implement the Solution class:
//    Solution() Initializes the object of the system.
//    String encode(String longUrl) Returns a tiny URL for the given longUrl.
//            String decode(String shortUrl) Returns the original long URL for the given shortUrl. It is guaranteed that the given shortUrl was encoded by the same object.
//
//
//    Example 1:
//    Input: url = "https://leetcode.com/problems/design-tinyurl"
//    Output: "https://leetcode.com/problems/design-tinyurl"
//
//    Explanation:
//    Solution obj = new Solution();
//    string tiny = obj.encode(url); // returns the encoded tiny url.
//    string ans = obj.decode(tiny); // returns the original url after deconding it.
//    Constraints:
//    1 <= url.length <= 104
//    url is guranteed to be a valid URL.

    private final HashMap<String, String> map = new HashMap<>();
    private final static String tinyUrl = "https://leetcode.com/problems/";
    private final static int leftLimit = 97; // letter 'a'
    private final static int rightLimit = 122; // letter 'z'
    private final static int len = 5;
    Random random = new Random();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String shortUrl = randomString();
        map.put(shortUrl, longUrl);
        return shortUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }

    //generate randomString
    public String randomString() {
        return random.ints(leftLimit, rightLimit + 1)
                .limit(len)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .insert(0, tinyUrl)
                .toString();
    }
}
