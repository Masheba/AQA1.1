package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTestNG {

    @Test
    public void shouldCalculateCashBackRemain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 965;
        int expected = 35;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);


    }

    @Test
    public void shouldCalculateCashBackRemainMoreThan1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 2343;
        int expected = 657;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);


    }


    @Test
    public void shouldCalculateCashBackRemainRoundNumber() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);


    }

}