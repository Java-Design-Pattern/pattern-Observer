package pop.patternobserver.observer;

import pop.patternobserver.observable.Observable;
import pop.patternobserver.observable.Observableimpl;

public class ObserverImpl implements Observer {
	int lasttemp=0;
	@Override
	public void update(Observable o) {
		int temp = ((Observableimpl)o).getTemp();
		lasttemp +=temp;
				 System.out.println("le total temperature recu est "+lasttemp);
			
	}

	/*
	 * @Override public void update(int etat) { lasttemp +=etat;
	 * System.out.println("le total temperature recu est "+lasttemp);
	 * 
	 * }
	 */
	

}
