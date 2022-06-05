package patternobserver.observer;

public class ObserverImpl2 implements Observer {

	int lasttemp=0;
	@Override
	public void update(int etat) {
	if (lasttemp>etat)
		 System.out.println("depression  ");
		 else
			 System.out.println("Surpression");
		lasttemp=etat;
		
	}

}
