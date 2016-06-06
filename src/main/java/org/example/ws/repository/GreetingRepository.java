package org.example.ws.repository;

import org.example.ws.model.Greeting;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends CrudRepository<Greeting, Long> {
}
