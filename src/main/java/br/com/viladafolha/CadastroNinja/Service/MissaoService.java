package br.com.viladafolha.CadastroNinja.Service;


import br.com.viladafolha.CadastroNinja.Entity.MissaoEntity;
import br.com.viladafolha.CadastroNinja.Repository.MissaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissaoService {

    @Autowired
    private MissaoRepository missaoRepository;

    public MissaoEntity cadastrar(MissaoEntity missao){
        return missaoRepository.save(missao);
    }

    public List<MissaoEntity> listar(){
        return missaoRepository.findAll();
    }

    public MissaoEntity pesquisar(Long id){
        Optional<MissaoEntity> missaoId = missaoRepository.findById(id);
        return missaoId.orElse(null);
    }

    public List<MissaoEntity> pesquisarPorNome(String nome){
        return missaoRepository.findByNome(nome);
    }

    public void deletar(Long id){
        missaoRepository.deleteById(id);
    }

    public MissaoEntity Alterar(Long id, MissaoEntity missaoAlterado){
        if (missaoRepository.existsById(id)){
            missaoAlterado.setId(id);
            return missaoRepository.save(missaoAlterado);
        }else {
            return null;
        }
    }
}
