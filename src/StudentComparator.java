import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    public int compare(Student o1, Student o2) {
        int resultofComparing = o1.getFirstName().compareTo(o2.getFirstName());
        if (resultofComparing == 0) {
            resultofComparing = o1.getLastName().compareTo(o2.getLastName());
            if (resultofComparing == 0) {
                return o1.getMiddleName().compareTo(o2.getMiddleName());
            } else {
                return resultofComparing;
            }
        } else {
            return resultofComparing;
        }
    }

}
