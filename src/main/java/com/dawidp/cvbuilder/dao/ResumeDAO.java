package com.dawidp.cvbuilder.dao;

import com.dawidp.cvbuilder.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

@Repository
public class ResumeDAO {
    int personId;
    int educationId;
    int experienceId;


    SessionFactory factory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Achievements.class)
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
        educationId = theEducation.getId();
        currentSession.beginTransaction();
        Person tempPerson = currentSession.get(Person.class, personId);
        theEducation.setPerson(tempPerson);
        currentSession.save(theEducation);
        currentSession.getTransaction().commit();
        System.out.println("Education id is: " + educationId);
    }

    public void saveExperience(Experience theExperience) {
        Session currentSession = factory.getCurrentSession();
        experienceId = theExperience.getId();
        currentSession.beginTransaction();
        Person tempPerson = currentSession.get(Person.class, personId);
        theExperience.setPerson(tempPerson);
        currentSession.save(theExperience);
        currentSession.getTransaction().commit();
        System.out.println("Experience id is: " + experienceId);
    }

/*    public void savePersonal(Person thePerson) {
        Session currentSession = factory.getCurrentSession();
        currentSession.beginTransaction();
        currentSession.save(thePerson);
        currentSession.getTransaction().commit();
    }


    public void saveEducation(Education theEducation) {
        Session currentSession = factory.getCurrentSession();
        currentSession.beginTransaction();
        currentSession.save(theEducation);
        currentSession.getTransaction().commit();
    }*/


}
