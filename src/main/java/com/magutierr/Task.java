package com.magutierr;

import java.util.LinkedHashSet;
import java.util.Set;

public class Task {

    /**
     * Removes duplicate characters from a string using a LinkedHashSet.
     * Sets are data structures that do not accept duplicate values. The LinkedHashSet
     * implementation should be used to preserve the order of the given string.
     *
     * @param string The string from which duplicate characters are to be removed.
     * @return A string without duplicate characters.
     */
    public static String removeDuplicates(String string) {
        if (string == null) return null;
        Set<Character> hashSet = new LinkedHashSet<>();
        StringBuilder withoutDuplicates = new StringBuilder();
        for (Character character : string.toCharArray()) {
            hashSet.add(character);
        }
        hashSet.forEach(withoutDuplicates::append);
        return withoutDuplicates.toString();
    }

}