package module13.currencyBot;

import java.util.List;

public interface CurrencyRateApiService {
    List<RateResponseDto> getRates();
}
