package br.com.viladafolha.CadastroNinja.Controller;

import br.com.viladafolha.CadastroNinja.Entity.MissaoEntity;
import br.com.viladafolha.CadastroNinja.Service.MissaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/missao")
public class MissaoController {

    @Autowired
    private MissaoService missaoService;

    @PostMapping("/cadastrar")
    public ResponseEntity<MissaoEntity> cadastrar(@RequestBody MissaoEntity missao){
        MissaoEntity salvo = missaoService.cadastrar(missao);
        return ResponseEntity.ok(salvo);
    }

    @GetMapping("/listar")
    public List<MissaoEntity> listar(){
        return missaoService.listar();
    }

    @GetMapping("/pesquisar")
    public List<MissaoEntity> listarpornome(@RequestParam String nome){ return missaoService.pesquisarPorNome(nome);}

    @GetMapping("/pesquisar/{id}")
    public MissaoEntity pesquisar(@PathVariable Long id){
        return missaoService.pesquisar(id);
    }

    @PutMapping("/alterar/{id}")
    public MissaoEntity alterar(@PathVariable Long id, @RequestBody MissaoEntity missao){
        return missaoService.Alterar(id, missao);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletar(@PathVariable Long id){
        missaoService.deletar(id);
    }
}
