public class School {
    public static void main(String[] args) {
        CourseFactory mathCourseFactory = new MathCourseFactory();
        CourseFactory historyCourseFactory = new HistoryCourseFactory();

        Course mathCourse = mathCourseFactory.createCourse("Algebra");
        Course historyCourse = historyCourseFactory.createCourse("World History");

        mathCourse.enrollStudent("Alice");
        historyCourse.enrollStudent("Bob");

        mathCourse.start();
        historyCourse.start();
    }
}