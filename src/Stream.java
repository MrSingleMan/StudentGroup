import java.util.List;
import java.util.Iterator
        ;
public class Stream  implements Iterable<StudentGroup> {
    private List<StudentGroup> studentGroupList;

    public Stream(List<StudentGroup> studentGroupList){
        this.studentGroupList = studentGroupList;
    }

    public List<StudentGroup> getStudentGroupList(){
        return studentGroupList;
    }

    public int getGroupCount(){
        return studentGroupList.size();
    }


    @Override
    public Iterator<StudentGroup> iterator() {
        return studentGroupList.iterator();
    }
}
