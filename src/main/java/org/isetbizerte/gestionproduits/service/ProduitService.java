package org.isetbizerte.gestionproduits.service;



import org.isetbizerte.gestionproduits.entity.Produit;

import java.util.List;


public interface ProduitService {

    public List<Produit> getListeProduits();

    public Produit getById(Long id);


    public Produit ajouterProduit(Produit produit);

    public Produit modifierProduit(Produit produit);

    public void supprimerProduit(Long id);
}
