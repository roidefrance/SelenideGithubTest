package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class SelenideGithubTest {
    @BeforeAll
    static void setup(){
        Configuration.startMaximized = true;
    }
    @Test
    void PageTest() {
    open("https://github.com/selenide/selenide/wiki/SoftAssertions");
    $("html").shouldHave(text("assert"));
    }
}
