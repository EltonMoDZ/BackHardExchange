package br.com.eltonodev.Util;

import java.math.BigDecimal;
import java.util.Map;

public class Moedas {
    private Map<String, BigDecimal> conversion_rates;

    public Map<String, BigDecimal> getConversionRates() {
        return conversion_rates;
    }

    public void setConversionRates(Map<String, BigDecimal> conversion_rates) {
        this.conversion_rates = conversion_rates;
    }
}
