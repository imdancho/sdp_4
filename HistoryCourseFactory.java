class HistoryCourseFactory implements CourseFactory {
    @Override
    public Course createCourse(String courseName) {
        return new HistoryCourse(courseName);
    }
}