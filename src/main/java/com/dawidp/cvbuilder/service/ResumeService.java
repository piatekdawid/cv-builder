package com.dawidp.cvbuilder.service;

import com.dawidp.cvbuilder.dao.ResumeDAO;
import com.dawidp.cvbuilder.entity.Achievement;
import com.dawidp.cvbuilder.entity.Education;
import com.dawidp.cvbuilder.entity.Experience;
import com.dawidp.cvbuilder.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResumeService {

    @Autowired
    private ResumeDAO resumeDAO;

    public void savePersonal(Person thePerson) {
        resumeDAO.savePersonal(thePerson);
    }

    public void saveEducation(Education theEducation) {
        resumeDAO.saveEducation(theEducation);
    }

    public void saveExperience(Experience theExperience) {
        resumeDAO.saveExperience(theExperience);
    }

    public void saveAchievement(Achievement theAchievement) {
        resumeDAO.saveAchievement(theAchievement);
    }
}
