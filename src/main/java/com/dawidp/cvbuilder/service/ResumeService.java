package com.dawidp.cvbuilder.service;

import com.dawidp.cvbuilder.dao.ResumeDAO;
import com.dawidp.cvbuilder.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

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

    public void saveForeignLanguage(ForeignLanguage theForeignLanguage) {
        resumeDAO.saveForeignLanguage(theForeignLanguage);
    }

    public Person getCV() {
        Person thePerson = resumeDAO.getCv();
        return thePerson;
    }

}
