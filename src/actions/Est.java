package actions;

import main.Lancer;
import moteur.*;


public class Est extends �Action{
	
	@Override
	public void fait(Player p, Objet o, Personnage pe) {
		p.setEndroit(p.endroit().Est);
		Lancer.aff.ActionDone(this, o);
	}

	@Override
	public boolean possible(Player p, Objet o, Personnage pe) {
		return (p.endroit().SortieEst);
	}
	
	public Est(){
		name=Lancer.langue.east();
	}

}
