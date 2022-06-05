package pop.patternobserver.observer;

import pop.patternobserver.observable.*;

public interface Observer {
	void update(Observable o);// en cas de push c'est l'etat est parametre
}
