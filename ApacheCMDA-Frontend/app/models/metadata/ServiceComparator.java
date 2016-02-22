package models.metadata;

import java.util.Comparator;

/**
 * Created by Joe on 12/10/2015.
 */
public class ServiceComparator implements Comparator<ClimateService> {
    @Override
    public int compare(ClimateService o1, ClimateService o2) {
        if(o1.getGrade() > o2.getGrade()) {
            return -1;
        } else if (o1.getGrade() < o2.getGrade()){
            return 1;
        } else {
            return 0;
        }
    }
}
