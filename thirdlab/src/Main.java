public class Main {
    public static void main(String[] args) {
        Conference conference = new Conference();

        Schoolboy schoolboy1 = new Schoolboy("Danylo", 14, "Lyceum №1");
        UniversityStudent student1 = new UniversityStudent("Artem", 19, "KHPI");

        conference.addParticipant(schoolboy1);
        conference.addParticipant(student1);

        conference.countParticipants();
    }
}