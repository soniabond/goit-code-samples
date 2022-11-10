package module13.currencyBot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.List;

public class CurrencyRateBot extends TelegramLongPollingBot {

    CurrencyRateApiService rateService = new PrivatBankCurrencyRateService();
    PrettyResponseConverter converter = new PrettyResponseConverter();

    @Override
    public String getBotUsername() {
        return Constants.BOT_NAME;
    }

    @Override
    public String getBotToken() {
        return Constants.BOT_TOKEN;
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            List<RateResponseDto> rates = rateService.getRates();

            SendMessage message = new SendMessage(); // Create a SendMessage object with mandatory fields
            message.setChatId(update.getMessage().getChatId().toString());
            message.setText(
                    converter.prepareResponse(
                            update.getMessage().getText(),
                            rateService.getRates()
                    )
            );

            try {
                execute(message); // Call method to send the message
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }
}
