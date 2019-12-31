package com.dawidp.cvbuilder.entity;

import javax.persistence.*;

@Entity
@Table(name = "education")
public class Education {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "edu_id")
    private int id;

    @Column(name = "started_date")
    private String startingSchool;

    @Column(name = "finish_date")
    private String finishSchool;

    @Column(name = "course")
    private String course;

    @Column(name = "degree")
    private String degree;

    @Column(name = "school")
    private String schoolName;

    @Column(name = "additional_info")
    private String additionalInfo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false, updatable = false, insertable = true)
    private Person person;


    public Education() {
    }

    public Education(String startingSchool, String finishSchool, String course, String degree, String schoolName, String additionalInfo, Person person) {
        this.startingSchool = startingSchool;
        this.finishSchool = finishSchool;
        this.course = course;
        this.degree = degree;
        this.schoolName = schoolName;
        this.additionalInfo = additionalInfo;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStartingSchool() {
        return startingSchool;
    }

    public void setStartingSchool(String startingSchool) {
        this.startingSchool = startingSchool;
    }

    public String getFinishSchool() {
        return finishSchool;
    }

    public void setFinishSchool(String finishSchool) {
        this.finishSchool = finishSchool;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
