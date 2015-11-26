package distributeur;

import ingredients.Cannelle;
import ingredients.Caramel;
import ingredients.Chantilly;
import ingredients.DecorateurIngredient;
import ingredients.EnumIngredient;

import java.util.HashMap;
import java.util.Map;

import boissons.Boisson;
import boissons.CafeLong;
import boissons.CafeLongGrains;
import boissons.Chocolat;
import boissons.EnumBoisson;
import boissons.Expresso;
import boissons.ExpressoGrains;
import etats.EnumEtat;
import etats.EtatAbstrait;
import etats.EtatGagnant;
import etats.EtatLivraison;
import etats.EtatMaintenance;
import etats.EtatPasDePiece;
import etats.EtatSelection;

public class Distributeur {

	private EtatAbstrait etatCourant;
	public Boisson boisson;

	private int nombreDoseSucre = 0;
	private double renduMonnaie;
	private double accompte = 0;
	
	private Map<EnumBoisson, Boisson> boissonMap = new HashMap<EnumBoisson, Boisson>();
	private Map<EnumIngredient, DecorateurIngredient> ingredientMap = new HashMap<EnumIngredient, DecorateurIngredient>();

	public Distributeur() {
		etatCourant = new EtatPasDePiece(this);
		
		boissonMap.put(EnumBoisson.CAFE_LONG, new CafeLong());
		boissonMap.put(EnumBoisson.CAFE_LONG_GRAINS, new CafeLongGrains());
		boissonMap.put(EnumBoisson.CHOCOLAT, new Chocolat());
		boissonMap.put(EnumBoisson.EXPRESSO, new Expresso());
		boissonMap.put(EnumBoisson.EXPRESSO_GRAINS, new ExpressoGrains());
		
	}

	public void changeEtat(EnumEtat unEtat) {
		switch (unEtat) {
		case MAINTENANCE:
			etatCourant = new EtatMaintenance(this);
			break;
		case PAS_DE_PIECE:
			etatCourant = new EtatPasDePiece(this);
			break;
		case SELECTION:
			etatCourant = new EtatSelection(this);
			break;
		case GAGNANT:
			etatCourant = new EtatGagnant(this);
			break;
		case LIVRAISON:
			etatCourant = new EtatLivraison(this);
			break;
		default:
			break;
		}
	}

	public void finDeMaintenance() {
//		 etatCourant.
	}

	public void insererPiece(double piece) {
		etatCourant.insererUnePiece();
		accompte += piece;
	}
	
	public void ejecterPiece() {
		etatCourant.ejecterPiece();
	}

	public void doserSucre(int leNombreDoseSucre) {
		etatCourant.doserSucre();
		nombreDoseSucre = leNombreDoseSucre;
	}

	public void selectionnerBoisson(EnumBoisson enumBoisson) {
		etatCourant.choisirBoisson();
		boisson = boissonMap.get(enumBoisson);
	}

	public void ajouterIngredient(EnumIngredient enumIngredient) {
		etatCourant.ajouterIngredient();
		ingredientMap.put(EnumIngredient.CANNELLE, new Cannelle(boisson));
		ingredientMap.put(EnumIngredient.CARAMEL, new Caramel(boisson));
		ingredientMap.put(EnumIngredient.CHANTILLY, new Chantilly(boisson));
		boisson = ingredientMap.get(enumIngredient);
	}
	
	public void confirmerBoisson() {
		if(boisson.cout() <= accompte) {
			etatCourant.confirmerBoisson();
			renduMonnaie = accompte - boisson.cout();
			System.out.println("À rendre: " + renduMonnaie + "€");
		} else {
			System.out.println("Veuillez ajouter " + (boisson.cout() - accompte) + "€");
		}
	}

//	public void delivrerBoisson() {
//		etatCourant.
//		int nombreAleatoire = 1 + (int)(Math.random() * ((10 - 1) + 1));
//		if(nombreAleatoire == 1) {
//			System.out.println("Félicitations ! Vous avez gagné un chocolat !");
//		}
//	}

	public void rendrePiece() {
		etatCourant.rendrePiece();
	}

	public void prendreGobelet() {
		etatCourant.prendreGobelet();
	}
	
	public double getAccompte() {
		return accompte;
	}
	
	public void setAccompte(double unAccompte) {
		accompte = unAccompte;
	}
}
