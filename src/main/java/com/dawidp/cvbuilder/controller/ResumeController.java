package com.dawidp.cvbuilder.controller;

import com.dawidp.cvbuilder.entity.Achievement;
import com.dawidp.cvbuilder.entity.Education;
import com.dawidp.cvbuilder.entity.Experience;
import com.dawidp.cvbuilder.entity.Person;
import com.dawidp.cvbuilder.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResumeController {

    @Autowired
    private ResumeService resumeService;

    @RequestMapping("/")
    public String showHomePage() {
        return "index";
    }

    @GetMapping("/error")
    public String showErrorPage() {
        return "error";
    }

    @GetMapping("/showBuilder")
    public String showBuilder(Model theModel) {

        Person thePerson = new Person();
        theModel.addAttribute("person", thePerson);

        return "create-cv";
    }

    @PostMapping("/savePersonals")
    public String savePersonal(@ModelAttribute("person") Person thePerson) {
        resumeService.savePersonal(thePerson);

        return "redirect:/education";
    }

    @GetMapping("/education")
    public String saveEducation(Model theModel) {

        Education theEducation = new Education();
        theModel.addAttribute("education", theEducation);

        return "education";
    }

    @PostMapping("/nextElement")
    public String nextEducationElement(@ModelAttribute("education") Education theEducation) {

        resumeService.saveEducation(theEducation);

        return "redirect:/education";
    }

    @PostMapping("/saveEducation")
    public String saveEducation(@ModelAttribute("education") Education theEducation) {

        resumeService.saveEducation(theEducation);

        return "redirect:/experience";
    }


    @GetMapping("/experience")
    public String saveExperience(Model theModel) {

        Experience theExperience = new Experience();
        theModel.addAttribute("experience", theExperience);

        return "experience";
    }

    @PostMapping("/nextExperience")
    public String nextElement(@ModelAttribute("experience") Experience theExperience) {

        resumeService.saveExperience(theExperience);

        return "redirect:/experience";
    }

    @PostMapping("/saveExperience")
    public String move(@ModelAttribute("experience") Experience theExperience) {

        resumeService.saveExperience(theExperience);

        return "redirect:/achievement";
    }

    @GetMapping("/achievement")
    public String saveAchievement(Model theModel) {

        Achievement theAchievement = new Achievement();
        theModel.addAttribute("achievement", theAchievement);

        return "achievement";
    }

    @PostMapping("/nextAchievement")
    public String nextElement(@ModelAttribute("achievement") Achievement theAchievement) {

        resumeService.saveAchievement(theAchievement);

        return "redirect:/achievement";
    }

    @PostMapping("/saveAchievement")
    public String move(@ModelAttribute("achievement") Achievement theAchievement) {

        resumeService.saveAchievement(theAchievement);

        return "finish";
    }


}
