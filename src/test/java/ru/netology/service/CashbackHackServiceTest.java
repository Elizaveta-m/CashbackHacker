package ru.netology.service;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRemain1000ifPurchase0() {
        assertEquals(1000, service.remain(0));
    }

    @Test
    public void shouldRemain200ifPurchase800() {
        assertEquals(200, service.remain(800));
    }

    @Test
    public void shouldRemain0ifPurchase1000() {
        assertEquals(0, service.remain(1000));
    }

    @Test
    public void shouldRemain0ifPurchase1200() {
        assertEquals(0, service.remain(1200));
    }
}