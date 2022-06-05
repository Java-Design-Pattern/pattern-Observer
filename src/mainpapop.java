
import pop.patternobserver.observable.Observable;
import pop.patternobserver.observable.Observableimpl;
import pop.patternobserver.observable.Observableimpl.*;
import pop.patternobserver.observer.Observer;
import pop.patternobserver.observer.Observer.*;
import pop.patternobserver.observer.ObserverImpl;
import pop.patternobserver.observer.ObserverImpl2;


public class mainpapop {
public static void main(String[] arg)
{
	Observableimpl termo = new Observableimpl();
	Observer o1 = new ObserverImpl();
	termo.subscribe(o1);
termo.subscribe(new Observer() {
	@Override
	public void update(Observable o) 
	{System.out.println("temperature recu"+((Observableimpl)o).getTemp());}
});
termo.subscribe((o)->{
	System.out.println("temperature recu"+((Observableimpl)o).getTemp());
});
	
	
	termo.setTemp(20);
	
	
	
	
}
}
