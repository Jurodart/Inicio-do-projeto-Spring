package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie
        (@JsonAlias("Title") String titulo,
         @JsonAlias("totalSeasons") Integer totalTemporadas,
         @JsonAlias("imdbRating") String avaliacao) {
} //O @JsonAlias permite ler o Json dando um apelido às strings/dados
//E o @JsonProperty permite ler e escrever os strings/dados da API()
