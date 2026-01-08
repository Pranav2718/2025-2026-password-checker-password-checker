package org.hillcrest.chapter6.password;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FeedbackGeneratorTest {
    @Test
    public void test_noFeedbackShouldBeSent() {
        Assertions.assertEquals("", FeedbackGenerator.generateFeedback("12345a%A"));
    }
    @Test
    public void test_allFeedbackShouldBeSent() {
        Assertions.assertEquals("\nIncrease length to at least 8 characters"+"\nAdd at least one lowercase letter."+"\nAdd at least one uppercase letter."+
                "\nAdd at least one number"+"\nAdd at least one special character.",  FeedbackGenerator.generateFeedback(" "));
    }
    @Test
    public void test_someFeedbackShouldBeSent1() {
        Assertions.assertEquals("\nIncrease length to at least 8 characters", FeedbackGenerator.generateFeedback("aA!2"));
    }
    @Test
    public void test_someFeedbackShouldBeSent2() {
        Assertions.assertEquals("\nAdd at least one lowercase letter.",  FeedbackGenerator.generateFeedback("123123123A!2"));
    }
    @Test
    public void test_someFeedbackShouldBeSent3() {
        Assertions.assertEquals("\nAdd at least one uppercase letter.",  FeedbackGenerator.generateFeedback("123123123a!2"));
    }
    @Test
    public void test_someFeedbackShouldBeSent4() {
        Assertions.assertEquals("\nAdd at least one special character.",  FeedbackGenerator.generateFeedback("123123123Aa2"));
    }
    @Test
    public void test_someFeedbackShouldBeSent5() {
        Assertions.assertEquals("\nAdd at least one number",  FeedbackGenerator.generateFeedback("!!!!!!!!!!!!Aa"));
    }
}
