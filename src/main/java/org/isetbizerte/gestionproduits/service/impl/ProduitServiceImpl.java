package org.isetbizerte.gestionproduits.service.impl;

import lombok.AllArgsConstructor;
import org.isetbizerte.gestionproduits.entity.Produit;
import org.isetbizerte.gestionproduits.repository.ProduitRepository;
import org.isetbizerte.gestionproduits.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProduitServiceImpl implements ProduitService {



    private ProduitRepository produitRepository;
    public ProduitServiceImpl(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }
    @Override
    public List<Produit> getListeProduits() {
        List<Produit> produits=produitRepository.findAll();
        return produits;
    }

    @Override
    public Produit getById(Long id) {
        return produitRepository.findById(id).get();
    }

    @Override
    public Produit ajouterProduit(Produit produit) {
        Produit savedProduit=produitRepository.save(produit);
        return savedProduit;
    }

    @Override
    public Produit modifierProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public void supprimerProduit(Long id) {
        produitRepository.deleteById(id);
    }
}
