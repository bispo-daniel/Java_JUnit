package test;
import projectPack.Variable;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class TestVariable {
    static Variable variable = new Variable();

    int query = 0;

    @BeforeAll
    static void printBeforeAll(){
        System.out.println("Tests will start...\n");
    }
    
    @BeforeEach
    void resetURL(){
        String urlWithQuery = "https://www.google.com/search?q=%d";
        variable.mutableString = String.format(urlWithQuery, query);
    }

    @DisplayName("Test with empty String?")
    @RepeatedTest(4)
    void testMutableString(){
        String finalURL = String.format(variable.finalURL, query);
        Assertions.assertEquals(finalURL, variable.mutableString);
    }

    @AfterEach
    void printAfterEach(){
        System.out.println("Test executed...");
        System.out.println("Expected: " + String.format(variable.finalURL, query));
        System.out.println("Actual: " + variable.mutableString);
        System.out.println("\n");
    }

    @AfterAll
    static void printAfterAll(){
        System.out.println("All tests have been executed!");
    }
}