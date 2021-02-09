package tests;

import org.junit.jupiter.api.Test;
import settings.BaseTest;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SelenideGitHubTests extends BaseTest {

    @Test
    public void selenideWikiTest() {
        $("[name=q]").setValue("selenide").pressEnter();
        $$(".repo-list li").first().$("a").click();
        $("[data-content=Wiki]").click();
        $$("[data-filterable-for=wiki-pages-filter] li").findBy(text("SoftAssertions")).shouldBe(visible).click();
        $$("#wiki-body div>div").findBy(text("@ExtendWith")).scrollIntoView(true).shouldBe(visible);
    }
}
