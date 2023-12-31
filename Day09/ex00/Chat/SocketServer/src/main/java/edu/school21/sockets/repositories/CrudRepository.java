package edu.school21.sockets.repositories;

import edu.school21.sockets.models.User;

import java.util.List;
import java.util.Optional;

public interface CrudRepository <T>{
    Optional<T> findById(Long id);
    List<T> findAll();
    void save(T user);
    void update(T user);
    void delete(Long id);
}
