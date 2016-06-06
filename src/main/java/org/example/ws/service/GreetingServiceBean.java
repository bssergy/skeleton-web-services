package org.example.ws.service;

import org.example.ws.model.Greeting;
import org.example.ws.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceBean implements GreetingService {

    @Autowired
    private GreetingRepository greetingRepository;

    @Override
    public Iterable<Greeting> findAll() {
        Iterable<Greeting> greetings = greetingRepository.findAll();
        return greetings;
    }

    @Override
    public Greeting findOne(Long id) {
        Greeting greeting = greetingRepository.findOne(id);
        return greeting;
    }

    @Override
    public Greeting create(Greeting greeting) {
        if (greeting.getId() != null) {
            // Cannot create Greeting with specified ID value
            return null;
        }

        Greeting savedGreeting = greetingRepository.save(greeting);
        return savedGreeting;
    }

    @Override
    public Greeting update(Greeting greeting) {
        Greeting greetingPersisted = findOne(greeting.getId());
        if (greetingPersisted == null) {
            // Cannot update Greeting that hasn't been persisted
            return null;
        }

        Greeting updatedGreeting = greetingRepository.save(greeting);
        return updatedGreeting;
    }

    @Override
    public void delete(Long id) {
        greetingRepository.delete(id);
    }

}
