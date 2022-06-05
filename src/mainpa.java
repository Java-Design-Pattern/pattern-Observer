import patternobserver.observable.Observable;
import patternobserver.observable.Observableimpl;
import patternobserver.observer.Observer;
import patternobserver.observer.ObserverImpl;
import patternobserver.observer.ObserverImpl2;

public class mainpa {
public static void main(String[] arg)
{
	Observableimpl termo = new Observableimpl();
	Observer o1 = new ObserverImpl();
	Observer o2 = new ObserverImpl2();
	System.out.println("debut");
	termo.subscribe(o1);
	termo.subscribe(o2);
	termo.setTemp(20);
	termo.setTemp(30);
	termo.setTemp(25);
	termo.setTemp(20);
	termo.setTemp(40);
	System.out.println("debut");
}
}
