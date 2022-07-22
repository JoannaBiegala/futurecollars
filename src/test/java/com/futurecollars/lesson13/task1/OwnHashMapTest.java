package com.futurecollars.lesson13.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class OwnHashMapTest {
    OwnHashMap ownHashMap = new OwnHashMap();

    @ParameterizedTest(name = "Key: \"{0}\", Value: \"{1}\"")
    @CsvSource(value = {"Ala:kot", "Franek:wąż", "Jacek:żaba"}, delimiter = ':')
    void ShouldHavePut(String key, String value) {
        //when
        boolean expectThePutWasSuccessful = this.ownHashMap.put(key, value);
        //then
        assertTrue(expectThePutWasSuccessful);
    }

    @ParameterizedTest(name = "Key: \"{0}\"")
    @ValueSource(strings = {"Olek", "Iza", "Kasia"})
    void shouldBeContainsKey(String key) {
        //given
        this.ownHashMap.put("Olek", "pies");
        this.ownHashMap.put("Kasia", "papuga");
        this.ownHashMap.put("Magda", "kanarek");
        this.ownHashMap.put("Iza", "rybka");
        //when
        boolean expectContainsKey = ownHashMap.containsKey(key);
        //then
        assertTrue(expectContainsKey);
    }

    @ParameterizedTest(name = "Key: \"{0}\"")
    @ValueSource(strings = {"Oleksy", "Izolda", "Katarzyna"})
    void shouldBeNotContainsKey(String key) {
        //given
        this.ownHashMap.put("Olek", "pies");
        this.ownHashMap.put("Kasia", "papuga");
        this.ownHashMap.put("Magda", "kanarek");
        this.ownHashMap.put("Iza", "rybka");
        //when
        boolean expectContainsKey = ownHashMap.containsKey(key);
        //then
        assertFalse(expectContainsKey);
    }


    @ParameterizedTest(name = "Value: \"{0}\"")
    @ValueSource(strings = {"pies", "rybka", "kanarek"})
    void shouldBeContainsValue(String value) {
        //given
        this.ownHashMap.put("Olek", "pies");
        this.ownHashMap.put("Kasia", "papuga");
        this.ownHashMap.put("Magda", "kanarek");
        this.ownHashMap.put("Iza", "rybka");
        //when
        boolean expectContainsValue = ownHashMap.containsValue(value);
        //then
        assertTrue(expectContainsValue);
    }

    @ParameterizedTest(name = "Value: \"{0}\"")
    @ValueSource(strings = {"piess", "ryba", "kanar"})
    void shouldBeNotContainsValue(String value) {
        //given
        this.ownHashMap.put("Olek", "pies");
        this.ownHashMap.put("Kasia", "papuga");
        this.ownHashMap.put("Magda", "kanarek");
        this.ownHashMap.put("Iza", "rybka");
        //when
        boolean expectNotContainsValue = ownHashMap.containsValue(value);
        //then
        assertFalse(expectNotContainsValue);
    }

    @ParameterizedTest(name = "Key: \"{0}\"")
    @ValueSource(strings = {"Iza", "Kasia"})
    void shouldBeRemove(String key) {
        //given
        this.ownHashMap.put("Olek", "pies");
        this.ownHashMap.put("Kasia", "rybka");
        this.ownHashMap.put("Magda", "kanarek");
        this.ownHashMap.put("Iza", "rybka");
        //when
        String expectRemovedValue = ownHashMap.remove(key);
        //then
        Assertions.assertEquals("rybka", expectRemovedValue);
    }

    @ParameterizedTest(name = "Key: \"{0}\"")
    @ValueSource(strings = {"Izunia", "Kasiunia"})
    void shouldNotBeRemove(String key) {
        //given
        this.ownHashMap.put("Olek", "pies");
        this.ownHashMap.put("Kasia", "rybka");
        this.ownHashMap.put("Magda", "kanarek");
        this.ownHashMap.put("Iza", "rybka");
        //when
        String expectNotRemovedValue = ownHashMap.remove(key);
        //then
        Assertions.assertEquals("There is no entry for the given key " + key, expectNotRemovedValue);
    }

    @ParameterizedTest(name = "Key: \"{0}\"")
    @ValueSource(strings = {"Iza", "Kasia"})
    void shouldGetValue(String key) {
        //given
        this.ownHashMap.put("Olek", "pies");
        this.ownHashMap.put("Kasia", "rybka");
        this.ownHashMap.put("Magda", "kanarek");
        this.ownHashMap.put("Iza", "rybka");
        //when
        String expectGetValue = ownHashMap.remove(key);
        //then
        Assertions.assertEquals("rybka", expectGetValue);
    }

    @ParameterizedTest(name = "Key: \"{0}\"")
    @ValueSource(strings = {"Izolda", "Kazik"})
    void shouldNotGetValue(String key) {
        //given
        this.ownHashMap.put("Olek", "pies");
        this.ownHashMap.put("Kasia", "rybka");
        this.ownHashMap.put("Magda", "kanarek");
        this.ownHashMap.put("Iza", "rybka");
        //when
        String expectNotGetValue = ownHashMap.remove(key);
        //then
        Assertions.assertEquals("There is no entry for the given key " + key, expectNotGetValue);
    }

}