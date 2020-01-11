package com.dawidp.cvbuilder.controller;

import com.dawidp.cvbuilder.entity.*;
import com.dawidp.cvbuilder.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;

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

/*    @PostMapping("/savePersonals")
    public String savePersonal(@ModelAttribute("person") Person thePerson) {


        resumeService.savePersonal(thePerson);
        return "redirect:/education";
    }*/

    @PostMapping("/savePersonals")
    public String savePersonal(@RequestParam(value = "firstName") String firstName,
                               @RequestParam(value = "lastName") String lastName,
                               @RequestParam(value = "address") String address,
                               @RequestParam(value = "zipCode") String zipCode,
                               @RequestParam(value = "city") String city,
                               @RequestParam(value = "phoneNumber") String phoneNumber,
                               @RequestParam(value = "aboutMe") String aboutMe,
                               @RequestParam(value = "skills") String skills,
                               @RequestParam(value = "hobbySet") String hobby,
                               @RequestParam(value = "email") String email,
                               @RequestParam(value = "photo") MultipartFile file,
                               Model model) {

        Person thePerson = new Person();
        thePerson.setFirstName(firstName);
        thePerson.setLastName(lastName);
        thePerson.setAddress(address);
        thePerson.setZipCode(zipCode);
        thePerson.setCity(city);
        thePerson.setPhoneNumber(phoneNumber);
        thePerson.setAboutMe(aboutMe);
        thePerson.setSkills(skills);
        thePerson.setHobbySet(hobby);
        thePerson.setEmail(email);
        try {
            thePerson.setPhoto(file.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

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

        return "redirect:/foreignLanguage";
    }

    @GetMapping("/foreignLanguage")
    public String saveForeignLanguage(Model theModel) {

        ForeignLanguage theForeignLanguage = new ForeignLanguage();
        theModel.addAttribute("foreignLanguage", theForeignLanguage);

        return "foreign-language";
    }

    @PostMapping("/nextForeignLanguage")
    public String nextElement(@ModelAttribute("foreignLanguage") ForeignLanguage theForeignLanguage) {

        resumeService.saveForeignLanguage(theForeignLanguage);

        return "redirect:/foreignLanguage";
    }

    @PostMapping("/saveForeignLanguage")
    public String move(@ModelAttribute("foreignLanguage") ForeignLanguage theForeignLanguage) {

        resumeService.saveForeignLanguage(theForeignLanguage);

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

        return "redirect:/cv-review";
    }

    @GetMapping("/cv-review")
    public String getCV(Model theModel) {
        Person thePerson = resumeService.getCV();
        byte[] photo = (thePerson.getPhoto());
        String base64String = Base64.getEncoder().encodeToString(photo);
        theModel.addAttribute("person", thePerson);
        theModel.addAttribute("photo", base64String);
        return "finish";

    }


}