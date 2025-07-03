package br.com.viladafolha.CadastroNinja.Repository;

import br.com.viladafolha.CadastroNinja.Entity.NinjaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<NinjaEntity, Long>{
}
