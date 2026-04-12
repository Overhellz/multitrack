package com.github.rodiond26.multitrack.p01_hash_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Codec2 {

    private final Map<String, String> originalToShortened = new HashMap<>();
    private final Map<String, String> shortenedToOriginal = new HashMap<>();
    private final String BASE_URL = "http://tinyurl.com/";

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if (originalToShortened.containsKey(longUrl)) {
            return BASE_URL + originalToShortened.get(longUrl);
        }

        String key;
        do {
            key = generateKey();
        } while (shortenedToOriginal.containsKey(key));

        originalToShortened.put(longUrl, key);
        shortenedToOriginal.put(key, longUrl);
        return BASE_URL + key;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String key = shortUrl.replace(BASE_URL, "");
        return shortenedToOriginal.get(key);
    }

    private String generateKey() {
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder key = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            key.append(chars.charAt(random.nextInt(chars.length())));
        }
        return key.toString();
    }
}
