package org.hillcrest.chapter6.password;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CriteriaCheckerTest {
    /**
     * Tests for password Strength
     */
    @Test
    public void test_weakPasswordShouldBeSet() {
        Assertions.assertEquals(1, org.hillcrest.chapter6.password.CriteriaChecker.evaluateCriteria("12345"));
        Assertions.assertEquals("Weak", org.hillcrest.chapter6.password.CriteriaChecker.determineStrength(1));
    }
    /**
     * Tests for password Strength
     */
    @Test
    public void test_weakPasswordShouldBeSet2() {
        Assertions.assertEquals(0, org.hillcrest.chapter6.password.CriteriaChecker.evaluateCriteria(""));
        Assertions.assertEquals("Weak", org.hillcrest.chapter6.password.CriteriaChecker.determineStrength(0));
    }
    /**
     * Tests for password Strength
     */
    @Test
    public void test_weakPasswordShouldBeSet3() {
        Assertions.assertEquals(2, org.hillcrest.chapter6.password.CriteriaChecker.evaluateCriteria("a2345"));
        Assertions.assertEquals("Weak", org.hillcrest.chapter6.password.CriteriaChecker.determineStrength(2));
    }

    /**
     * Tests for password Strength
     */
    @Test
    public void test_modPasswordShouldBeSet() {
        Assertions.assertEquals(3, org.hillcrest.chapter6.password.CriteriaChecker.evaluateCriteria("aA12345"));
        Assertions.assertEquals("Moderate", org.hillcrest.chapter6.password.CriteriaChecker.determineStrength(3));
    }
    /**
     * Tests for password Strength
     */
    @Test
    public void test_strongPasswordShouldBeSet() {
        Assertions.assertEquals(4, org.hillcrest.chapter6.password.CriteriaChecker.evaluateCriteria("12345aaA"));
        Assertions.assertEquals("Strong", org.hillcrest.chapter6.password.CriteriaChecker.determineStrength(4));
    }

    @Test
    public void test_strongPasswordShouldBeSet1() {
        Assertions.assertEquals(5, org.hillcrest.chapter6.password.CriteriaChecker.evaluateCriteria("12345a%A"));
        Assertions.assertEquals("Strong", org.hillcrest.chapter6.password.CriteriaChecker.determineStrength(5));
    }
}
