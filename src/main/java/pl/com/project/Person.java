package pl.com.project;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.Valid;
import java.util.ArrayList;

@Entity
public class Person {



    @Id
    @GeneratedValue
    private Long id;
    private String surname;
    private String name;

    public Person(String name, String surname) {

        this.name = name;
        this.surname=surname;
    }

    private Person(){}

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setId(Long id) {
        this.id = id;
    }
    @Configuration
    public class RepositoryConfig extends RepositoryRestConfigurerAdapter {
        @Override
        public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
            config.exposeIdsFor(Person.class);
        }
    }


}
