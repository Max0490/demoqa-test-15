package com.demoqa;

import static com.codeborne.selenide.Selenide.$;

public class CssXpathExample {
    $("[data-testid=email]").setValue("a@a.com")
    $(by("data-testid", "email").setValue("a@a.com")
}
