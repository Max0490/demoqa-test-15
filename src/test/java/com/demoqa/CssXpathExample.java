package com.demoqa;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CssXpathExample {
    $("[data-testid=email]").setValue("a@a.com")
    $(by("data-testid", "email").setValue("a@a.com")
}
