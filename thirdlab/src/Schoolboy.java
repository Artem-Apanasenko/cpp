class Schoolboy extends Student {
    private String schoolName;

    public Schoolboy(String name, int age, String schoolName) {
        super(name, age);
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }
}