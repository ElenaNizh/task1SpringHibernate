package ru.netology.task1SpringHibernate.service;

import ru.netology.task1SpringHibernate.entity.Person;
import ru.netology.task1SpringHibernate.repository.Repository;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    private final Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public List<Person> getPersonsByCity(String city) {
        return repository.getPersonsByCity(city);
    }
}