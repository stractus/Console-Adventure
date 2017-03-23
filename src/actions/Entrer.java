package actions;

import main.Lancer;
import moteur.Objet;
import moteur.Personnage;
import moteur.Player;

public class Entrer extends �Action{

	public void fait(Player p, Objet o, Personnage pe) {
		p.setEndroit(p.LieuActuel.EntreePiece);
		Lancer.aff.ActionDone(this, o);
	}

	@Override
	public boolean possible(Player p, Objet o, Personnage pe) {
		return (p.PieceActuelle==null && p.LieuActuel.entree==true);
	}

	public Entrer(){
		name=Lancer.langue.goIn();
	}
}
