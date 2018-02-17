package lambda.runnable;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Consumer;

public class RunnableDemo {

	public static void main(String args[]){
		
		Person people[] = new Person[]{new Person("p1"), new Person("p2"), new Person("p3"), new Person("p4"), new Person("p5")};
		
		Runnable r = () -> {
			Consumer<Person> c2 = s->System.out.println(s);
			Consumer<Person> c = p->{p.setName("q");};
			Arrays.asList(people).forEach(c);
			Arrays.asList(people).forEach(c2);
		};
		
		Thread t = new Thread(r);
		t.start();
		
		synchronized(t){
			try {
				System.out.println("thread starting!");
				t.wait();
				System.out.println("thread finished!");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
