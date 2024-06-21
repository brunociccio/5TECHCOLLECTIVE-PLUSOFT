package br.com.plusoft.fivetechcollective.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity(name = "TB_5TECH_CADASTRAR")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cadastrar {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome do usuário é obrigatório")
    private String nome;

    @NotBlank(message = "Cadastrar uma senha é obrigatório")
    private String senha;

    @NotBlank(message = "Cadastrar um email é obrigatório")
    private String email;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "documentos_id")
    private Documentos documentos;
}
