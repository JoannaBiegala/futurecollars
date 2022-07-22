package com.futurecollars.lesson13.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class OwnFifoQueueTest {

    OwnFifoQueue ownFifoQueue = new OwnFifoQueue();

    @ParameterizedTest(name = "Element: {0}")
    @ValueSource(ints = {123, 124, 125})
    void shouldBeAdd(Integer element) {
        //when
        boolean expectAdded = ownFifoQueue.add(element);
        //then
        assertTrue(expectAdded);
    }

    @Test
    void shouldBeRemoveFirstElement() {
        //given
        ownFifoQueue.add(11);
        ownFifoQueue.add(12);
        ownFifoQueue.add(7);
        //when
        Integer expectFirstElement = ownFifoQueue.remove();
        //then
        Assertions.assertEquals(11, expectFirstElement);
    }

    @Test
    void shouldNotRemoveElementFromEmptyList() {
        //given
        //when
        Integer expectFirstElement = ownFifoQueue.remove();
        //then
        assertNull(expectFirstElement);
    }

    @Test
    void shouldBeFirstElement() {
        //given
        ownFifoQueue.add(211);
        ownFifoQueue.add(312);
        ownFifoQueue.add(447);
        //when
        Integer expectFirstElement = ownFifoQueue.element();
        //then
        Assertions.assertEquals(211, expectFirstElement);
    }

    @Test
    void shouldNotCheckFirstElementFromEmptyList() {
        //given
        //when
        Integer expectFirstElement = ownFifoQueue.element();
        //then
        assertNull(expectFirstElement);
    }

}