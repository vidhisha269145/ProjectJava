public class Subject{
  public class Subject implements Trackable {
    String name;
    double target, completed = 0;

    Subject(String n, double t) {
        name = n;
        target = t;
    }

    void addHours(double h) {
        completed += h;
    }

    public void showProgress() {
        System.out.println("\n--- Subject Progress ---");
        System.out.println("Subject: " + name);
        System.out.println("Target Hours: " + target);
        System.out.println("Completed Hours: " + completed);
        System.out.printf("Progress: %.1f%%%n",
                completed / target * 100);
    }
}
}
