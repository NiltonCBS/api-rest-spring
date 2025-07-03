package br.com.viladafolha.CadastroNinja.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "missao")
public class MissaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_missao")
    private Long id;

    @Column(name = "nome_missao")
    private String nome;

    @Column(name = "classificacao_missao")
    private Character classificacao;

    @Column(name = "status_missao")
    private Boolean status;
}
