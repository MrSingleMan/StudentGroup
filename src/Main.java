import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        StudentGroup group1 = new StudentGroup("Математика");
        StudentGroup group2 = new StudentGroup("История");
        StudentGroup group3 = new StudentGroup("Литература");

        Stream stream1 = new Stream(Arrays.asList(group1, group2)); // 2 группы
        Stream stream2 = new Stream(Arrays.asList(group3)); // 1 группа
        Stream stream3 = new Stream(Arrays.asList(group1, group2, group3)); // 3 группы

        List<Stream> streams = Arrays.asList(stream1, stream2, stream3);

        Controller controller = new Controller();

        controller.sortStreams(streams);

        // Выводим отсортированные потоки
        for (Stream stream : streams) {
            System.out.println("Поток с " + stream.getGroupCount() + " группами(ой).");
        }
    }

}