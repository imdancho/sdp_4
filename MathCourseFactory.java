class MathCourseFactory implements CourseFactory {
    @Override
    public Course createCourse(String courseName) {
        return new MathCourse(courseName);
    }
}