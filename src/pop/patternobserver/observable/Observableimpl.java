package pop.patternobserver.observable;

import java.util.ArrayList;
import java.util.List;

import pop.patternobserver.observer.Observer;

public class Observableimpl implements Observable {

	private int temp;
	private List<Observer> observers = new ArrayList<Observer>();

	@Override
	public void subscribe(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void unsubscribe(Observer o) {
		observers.remove(o);

	}

	@Override
	public void notifyobserver() {
				for (Observer o : observers) {

			o.update(this);
		}
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
		notifyobserver();
	}

}
