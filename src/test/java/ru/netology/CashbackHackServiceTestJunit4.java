package ru.netology;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTestJunit4 {

    @Test
    public void shouldCalculateCashBackRemainMoreThan1000JUnit4() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 2643;
        int expected = 357;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);


    }


    @Test
    public void shouldCalculateCashBackRemainJunit4() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 965;
        int expected = 35;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);


    }


    @Test
    public void shouldCalculateCashBackRemainJUnit4() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);

    }


}