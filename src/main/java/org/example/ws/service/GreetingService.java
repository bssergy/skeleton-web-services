package org.example.ws.service;

import org.example.ws.model.Greeting;

public interface GreetingService {

    Iterable<Greeting> findAll();

    Greeting findOne(Long id);

    Greeting create(Greeting greeting);

    Greeting update(Greeting greeting);

    void delete(Long id);

    void evictCache();

}
