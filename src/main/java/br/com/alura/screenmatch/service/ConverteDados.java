package br.com.alura.screenmatch.service;

import br.com.alura.screenmatch.model.DadosSerie;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverteDados implements IConverteDados{
    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T obterDados(String json, Class<T> classe) {
        //Esse <T> é um método genérico,
        // que deixa colocar qualquer valor sem definir
        // se é String, int ou double

        //Exemplo de generics:
        // public static void main(String[] args) {
        //        Caixa<String> caixaDeTexto = new Caixa();
        //        caixaDeTexto.setConteudo("Guardando texto na minha caixa!");
        //
        //        Caixa<Integer> caixaDeIdade = new Caixa();
        //        caixaDeIdade.setConteudo(30);
        //
        //        Caixa<Double> caixaDeValor = new Caixa<>();
        //        caixaDeValor.setConteudo(150.50);
        //    }
        try {
            return mapper.readValue(json, classe);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
