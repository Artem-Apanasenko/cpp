class UniversityStudent extends Student {
    private String universityName;

    public UniversityStudent(String name, int age, String universityName) {
        super(name, age);
        this.universityName = universityName;
    }

    public String getUniversityName() {
        return universityName;
    }
}