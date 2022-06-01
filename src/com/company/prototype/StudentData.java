package com.company.prototype;

class StudentData implements Cloneable {
    private String studentName;
    private String collegeName;

    public String getName() {
        return studentName;
    }

    public void setName(String name) {
        this.studentName = name;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }


    public StudentData createInstance() throws CloneNotSupportedException {
        StudentData student =(StudentData) super.clone();
        return student;
    }

    @Override
    public String toString() {
        return "StudentData{" +
                "name='" + studentName + '\'' +
                ", CollegeName='" + collegeName + '\'' +
                '}';
    }
}
