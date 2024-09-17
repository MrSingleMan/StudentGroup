import java.util.List;

public class TeacherController implements UserController<Teacher> {

    private final TeacherService teacherService = new TeacherService();

    private final TeacherView teacherView = new TeacherView();

    public void removeTeacherByFIO(String firstName, String lastName, String middleName){
        teacherService.removeTeacherbyFIO(firstName, lastName, middleName);
    }

    public List<Teacher> getSortedTeacherList() {
        List<Teacher> teacherList = teacherService.getSortedTeacherList();
        teacherView.sendOnConsole(teacherList);
        return teacherList;
    }

    public List<Teacher> getSortedTeacherByFIO() {
        List<Teacher> teacherList = teacherService.getSortedTeacherByFIO();
        teacherView.sendOnConsole(teacherList);
        return teacherList;
    }

    public void create(String firstName, String lastName, String middleName){
        teacherService.createTeacher(firstName, lastName, middleName);
    }
}
