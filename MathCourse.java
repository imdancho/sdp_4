class MathCourse implements Course {
    private String courseName;

    public MathCourse(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public void enrollStudent(String studentName) {
        System.out.println(studentName + " is enrolled in the Math course: " + courseName);
    }

    @Override
    public void start() {
        System.out.println("Math course has started.");
    }
}