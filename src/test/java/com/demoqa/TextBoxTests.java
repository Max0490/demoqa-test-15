package com.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class TextBoxTests {


    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://demoqa.com";
    //    Configuration.browserSize = "100x100";

    }

    @Test
    void fillFormTest() {
        open("/text-box");
      //  $("[id=userName]").setValue("Maxim");
        $("#userName").setValue("Maxim");
        $("#userEmail").setValue("Maxim@maxim.ru");
        $("#currentAddress").setValue("Maximsk");
        $("#permanentAddress").setValue("Maximskaya oblast");
        $("#submit").click();

        $("#submit").click();
    }
}
