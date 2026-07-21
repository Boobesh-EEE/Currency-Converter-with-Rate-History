import java.util.HashMap;

public class CurrencyService {

    private HashMap<String, Currency> currencies;

    public CurrencyService() {
        currencies = new HashMap<>();
        loadRates();
    }

    private void loadRates() {
        currencies.put("USD", new Currency("USD", "US Dollar", 83.0));
        currencies.put("EUR", new Currency("EUR", "Euro", 92.5));
        currencies.put("GBP", new Currency("GBP", "British Pound", 108.0));
        currencies.put("JPY", new Currency("JPY", "Japanese Yen", 0.57));
        currencies.put("AED", new Currency("AED", "UAE Dirham", 22.6));
        currencies.put("SGD", new Currency("SGD", "Singapore Dollar", 64.5));
    }

    public void displayCurrencies() {
        System.out.println("\nAvailable Currencies:");

        for (Currency currency : currencies.values()) {
            System.out.println(
                    currency.getCode() + " - " +
                    currency.getName() +
                    " (Rate: " + currency.getRate() + ")");
        }
    }
}