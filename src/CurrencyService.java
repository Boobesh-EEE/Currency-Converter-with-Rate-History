import java.util.HashMap;

public class CurrencyService {

    private HashMap<String, Currency> currencies;

    public CurrencyService() {
        currencies = new HashMap<>();
        loadRates();
    }

    // Load predefined exchange rates
    private void loadRates() {

        currencies.put("USD", new Currency("USD", "US Dollar", 83.0));
        currencies.put("EUR", new Currency("EUR", "Euro", 92.5));
        currencies.put("GBP", new Currency("GBP", "British Pound", 108.0));
        currencies.put("JPY", new Currency("JPY", "Japanese Yen", 0.57));
        currencies.put("AED", new Currency("AED", "UAE Dirham", 22.6));
        currencies.put("SGD", new Currency("SGD", "Singapore Dollar", 64.5));
        currencies.put("INR", new Currency("INR", "Indian Rupee", 1.0));
    }

    // Display all available currencies
    public void displayCurrencies() {

        System.out.println("\nAvailable Currencies:");
        System.out.println("----------------------");

        for (Currency currency : currencies.values()) {
            System.out.println(
                    currency.getCode() + " - "
                            + currency.getName()
                            + " (Rate: " + currency.getRate() + ")");
        }
    }

    // Convert one currency to another
    public void convertCurrency(String from, String to, double amount) {

        from = from.toUpperCase();
        to = to.toUpperCase();

        if (!currencies.containsKey(from) || !currencies.containsKey(to)) {
            System.out.println("\nInvalid Currency Code!");
            return;
        }

        double fromRate = currencies.get(from).getRate();
        double toRate = currencies.get(to).getRate();

        // Convert through INR as the base currency
        double amountInINR = amount * fromRate;
        double convertedAmount = amountInINR / toRate;

        System.out.println("\nConversion Result");
        System.out.println("----------------------");
        System.out.printf("%.2f %s = %.2f %s%n",
                amount, from, convertedAmount, to);
    }

}