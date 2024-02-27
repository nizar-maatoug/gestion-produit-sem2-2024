package org.isetbizerte.gestionproduits;

import org.isetbizerte.gestionproduits.entity.Produit;
import org.isetbizerte.gestionproduits.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestionProduitsApplication implements CommandLineRunner{

	@Autowired
	ProduitRepository produitRepository;

	public static void main(String[] args) {
		SpringApplication.run(GestionProduitsApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Produit produit=new Produit(null,"Clavier","Calvier azerty");
		produit=produitRepository.save(produit);

		produit=new Produit(null,"Souris","Souris sans fil");
		produit=produitRepository.save(produit);


	}
}
