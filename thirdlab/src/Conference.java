import java.util.List;
import java.util.ArrayList;

class Conference {
    private List<Student> participants;

    public Conference() {
        participants = new ArrayList<>();
    }

    public void addParticipant(Student student) {
        participants.add(student);
    }

    public void countParticipants() {
        int schoolboyCount = 0;
        int universityStudentCount = 0;

        for (Student participant : participants) {
            if (participant instanceof Schoolboy) {
                schoolboyCount++;
            } else if (participant instanceof UniversityStudent) {
                universityStudentCount++;
            }
        }

        System.out.println("Number of school student: " + schoolboyCount);
        System.out.println("Number of university student; " + universityStudentCount);
    }
}