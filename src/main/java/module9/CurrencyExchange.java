package module9;

import java.math.BigDecimal;
import java.util.Set;

public interface CurrencyExchange {

    double exchange(BigDecimal uahAmount, String currencyToConvert);

    void addOrUpdateCurrencyRate(String currency, BigDecimal currencyRate);

    boolean deleteCurrency(String currency);

    Set<String> getAllCurrencies();

    void printRates();
}
