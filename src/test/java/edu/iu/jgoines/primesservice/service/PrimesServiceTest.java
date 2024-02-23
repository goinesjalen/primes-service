package edu.iu.jgoines.primesservice.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimesServiceTest {
    PrimesService primesService = new PrimesService();
    @Test
    void _45isNotPrime() {
        int n = 45;
        boolean expected = false;
        boolean actual = primesService.isPrime(n);
        assertEquals(expected, actual);
    }
    @Test
    void _23isPrime() {
        int n = 23;
        boolean expected = true;
        boolean actual = primesService.isPrime(n);
        assertEquals(expected, actual);
    }
    @Test
    void _20isNotPrime() {
        int n = 20;
        boolean expected = false;
        boolean actual = primesService.isPrime(n);
        assertEquals(expected, actual);
    }
}