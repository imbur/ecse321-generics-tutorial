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
        int lower, greater;
    	if(i<j) {
        	lower = i;
        	greater = j;
        } else {
        	lower = j;
        	greater = i;        	
        }
    	Object temp = l.get(greater);
        l.remove(greater);
        l.add(l.get(lower));
        l.remove(lower);
        l.add(lower,temp);
        return;
    }

}
