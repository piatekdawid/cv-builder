package com.dawidp.cvbuilder.controller;

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
    public String showErrorPage(){
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

        return "redirect:/showEducation";
    }
    @GetMapping("/showEducation")
    public String saveEducation(Model theModel){

        Education theEducation = new Education();
        theModel.addAttribute("education", theEducation);

        return "education";
    }
    @PostMapping("/saveEducation")
    public String saveEducation(@ModelAttribute("education") Education theEducation){

        resumeService.saveEducation(theEducation);

        return "redirect:/showExperience";
    }
    @GetMapping("/showExperience")
    public String saveExperience(Model theModel){

        Experience theExperience = new Experience();
        theModel.addAttribute("experience", theExperience);

        return "experience";
    }
    @PostMapping("/next")
    public String nextEducation(@ModelAttribute("experience") Experience theExperience){

        resumeService.saveExperience(theExperience);

        return "redirect:/showExperience";
    }
    @PostMapping("/move")
    public String move(@ModelAttribute("experience") Experience theExperience){

        resumeService.saveExperience(theExperience);

        return "finish";
    }


}
