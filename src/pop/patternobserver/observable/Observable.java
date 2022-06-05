
package pop.patternobserver.observable;

import pop.patternobserver.observer.Observer;

public interface Observable {
	void subscribe(Observer o);
	void unsubscribe(Observer o);
	void notifyobserver();
	

}
