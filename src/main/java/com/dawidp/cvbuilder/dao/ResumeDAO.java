package com.dawidp.cvbuilder.dao;

import com.dawidp.cvbuilder.entity.*;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.Query;
import java.io.IOException;

@Repository
public class ResumeDAO {
    private int personId;


    private SessionFactory factory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Achievement.class)
            .addAnnotatedClass(Education.class)
            .addAnnotatedClass(Experience.class)
            .addAnnotatedClass(ForeignLanguage.class)
            .addAnnotatedClass(Person.class)
            .buildSessionFactory();


    public void savePersonal(Person thePerson) {
        Session currentSession = factory.getCurrentSession();
        currentSession.beginTransaction();
        currentSession.save(thePerson);
        personId = thePerson.getId();
        currentSession.getTransaction().commit();
        System.out.println("Person id is: " + personId);
    }


    public void saveEducation(Education theEducation) {
        Session currentSession = factory.getCurrentSession();
        currentSession.beginTransaction();
        Person tempPerson = currentSession.get(Person.class, personId);
        theEducation.setPerson(tempPerson);
        currentSession.save(theEducation);
        currentSession.getTransaction().commit();
    }

    public void saveExperience(Experience theExperience) {
        Session currentSession = factory.getCurrentSession();
        currentSession.beginTransaction();
        Person tempPerson = currentSession.get(Person.class, personId);
        theExperience.setPerson(tempPerson);
        currentSession.save(theExperience);
        currentSession.getTransaction().commit();
    }

    public void saveAchievement(Achievement theAchievement) {
        Session currentSession = factory.getCurrentSession();
        currentSession.beginTransaction();
        Person tempPerson = currentSession.get(Person.class, personId);
        theAchievement.setPerson(tempPerson);
        currentSession.save(theAchievement);
        currentSession.getTransaction().commit();
    }

    public void saveForeignLanguage(ForeignLanguage theForeignLanguage) {
        Session currentSession = factory.getCurrentSession();
        currentSession.beginTransaction();
        Person tempPerson = currentSession.get(Person.class, personId);
        theForeignLanguage.setPerson(tempPerson);
        currentSession.save(theForeignLanguage);
        currentSession.getTransaction().commit();
    }

    public Person getCv() {
        Session currentSession = factory.getCurrentSession();
        currentSession.beginTransaction();
        Person thePerson = currentSession.get(Person.class, personId);
        Hibernate.initialize(thePerson.getEducations());
        Hibernate.initialize(thePerson.getExperienceSet());
        Hibernate.initialize(thePerson.getForeignLanguageSet());
        Hibernate.initialize(thePerson.getAchievementSet());
        currentSession.getTransaction().commit();
        return thePerson;

    }
}
