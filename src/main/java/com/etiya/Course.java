package com.etiya;

public class Course {
    private int id;
    private String title;
    private String code;
    private String programmingLanguage;

    public Course(int id, String title, String programmingLanguage){
        this.id = id;
        this.title = title;
        this.programmingLanguage = programmingLanguage;
    }
    public Course(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCode() {
        return title.substring(0, 1) + id;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
}
