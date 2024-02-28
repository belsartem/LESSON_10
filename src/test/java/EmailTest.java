import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

@DisplayName("Тесты на email рассылку")
public class EmailTest {

    @Test
    @DisplayName("Email должен быть отправлен новому юзеру")
    void emailShouldBeSentForNewUser() {
        System.out.println("Hello World!");
    }

    @Test
    @Tag("SMOKE")
    @DisplayName("Email должен быть отправлен забаненому юзеру")
    void emailShouldBeSentForBannedUser() {
        System.out.println("Hello^ World!");
    }

    @Test
    @Tags({
            @Tag("SMOKE"),
            @Tag("WEB"),
    })
    @DisplayName("Email должен быть отправлен в случае изменения PaymentMethod")
    void emailShouldBeSentAfterChangePaymentMethod() {
        throw new AssertionError("Падаем!");
    }
}