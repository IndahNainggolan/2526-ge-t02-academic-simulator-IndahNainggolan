package academic.model;

public class Student {

    private String nim;
    private String name;
    private int year;
    private String studyProgram;

    public Student(String nim, String name, int year, String studyProgram) {
        this.nim = nim;
        this.name = name;
        this.year = year;
        this.studyProgram = studyProgram;
    }

    public String getNim() {
        return nim;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getStudyProgram() {
        return studyProgram;
    }
}