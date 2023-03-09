package com.wildcodeschool.wildandwizard.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wildcodeschool.wildandwizard.entity.Wizard;

@Repository
public interface WizardRepository extends JpaRepository<Wizard, Long> {

    List<Wizard> findByLastName(String lastName);

}
