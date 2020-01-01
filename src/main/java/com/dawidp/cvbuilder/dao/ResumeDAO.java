package com.dawidp.cvbuilder.dao;

import com.dawidp.cvbuilder.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

@Repository
public class ResumeDAO {
    private int personId;


    SessionFactory factory = new Configuration()
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

}
