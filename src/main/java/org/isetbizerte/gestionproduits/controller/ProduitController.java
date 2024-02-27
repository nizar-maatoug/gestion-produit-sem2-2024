package org.isetbizerte.gestionproduits.controller;

import org.isetbizerte.gestionproduits.entity.Produit;
import org.isetbizerte.gestionproduits.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProduitController {


    private ProduitService produitService;

    public ProduitController(ProduitService produitService) {
        this.produitService = produitService;
    }

    @GetMapping("produits")
    public String listeProduits(Model model){
        List<Produit> produits=produitService.getListeProduits();

        model.addAttribute("produits",produits);

        return "produits";
    }

    @GetMapping("produits/{id}")
    public String detailProduit(Model model, @PathVariable("id") Long id){
        Produit produit= produitService.getById(id);

        model.addAttribute("produit",produit);

        return "detail-produit";
    }

    @GetMapping("add-produit")
    public String addProduit(Model model){
        model.addAttribute("produit",new Produit());

        return "add-produit";
    }
    @GetMapping("update-produit")
    public String updateProduit(Model model,@RequestParam("id") Long id){
        model.addAttribute("produit",produitService.getById(id));

        return "update-produit";
    }

    @PostMapping("save-produit")
    public String saveProduit(@ModelAttribute("produit") Produit produit){

        produit=produitService.ajouterProduit(produit);

        return "redirect:produits";

    }

    @GetMapping("delete-produit/{id}")
    public String deleteEvent(@PathVariable("id") Long id){
        produitService.supprimerProduit(id);
        return "redirect:/produits";
    }




}
