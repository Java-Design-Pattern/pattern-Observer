package patternobserver.observer;

public class ObserverImpl implements Observer {

	int lasttemp=0;
	@Override
	public void update(int etat) {
		lasttemp +=etat;
		System.out.println("le total temperature recu est "+lasttemp);
		
	}

}
