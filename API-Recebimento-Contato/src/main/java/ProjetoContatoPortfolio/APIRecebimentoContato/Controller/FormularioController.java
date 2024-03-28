package ProjetoContatoPortfolio.APIRecebimentoContato.Controller;

import ProjetoContatoPortfolio.APIRecebimentoContato.model.Formulario;
import ProjetoContatoPortfolio.APIRecebimentoContato.repository.FormularioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("formularios")
public class FormularioController {
    @Autowired
    FormularioRepository formularioRepository;

    @PostMapping
    public void cadastroFormulario (@RequestBody Formulario formulario)
    {
        formularioRepository.save(formulario);
    }
    @GetMapping
    public List<Formulario> visualizarFormularios(){
        return formularioRepository.findAll();
    }

}
