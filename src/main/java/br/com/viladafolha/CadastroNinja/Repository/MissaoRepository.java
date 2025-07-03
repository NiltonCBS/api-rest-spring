package br.com.viladafolha.CadastroNinja.Repository;

import br.com.viladafolha.CadastroNinja.Entity.MissaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MissaoRepository extends JpaRepository<MissaoEntity, Long> {
    List<MissaoEntity> findByNome(String nome);
}
