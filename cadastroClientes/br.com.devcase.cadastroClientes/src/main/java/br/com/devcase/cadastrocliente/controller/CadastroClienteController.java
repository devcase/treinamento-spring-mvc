package br.com.devcase.cadastrocliente.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.devcase.cadastrocliente.dao.Dao;
import br.com.devcase.cadastrocliente.domain.Pessoa;

@Controller
public class CadastroClienteController {
	
	Dao dao = new Dao();
	
	@RequestMapping("/view{id}")
	public String view(@PathVariable long id, Model model ){
		Pessoa pessoa = dao.findById(id);
		model.addAttribute("pessoa", pessoa);
		return "/WEB-INF/jsp/view.jsp";
	}
	@RequestMapping("/list")
	public String list( Model model ){
		ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
		lista = dao.getList();
		model.addAttribute("listaPessoas", lista);
		return "/WEB-INF/jsp/list.jsp";
	}
	
	@RequestMapping("/cadastrar")
	public String cadastrar(){
		return "/WEB-INF/jsp/cadastrar.jsp";
	}
	
	@RequestMapping("/salvar")
	public String salvar(Pessoa pessoa){
		dao.save(pessoa);
		return "redirect:/sucesso.html";
	}
	@RequestMapping("/editar{id}")
	public String editar(@PathVariable long id, Pessoa pessoa){
		pessoa.setId(id);
		dao.update(pessoa);
		return "redirect:/inicio.html"; 	
	
	}
	
	
}
