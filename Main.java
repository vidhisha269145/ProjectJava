import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudyTracker st = new StudyTracker();
        int choice;

        do {
            System.out.println("\n==============================");
            System.out.println("     STUDENT STUDY TRACKER");
            System.out.println("==============================");
            System.out.println("1. Add Subject");
            System.out.println("2. View Subjects");
            System.out.println("3. Add Study Hours");
            System.out.println("4. View Progress");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter subject name: ");
                String n = sc.nextLine();
                System.out.print("Enter target hours: ");
                double t = sc.nextDouble();
                if (t > 0) st.addSubject(n, t);
                else System.out.println("Target must be positive!");

            } else if (choice == 2) {
                st.viewSubjects();

            } else if (choice == 3 || choice == 4) {
                System.out.print("Enter subject name: ");
                Subject s = st.find(sc.nextLine());

                if (s == null) System.out.println("Subject not found!");
                else if (choice == 3) {
                    System.out.print("Enter study hours: ");
                    double h = sc.nextDouble();
                    if (h > 0) {
                        s.addHours(h);
                        System.out.println("Study hours added!");
                    } else System.out.println("Hours must be positive!");
                } else s.showProgress();

            } else if (choice == 5) {
                System.out.println("Keep learning. Goodbye!");
            } else {
                System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}
