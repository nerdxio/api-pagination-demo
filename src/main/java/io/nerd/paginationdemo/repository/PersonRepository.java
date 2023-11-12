package io.nerd.paginationdemo.repository;

import io.nerd.paginationdemo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Integer> {

}

