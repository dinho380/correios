
package br.com.correios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.correios.dto.FaixaCepDTO;
import br.com.correios.dto.FaixaCepCidadeDTO;
import br.com.correios.repository.EstadoRepository;

import br.com.correios.model.Estado;

@Controller
@RequestMapping("/buscaFaixaCep")
public class BuscaFaixaCepController {
		
	@Autowired
	private EstadoRepository estadoRepository;
	
	
	@ModelAttribute (name = "estados")
		public List<Estado> estados() {
		return estadoRepository.findAll();
	}
	
	
	@GetMapping
	public String buscaFaixaCep() {
		return "BuscaFaixaCep";
	}

	@GetMapping(value="/resultadoBusca")
	public ModelAndView resultadoBuscaFaixaCep(@RequestParam("uF") Long uF,@RequestParam("localidade") String localidade,RedirectAttributes attributes) {
	      List<FaixaCepDTO> faixasCep = estadoRepository.buscaPorUF(uF); 
	      List<FaixaCepCidadeDTO> faixasCepCidade = estadoRepository.buscaPorUFeLocalidade(uF,localidade); 
      
	      
     
    
      if(uF.equals(null)) {
    		ModelAndView mv = new ModelAndView("redirect:/buscaFaixaCep");
    		attributes.addFlashAttribute("mensagem", "O CAMPO UF É OBRIGATORIO");
    		return mv;
    	}
      

      ModelAndView mv = new ModelAndView("ResultadoBuscaFaixaCep");
	  mv.addObject("faixasCep", faixasCep);
	  mv.addObject("faixasCepCidade", faixasCepCidade);
	  
	  if(faixasCep.isEmpty()) {
		  mv.addObject("mensagem", "A BUSCA NÂO RETORNOU DADOS!");
	  }else {
	      mv.addObject("mensagem", "DADOS ENCONTRADOS COM SUCESSO");
	      }
	  
	  return mv;
	}
}
