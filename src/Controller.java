import java.util.List;

public class Controller {

    private final StudentGroupService studentGroupService = new StudentGroupService();
    private StreamService streamService;

    public void removeStudentByFIO(String firstName, String lastName, String middleName){
        studentGroupService.removeStudentbyFIO(firstName, lastName, middleName);
    }

    public List<Student> getSortedStudentList() {
        return studentGroupService.getSortedStudentList();
    }

    public List<Student> getSortedStudentByFIO(){
        return studentGroupService.getSortedStudentByFIO();
    }

    public Controller() {
        this.streamService = new StreamService();
    }

    public void sortStreams(List<Stream> streams) {
        streamService.sortStreams(streams);
        System.out.println("Streams sorted by the number of groups.");
    }
}
