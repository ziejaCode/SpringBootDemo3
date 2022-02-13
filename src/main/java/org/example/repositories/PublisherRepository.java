package org.example.repositories;

import org.example.models.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 5/17/17.
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
