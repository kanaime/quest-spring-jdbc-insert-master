package com.wildcodeschool.wildandwizard.controller;

import com.wildcodeschool.wildandwizard.entity.Wizard;
import com.wildcodeschool.wildandwizard.repository.WizardRepository;

// import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WizardController {
    @Autowired
    private WizardRepository repository;

    @PostMapping("/wizard/create")
    public String postWizard(Model model,
            @RequestParam String firstName,
            @RequestParam String lastName,
            @RequestParam String birthday,
            @RequestParam String birthPlace,
            @RequestParam String biography,
            @RequestParam boolean muggle) {

        Wizard wizard = new Wizard();
        wizard.setFirstName(firstName);
        wizard.setLastName(lastName);
        wizard.setBirthday(birthday);
        wizard.setBirthPlace(birthPlace);
        wizard.setBiography(biography);
        wizard.setMuggle(muggle);
        model.addAttribute("wizard", repository.save(wizard));

        return "wizard_get";
    }
}
