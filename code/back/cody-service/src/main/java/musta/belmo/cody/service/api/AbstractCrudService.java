package musta.belmo.cody.service.api;

import musta.belmo.cody.model.AbstractDTO;

import java.util.Optional;
import java.util.Set;

public interface AbstractCrudService<T extends AbstractDTO> {

    T create(T t);

    Optional<T> findOne(Long id);

    Set<T> findAll();

    T update(T t);

    T update(Long id, T t);

    void delete(T t);

    void delete(Long id);

}
