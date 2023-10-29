class HistoryCourse implements Course {
    private String courseName;

    public HistoryCourse(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public void enrollStudent(String studentName) {
        System.out.println(studentName + " is enrolled in the History course: " + courseName);
    }

    @Override
    public void start() {
        System.out.println("History course has started.");
    }
}