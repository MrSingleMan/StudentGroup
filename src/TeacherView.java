import java.util.List;

public class TeacherView implements UserView<Teacher> {

    public void sendOnConsole(List<Teacher> list) {
        for (Teacher teacher: list) {
            System.out.println(teacher.getTeacherId());
        }
    }
}
