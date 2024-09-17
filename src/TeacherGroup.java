import java.util.Iterator;
import java.util.List;

public class TeacherGroup implements Iterable<Teacher> {

    private String name;
    private List<Teacher> teacherList;

    public TeacherGroup(String name){
        this.name = name;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void createTeacher(String firstName, String lastName, String middleName) {
        teacherList.add(new Teacher(firstName, lastName, middleName));
    }

    @Override
    public Iterator<Teacher> iterator() {
        return new TeacherGroupIterator(this);
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "name='" + name + '\'' +
                '}';
    }
}
