package module9;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static java.math.BigDecimal.ZERO;

public class CurrencyExchangeImpl implements CurrencyExchange {


    // immutable
//    public static Map<String, BigDecimal> currencyRates = Map.of(
//            "USD", new BigDecimal("36.56"),
//            "EUR", new BigDecimal("35.5"),
//            "PLN", new BigDecimal("7.3149")
//    );

    public static Map<String, BigDecimal> currencyRates = new HashMap<>();

    private static void initMap() {
        currencyRates.put("USD", new BigDecimal("36.56"));
        currencyRates.put("EUR", new BigDecimal("35.5"));
        currencyRates.put("PLN", new BigDecimal("7.3149"));
    }

    public CurrencyExchangeImpl() {
        initMap();
    }

    @Override
    public double exchange(BigDecimal uahAmount, String currencyToConvert) {
        validateConvertingAmount(uahAmount, currencyToConvert);
        return uahAmount.doubleValue() / (currencyRates.get(currencyToConvert).doubleValue());
    }

    @Override
    public void addOrUpdateCurrencyRate(String currency, BigDecimal currencyRate) {
        validateCurrency(currencyRate, currency);
        currencyRates.put(currency, currencyRate);
    }

    @Override
    public boolean deleteCurrency(String currency) {
        return currencyRates.remove(currency) != null;
    }

    @Override
    public Set<String> getAllCurrencies() {
        return currencyRates.keySet();
    }

    @Override
    public void printRates() {
        System.out.println(currencyRates);
    }

    private void validateCurrency(BigDecimal amount, String currency) {
        if (amount != null && amount.signum() == -1) {
            throw new IllegalArgumentException("attempt to exchange invalid amount");
        }
        if (currency == null) {
            throw new IllegalArgumentException("attempt to deal with null currency");
        }
    }
    private void validateConvertingAmount(BigDecimal uahAmount, String currencyToConvert) {
        validateCurrency(uahAmount, currencyToConvert);
        if (!currencyRates.containsKey(currencyToConvert)) {
            throw new IllegalArgumentException("Currency " + currencyToConvert + " does not exist");
        }
    }
}
