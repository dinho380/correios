package br.com.correios.controller;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.correios.model.Estado;
import br.com.correios.repository.EstadoRepository;


@Controller
@RequestMapping("/estados")
public class EstadosController {
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	@RequestMapping
	public ModelAndView listaEstados () {
		List<Estado> estados = estadoRepository.findAll();
	    ModelAndView mv = new ModelAndView("ListaEstados");
	    mv.addObject("estados",estados);
	    return mv;
	}
	
}
