package java_exercises;

import java.util.PriorityQueue;

public class Principal {

	public static void main(String[] args) {

            ComparatorCustomer comparator = new ComparatorCustomer();

		PriorityQueue clientes = new PriorityQueue(10, comparator);
		clientes.add(new Customer("John", 2));
		clientes.add(new Customer("Peter", 5));
		clientes.add(new Customer("Mary", 1));

                while(! clientes.isEmpty()) {
                    Customer c = (Customer) clientes.poll();
                    System.out.println(c.name+ " " + c.priority);
		}
        }
}