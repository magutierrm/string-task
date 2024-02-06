package com.magutierr;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;


public class RemoveDuplicateTests {

    @Test
    public void givenNull_thenReturnNull() {
        assertNull(Task.removeDuplicates(null));
    }

    @Test
    public void givenStrings_thenRemoveAnyDuplicate() {
        givenStrings_thenCheckForEquality(Task.removeDuplicates("     "), " ");
        givenStrings_thenCheckForEquality(Task.removeDuplicates("AABBCCD112233"), "ABCD123");
        givenStrings_thenCheckForEquality(Task.removeDuplicates("AAAABBBCCC"), "ABC");
        givenStrings_thenCheckForEquality(Task.removeDuplicates("123455667788"), "12345678");
        givenStrings_thenCheckForEquality(Task.removeDuplicates("abcdefg"), "abcdefg");
        givenStrings_thenCheckForEquality(Task.removeDuplicates("AAABBBCCCDDDEEE"), "ABCDE");
        givenStrings_thenCheckForEquality(Task.removeDuplicates(""), "");
        givenStrings_thenCheckForEquality(Task.removeDuplicates("111222333444"), "1234");
        givenStrings_thenCheckForEquality(Task.removeDuplicates("AAA"), "A");
        givenStrings_thenCheckForEquality(Task.removeDuplicates("ABABAB"), "AB");
        givenStrings_thenCheckForEquality(Task.removeDuplicates("A1B2C3D4"), "A1B2C3D4");
        givenStrings_thenCheckForEquality(Task.removeDuplicates("ABCDabcd"), "ABCDabcd");
        givenStrings_thenCheckForEquality(Task.removeDuplicates("1122334455"), "12345");
        givenStrings_thenCheckForEquality(Task.removeDuplicates("aaaaabbb"), "ab");
        givenStrings_thenCheckForEquality(Task.removeDuplicates("ABABABAB"), "AB");
        givenStrings_thenCheckForEquality(Task.removeDuplicates("AAA111BBB222"), "A1B2");
        givenStrings_thenCheckForEquality(Task.removeDuplicates("!@#$%^&*()_+"), "!@#$%^&*()_+");
        givenStrings_thenCheckForEquality(Task.removeDuplicates(":))))))"), ":)");
        givenStrings_thenCheckForEquality(Task.removeDuplicates(":("), ":(");
        givenStrings_thenCheckForEquality(Task.removeDuplicates("aAbBcC"), "aAbBcC");
        givenStrings_thenCheckForEquality(Task.removeDuplicates("2++2?"), "2+?");
    }

    public void givenStrings_thenCheckForEquality(String actual, String expected) {
        assertThat(actual).isEqualTo(expected);
    }

}
