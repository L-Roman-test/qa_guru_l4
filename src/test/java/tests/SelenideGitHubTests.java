package tests;

import org.junit.jupiter.api.Test;
import settings.BaseTest;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideGitHubTests extends BaseTest {

    @Test
    public void selenideWikiTest() {
        $("[name=q]").setValue("selenide").pressEnter();
        $$(".repo-list li").first().$("a").click();
        $("[data-content=Wiki]").click();
        $$("[data-filterable-for=wiki-pages-filter] li").findBy(text("SoftAssertions")).should(exist).click();
        $$("#wiki-body div>div").findBy(text("@ExtendWith")).scrollIntoView(true).should(exist);
    }
}
