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
    private Boisson boisson;

    private int nombreDoseSucre = 0;
    private double renduMonnaie = 0;
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
        // etatCourant.
    }

    public void insererPiece(double unePiece) {
        etatCourant.insererUnePiece(unePiece);
    }

    public void ejecterPiece() {
        etatCourant.ejecterPiece();
    }

    public void ajouterDoseSucre() {
        etatCourant.ajouterDoseSucre();
    }
    
    public void enleverDoseSucre() {
        etatCourant.enleverDoseSucre();
    }

    public void selectionnerBoisson(EnumBoisson enumBoisson) {
        boisson = boissonMap.get(enumBoisson);
        etatCourant.choisirBoisson();
    }

    public void ajouterIngredient(EnumIngredient enumIngredient) {
        ingredientMap.put(EnumIngredient.CANNELLE, new Cannelle(boisson));
        ingredientMap.put(EnumIngredient.CARAMEL, new Caramel(boisson));
        ingredientMap.put(EnumIngredient.CHANTILLY, new Chantilly(boisson));
        boisson = ingredientMap.get(enumIngredient);
        etatCourant.ajouterIngredient();
    }

    public void confirmerChoixBoisson() {
        if (boisson.cout() <= accompte) {
            etatCourant.confirmerChoixBoisson();
            renduMonnaie = accompte - boisson.cout();
        } else {
            System.out.println("Veuillez ajouter " + (boisson.cout() - accompte) + "€");
        }
    }

    public void delivrerChocolat() {
        etatCourant.delivrerChocolat();
    }

    public void rendrePiece() {
        etatCourant.rendrePiece();
    }

    public void prendreGobelet() {
        etatCourant.prendreGobelet();
    }

    public Boisson getBoisson() {
        return boisson;
    }

    public int getNombreDoseSucre() {
        return nombreDoseSucre;
    }
    
    public void setNombreDoseSucre(int unNombreDoseSucre) {
        nombreDoseSucre = unNombreDoseSucre;
    }

    public double getRenduMonnaie() {
        return renduMonnaie;
    }

    public double getAccompte() {
        return accompte;
    }

    public void setAccompte(double unAccompte) {
        accompte = unAccompte;
    }
}
