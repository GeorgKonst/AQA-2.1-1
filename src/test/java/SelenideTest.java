import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class SelenideTest {

    @Test
    void shouldValidResponse(){
        open("http://localhost:9999/");
        $("[name='name']").setValue("Георгий Левочкин");
        $("[name='phone']").setValue("+79101000000");
        $("[data-test-id='agreement']").click();
        $("[role='button']").click();
        $(".paragraph").shouldHave(Condition.exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
        sleep(5000);
    }
}
