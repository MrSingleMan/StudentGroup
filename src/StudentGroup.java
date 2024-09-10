import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {

    private String name;
    private List<Student> studentList;

    public StudentGroup(String name){
        this.name = name;
    }

    public String getNameGroup(){
        return name;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "name='" + name + '\'' +
                '}';
    }
}
