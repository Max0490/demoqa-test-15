package com.demoqa;


import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FillFormPractice {

    @BeforeAll
    static void configuration() {
        Configuration.baseUrl = "https://demoqa.com";
    }
}
    @Test
    void
    open("/automation-practice-form");
    $()