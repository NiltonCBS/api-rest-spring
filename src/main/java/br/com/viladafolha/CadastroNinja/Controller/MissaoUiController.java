package br.com.viladafolha.CadastroNinja.Controller;

import br.com.viladafolha.CadastroNinja.Entity.MissaoEntity;
import br.com.viladafolha.CadastroNinja.Service.MissaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/ui/missao")
public class MissaoUiController {

    @Autowired
    private MissaoService missaoService;

    @GetMapping("/index")
    public String home(){
        return "index";
    }

    @GetMapping("/listarmissao")
    public String listarMissao(Model model){
        List<MissaoEntity> missoes = missaoService.listar();
        model.addAttribute("missao", missoes);
        return "missao";
    }

    @GetMapping("/cadastrar")
    public String mostrarFormulario(Model model){
        model.addAttribute("missao", new MissaoEntity());
        return "cadastrarmissao";
    }

    @PostMapping("/salvar")
    public String salvarMissao(@ModelAttribute MissaoEntity missao){
        missaoService.cadastrar(missao);
        return "redirect:/ui/missao/listarmissao";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEdicao(@PathVariable Long id, Model model){
        MissaoEntity missao = missaoService.pesquisar(id);
        model.addAttribute("missao", missao);
        return "detalhesmissao";
    }

    @PostMapping("/atualizar")
    public String atualizarMissao(@ModelAttribute MissaoEntity missao){
        missaoService.Alterar(missao.getId(), missao);
        return "redirect:/ui/missao/listarmissao";
    }

    @GetMapping("/excluir/{id}")
    public String excluirMissao(@PathVariable Long id){
        missaoService.deletar(id);
        return "redirect:/ui/missao/listarmissao";
    }
}
