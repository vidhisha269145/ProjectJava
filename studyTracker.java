import java.util.ArrayList;

public class StudyTracker {
    ArrayList<Subject> subjects = new ArrayList<>();

    void addSubject(String n, double t) {
        subjects.add(new Subject(n, t));
        System.out.println("Subject added successfully!");
    }

    Subject find(String n) {
        for (Subject s : subjects)
            if (s.name.equalsIgnoreCase(n)) return s;
        return null;
    }

    void viewSubjects() {
        System.out.println("\n--- Your Subjects ---");
        for (Subject s : subjects)
            System.out.println(s.name + " - " + s.completed
                    + "/" + s.target + " hours");
    }
}
