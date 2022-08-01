package com.futurecollars.lesson13.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

class GenericListTest {

    GenericList<String> genericList = new GenericList<>();

    @ParameterizedTest(name = "Element: {0}")
    @ValueSource(strings = {"ala", "kot", "pies"})
    void shouldBeAdd(String element) {
        //when
        boolean expectAdded = genericList.add(element);
        //then
        assertTrue(expectAdded);
    }

    @Test
    void shouldBeGetElement() {
        //given
        int index = 1;
        genericList.add("ala");
        genericList.add("kot");
        genericList.add("pies");
        //when
        String expectElement = genericList.get(index);
        //then
        Assertions.assertEquals("kot", expectElement);
    }

    @Test
    void shouldBeRemoveElement() {
        //given
        genericList.add("ala");
        genericList.add("kot");
        genericList.add("pies");
        //when
        boolean expectRemoved = genericList.remove("kot");
        //then
        assertTrue(expectRemoved);

    }

    @Test
    void shouldBeSize() {
        //given
        genericList.add("ala");
        genericList.add("kot");
        genericList.add("pies");
        //when
        int size = genericList.size();
        //then
        Assertions.assertEquals(3, size);
    }

}