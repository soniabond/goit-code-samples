package module9;

import java.math.BigDecimal;

public class CurrencyExchangeTest {

    public static void main(String[] args) {
        CurrencyExchange currencyExchange = new CurrencyExchangeImpl();
        currencyExchange.printRates();
        System.out.println("currencyExchange.getAllCurrencies() = " + currencyExchange.getAllCurrencies());

        System.out.println("currencyExchange.exchange(new BigDecimal(\"3697.45\"), \"USD\") = " + currencyExchange.exchange(new BigDecimal("3697.45"), "USD"));
        currencyExchange.addOrUpdateCurrencyRate("CAD", new BigDecimal("26.5"));
        currencyExchange.printRates();
        currencyExchange.addOrUpdateCurrencyRate("PLN", new BigDecimal("7.31"));
        currencyExchange.printRates();
        System.out.println("currencyExchange.deleteCurrency(\"CAD\") = " + currencyExchange.deleteCurrency("CAD"));
        System.out.println("currencyExchange.deleteCurrency(\"CAD\") = " + currencyExchange.deleteCurrency("CAD"));
        currencyExchange.printRates();
    }
}
