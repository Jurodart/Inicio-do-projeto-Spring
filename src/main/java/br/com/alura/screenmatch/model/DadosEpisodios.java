package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosEpisodios (@JsonAlias("Title") String titulo,
                              @JsonAlias("Episode") Integer numero,
                              @JsonAlias("imdbRating") String avaliacao,
                              @JsonAlias("Released") String dataLancamento) {
}
//O @JsonAlias permite ler o Json dando um apelido às strings/dados
//E o @JsonProperty permite ler e escrever os strings/dados da API()
