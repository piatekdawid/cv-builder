package com.dawidp.cvbuilder.entity;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "personal_information")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", updatable = false, nullable = false)
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "address")
    private String address;

    @Column(name = "zip_code")
    private String zipCode;

    @Column(name = "city")
    private String city;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "person")
    private Set<Education> educationSet = new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "person")
    private Set<Experience> experienceSet = new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "person")
    private Set<Achievement> achievementSet = new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "person")
    private Set<ForeignLanguage> foreignLanguageSet = new HashSet<>();

    @Column(name = "hobby")
    private String hobbySet;

    @Column(name = "skills")
    private String skills;

    @Column(name = "about_me")
    private String aboutMe;

    public Person() {
    }

    public Person(String firstName, String lastName, String address, String zipCode, String city, String email, String phoneNumber, Set<Education> educationSet, Set<Achievement> achievementSet, Set<Experience> experienceSet, Set<ForeignLanguage> foreignLanguageSet, String hobbySet, String skills, String aboutMe) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.zipCode = zipCode;
        this.city = city;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.educationSet = educationSet;
        this.achievementSet = achievementSet;
        this.experienceSet = experienceSet;
        this.foreignLanguageSet = foreignLanguageSet;
        this.hobbySet = hobbySet;
        this.skills = skills;
        this.aboutMe = aboutMe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public Set<Education> getEducations() {
        return educationSet;
    }

    public void setEducations(Set<Education> educationSet) {
        this.educationSet = educationSet;
    }

    public Set<Achievement> getAchievementSet() {
        return achievementSet;
    }

    public void setAchievementSet(Set<Achievement> achievementSet) {
        this.achievementSet = achievementSet;
    }

    public Set<Experience> getExperienceSet() {
        return experienceSet;
    }

    public void setExperienceSet(Set<Experience> experienceSet) {
        this.experienceSet = experienceSet;
    }

    public Set<ForeignLanguage> getForeignLanguageSet() {
        return foreignLanguageSet;
    }

    public void setForeignLangageSet(Set<ForeignLanguage> foreignLanguageSet) {
        this.foreignLanguageSet = foreignLanguageSet;
    }

    public String getHobbySet() {
        return hobbySet;
    }

    public void setHobbySet(String hobbySet) {
        this.hobbySet = hobbySet;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public void addEducation(Education education){
        educationSet.add(education);
        education.setPerson(this);

    }
    public void addExperience(Experience experience){
        experienceSet.add(experience);
        experience.setPerson(this);

    }
    public void addAchievement(Achievement achievement){
        achievementSet.add(achievement);
        achievement.setPerson(this);

    }


}
