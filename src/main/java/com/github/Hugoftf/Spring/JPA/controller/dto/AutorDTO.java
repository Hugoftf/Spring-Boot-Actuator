package com.github.Hugoftf.Spring.JPA.controller.dto;

import com.github.Hugoftf.Spring.JPA.model.Autor;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.util.UUID;

@Schema(name = "Autor")
public record AutorDTO(
                        UUID id,

                        @NotBlank(message = "Campo Obrigatório")
                        @Size(max = 100, min = 2, message = "campo fora do padrao")
                        @Schema(name = "nome")
                        String nome,

                        @NotNull(message = "Campo Obrigatório")
                        @Past(message = "Este campo nao pode receber uma data futura")
                        @Schema(name = "dataNascimento")
                        LocalDate dataNascimento,

                        @NotBlank(message = "Campo Obrigatório")
                        @Size(max = 50, min = 2, message = "campo fora do padrao")
                        @Schema(name = "nacionalidade")
                        String nacionalidade) {


    public Autor mapeandoParaAutor(){
        Autor autor =  new Autor();

        autor.setNome(this.nome);
        autor.setDataNascimento(this.dataNascimento);
        autor.setNacionalidade(this.nacionalidade);

        return autor;
    }

}
