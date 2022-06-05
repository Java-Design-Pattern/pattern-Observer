package pop.patternobserver.observer;

import pop.patternobserver.observable.Observable;
import pop.patternobserver.observable.Observableimpl;

public class ObserverImpl2 implements Observer {

	int lasttemp=0;
	@Override
	public void update(Observable o) {
	if (lasttemp>((Observableimpl)o).getTemp())
		 System.out.println("depression  ");
		 else
			 System.out.println("Surpression");
		lasttemp=((Observableimpl)o).getTemp();;
		
	}

}
