package java_exercises;

import java.util.Comparator;
public class ComparatorCustomer implements Comparator{

    public int compare (Object o1, Object o2) {
	Customer c1 = (Customer)o1;
	Customer c2 = (Customer)o2;

        //Reorder Desc	
            if(c1.priority -c2.priority > 0) return-1;
            if(c1.priority -c2.priority < 0) return 1;
                                             return 0;
	}
}
