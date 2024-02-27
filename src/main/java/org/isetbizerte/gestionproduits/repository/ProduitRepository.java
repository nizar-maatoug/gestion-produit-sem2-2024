package org.isetbizerte.gestionproduits.repository;

import org.isetbizerte.gestionproduits.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProduitRepository extends JpaRepository<Produit,Long> {

    //public List<Produit> findProduitsByDesignation(String designation) ;
}
