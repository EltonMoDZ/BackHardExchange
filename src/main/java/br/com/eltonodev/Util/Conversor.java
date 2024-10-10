package br.com.eltonodev.Util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.math.BigDecimal;

public class Conversor {
    private final Gson gson = new GsonBuilder().create();
    private BigDecimal moedaReferenciaCotacao;
    private BigDecimal moedaAlvoCotacao;
    private String moedaReferencia;
    private String moedaAlvo;

    public BigDecimal getMoedaReferenciaCotacao() {
        return moedaReferenciaCotacao;
    }

    public BigDecimal getMoedaAlvoCotacao() {
        return moedaAlvoCotacao;
    }

    public Conversor(String moedaReferencia, String moedaAlvo) {
        this.moedaReferencia = moedaReferencia;
        this.moedaAlvo = moedaAlvo;

        // Supondo que ApiRequestValues é uma classe que faz a requisição e retorna um JSON.
        ApiRequestValues request = new ApiRequestValues(moedaReferencia);
        Moedas moedas = gson.fromJson(request.json, Moedas.class);

        // Obter as cotações das moedas
        moedaReferenciaCotacao = moedas.getConversionRates().get(moedaReferencia);
        moedaAlvoCotacao = moedas.getConversionRates().get(moedaAlvo);

        // Verificar se as cotações foram encontradas
        if (moedaReferenciaCotacao == null || moedaAlvoCotacao == null) {
            throw new IllegalArgumentException("Uma das moedas não foi encontrada.");
        }
    }

    public void getCotacao() {
        System.out.println("A cotação atual da moeda " + moedaReferencia + " para " + moedaAlvo + " é de " + moedaAlvoCotacao);
    }

    public void valorConvertido(BigDecimal valor) {
        System.out.println("O valor convertido é de " + valor.multiply(moedaAlvoCotacao));
    }
}
