import java.util.List;

public class StudentController implements UserController<Student> {

    private final StudentGroupService studentGroupService = new StudentGroupService();
    private StreamService streamService;

    private final StudentView studentView = new StudentView();

    public void removeStudentByFIO(String firstName, String lastName, String middleName){
        studentGroupService.removeStudentbyFIO(firstName, lastName, middleName);
    }

    public List<Student> getSortedStudentList() {
        List<Student> studentList = studentGroupService.getSortedStudentList();
        studentView.sendOnConsole(studentList);
        return studentList;
    }

    public List<Student> getSortedStudentByFIO() {
        List<Student> studentList = studentGroupService.getSortedStudentByFIO();
        studentView.sendOnConsole(studentList);
        return studentList;
    }

    public StudentController() {
        this.streamService = new StreamService();
    }

    public void sortStreams(List<Stream> streams) {
        streamService.sortStreams(streams);
        System.out.println("Streams sorted by the number of groups.");

    }

    public void create(String firstName, String lastName, String middleName){
        studentGroupService.createStudent(firstName, lastName, middleName);
    }
}
