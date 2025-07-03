package br.com.viladafolha.CadastroNinja.Controller;


import br.com.viladafolha.CadastroNinja.Entity.NinjaEntity;
import br.com.viladafolha.CadastroNinja.Service.NinjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ninja")
public class NinjaController {

    @Autowired
    private NinjaService ninjaService;

    @GetMapping("/boasvindas")
    public String ninjaBoasVindas(){
        return "Olá você acessou o sistema de cadastro de ninjas.";
    }

    //Cadastrar
    @PostMapping("/cadastrar")
    public ResponseEntity<NinjaEntity> cadastrar(@RequestBody NinjaEntity ninja) {
        NinjaEntity salvo = ninjaService.cadastrar(ninja);
        return ResponseEntity.ok(salvo);
    }
    //listar
    @GetMapping("/listar")
    public List<NinjaEntity> listar(){
        return ninjaService.listar();
    }

    //Pesquisar por ID
    @GetMapping("/pesquisar/{id}")
    public NinjaEntity pesquisar(@PathVariable Long id){
        return ninjaService.Pesquisar(id);
    }

    //alterar
    @PutMapping("/alterar/{id}")
    public NinjaEntity alterar(@PathVariable Long id, @RequestBody NinjaEntity ninja){
        return ninjaService.Altera(id, ninja);
    }

    //excluir
    @DeleteMapping("/deletar/{id}")
    public void deletar(@PathVariable Long id){
        ninjaService.Deletar(id);
    }

}
