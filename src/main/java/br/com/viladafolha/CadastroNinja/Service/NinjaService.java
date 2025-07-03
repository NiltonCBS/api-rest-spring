package br.com.viladafolha.CadastroNinja.Service;

import br.com.viladafolha.CadastroNinja.Entity.NinjaEntity;
import br.com.viladafolha.CadastroNinja.Repository.NinjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/*
IMPLEMENTAÇÃO DAS FUNÇÕES
 */
@Service
public class NinjaService {

    @Autowired
    private NinjaRepository ninjaRepository;

    //CADASTRAR
    public NinjaEntity cadastrar(NinjaEntity ninja) {
        // não sobrescreva o id aqui
        return ninjaRepository.save(ninja);
    }

    //LISTAR
    public List<NinjaEntity> listar(){
        return ninjaRepository.findAll();
    }

    //PESQUISAR
    public NinjaEntity Pesquisar(Long id) {
        Optional<NinjaEntity> ninjaId = ninjaRepository.findById(id);
        return ninjaId.orElse(null);
    }

    //Deletar
    public void Deletar(Long id) {
        ninjaRepository.deleteById(id);
    }

    //Alterar
    public NinjaEntity Altera(Long id, NinjaEntity ninjaAlterado) {
        if (ninjaRepository.existsById(id)) {
            ninjaAlterado.setId(id);
            return ninjaRepository.save(ninjaAlterado);
        } else {
            return null;
        }
    }
}

