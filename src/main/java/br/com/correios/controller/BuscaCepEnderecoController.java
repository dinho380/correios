package br.com.correios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import br.com.correios.dto.LogradouroDTO;
import br.com.correios.repository.LogradouroRepository;

@Controller
@RequestMapping("/buscaCepEndereco")
public class BuscaCepEnderecoController {
	
	@Autowired
	private LogradouroRepository logradouroRepository;

	@GetMapping
	public String buscaCepEndereco() {
		return "BuscaCepEndereco";
	}

	@GetMapping(value="/resultadoBusca")
	public ModelAndView resultadoBuscaCepEndereco(@RequestParam ("parametro") String parametro, RedirectAttributes attributes) {
		List<LogradouroDTO> logradouros = logradouroRepository.buscaPorNomeLogradouroOuCep(parametro);
		
		if(parametro.equals("")) {
			ModelAndView mv = new ModelAndView("redirect:/buscaCepEndereco");
			attributes.addFlashAttribute("mensagem", " O CAMPO DE BUSCA É OBRIGATORIO");
			return mv;
		}
		
		ModelAndView mv = new ModelAndView("ResultadoBuscaCepEndereco");
		mv.addObject("logradouros", logradouros);
		
		if(logradouros.isEmpty()) {
			mv.addObject("mensagem","A busca não retornou dados!");
		}else {
			mv.addObject("mensagem","Dados encontrados com sucesso!");			
		}
		
		return mv;
		
	}	
}
