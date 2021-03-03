package com.store.manager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class TrainTest {

    @Test
    public void passengerTrain()
    {
        final Train train = new Train("HPP");
        assertEquals("<HHHH::|OOOO|::|OOOO|", train.print());
    }

    @Test
    public void restaurantTrain()
    {
        final Train train = new Train("HPRP");
        assertEquals("<HHHH::|OOOO|::|hThT|::|OOOO|", train.print());
    }

    @Test
    public void doubleHeadedTrain()
    {
        final Train train = new Train("HPRPH");
        assertEquals("<HHHH::|OOOO|::|hThT|::|OOOO|::HHHH>", train.print());
    }

    @Test
    public void modifyTrain()
    {
        final Train train = new Train("HPRPH");
        train.detachEnd();
        assertEquals("<HHHH::|OOOO|::|hThT|::|OOOO|", train.print());
        train.detachHead();
        assertEquals("|OOOO|::|hThT|::|OOOO|", train.print());
        train.detachEnd();
        assertEquals("|OOOO|::|hThT|", train.print());
    }

    @Test
    public void cargoTrain()
    {
        final Train train = new Train("HCCC");
        assertEquals("<HHHH::|____|::|____|::|____|", train.print());
        train.fill();
        assertEquals("<HHHH::|^^^^|::|____|::|____|", train.print());
        train.fill();
        assertEquals("<HHHH::|^^^^|::|^^^^|::|____|", train.print());
        train.fill();
        assertEquals("<HHHH::|^^^^|::|^^^^|::|^^^^|", train.print());
        assertFalse(train.fill());
    }

    @Test
    public void mixedTrain()
    {
        final Train train = new Train("HPCPC");
        assertEquals("<HHHH::|OOOO|::|____|::|OOOO|::|____|", train.print());
        train.fill();
        assertEquals("<HHHH::|OOOO|::|^^^^|::|OOOO|::|____|", train.print());
        train.fill();
        assertEquals("<HHHH::|OOOO|::|^^^^|::|OOOO|::|^^^^|", train.print());
        assertFalse(train.fill());
    }

}
