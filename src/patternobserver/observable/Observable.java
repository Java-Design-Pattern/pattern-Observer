
package patternobserver.observable;

import patternobserver.observer.Observer;

public interface Observable {
	void subscribe(Observer o);
	void unsubscribe(Observer o);
	void notifyobserver();
	

}
