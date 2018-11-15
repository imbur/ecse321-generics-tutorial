package ca.mcgill.ecse321.generics;

import java.util.List;

public class SwapUtil {

	/**
	 * TODO add javadoc
	 * @param l
	 * @param i
	 * @param j
	 */
    public static void swap(List l, int i, int j){
        Object temp = l.get(i);
        l.add(i,l.get(j));
        l.add(j,temp);
        return;
    }

}
