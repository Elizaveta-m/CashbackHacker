package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRemain1000ifPurchase0() {
       assertEquals(service.remain(0), 1000);
    }

    @Test
    public void shouldRemain200ifPurchase800() {
        assertEquals(service.remain(200), 800);
    }

    @Test
    public void shouldRemain0ifPurchase1000() {
        assertEquals(service.remain(1000), 0);
    }

    @Test
    public void shouldRemain0ifPurchase1200() {
        assertEquals(service.remain(1200), 0);
    }
}