package com.github.rodiond26.multitrack.p01_hash_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Codec {

    private final Map<String, String> originalUrlToShortened = new HashMap<>();
    private final Map<String, String> shortenedUrlToOriginal = new HashMap<>();
    private final String BASE_URL = "http://tinyurl.com/";

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if (originalUrlToShortened.containsKey(longUrl)) {
            return BASE_URL + originalUrlToShortened.get(longUrl);
        }
        String key;
        do {
            key = generateKey();
        } while (shortenedUrlToOriginal.containsKey(key));

        shortenedUrlToOriginal.put(key, longUrl);
        originalUrlToShortened.put(longUrl, key);
        return BASE_URL + key;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String key = shortUrl.replace(BASE_URL, "");
        return shortenedUrlToOriginal.get(key);
    }

    // TODO: snippet
    private String generateKey() {
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder key = new StringBuilder();
        Random rnd = new Random();
        for (int i = 0; i < 6; i++) {
            key.append(chars.charAt(rnd.nextInt(chars.length())));
        }
        return key.toString();
    }
}
