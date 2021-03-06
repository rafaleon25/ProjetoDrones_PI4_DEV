/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drone.ProjetoDrone.Controllers;


import java.util.Set;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.drone.ProjetoDrone.Classes.Produto.Produto;
import java.util.List;
/**
 *
 * @author Rafael Rodrigues
 */
@Controller
@RequestMapping("/home")
public class RedirecionamentosController {

    @GetMapping("/paginaInicial")
    public ModelAndView home(HttpSession session) {
        return new ModelAndView("Home");
    }
    
    @GetMapping("/homeNova")
    public ModelAndView homeNova(HttpSession sessao) {
        List<Produto> prodsComprados = (List<Produto>) sessao.getAttribute("prodsComp");
        prodsComprados = null;
        sessao.setAttribute("prodsComp", prodsComprados);
        return new ModelAndView("Home");
    }
    
    @GetMapping("/desc")
    public ModelAndView desc() {
        return new ModelAndView("DescProd");
    }
    

    @GetMapping("/carrinho")
    public ModelAndView carrinho() {
        return new ModelAndView("Cart");
    }
    
    @GetMapping("/contato")
    public ModelAndView contato(){
        return new ModelAndView("Contato");
    }
    
    @GetMapping("/ajuda")
    public ModelAndView ajuda(){
        return new ModelAndView("Ajuda");
    }
    
    @GetMapping("/acompanharPedido")
    public ModelAndView acompPedido(){
        return new ModelAndView("AcomPedido");
    }
}
