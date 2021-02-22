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
    open("https://github.com/selenide/selenide");
    $$("ul.UnderlineNav-body.list-style-none li").get(4).$("a").click();
    $(".wiki-rightbar").shouldHave(text("SoftAssertions"));
    $(byLinkText("SoftAssertions")).click();
    // альтернатива $$("ul.m-0.p-0.list-style-none li").get(14).$("a").click();
    $(".markdown-body").shouldHave(text("JUnit5"));
    sleep(1000);
    }
}
