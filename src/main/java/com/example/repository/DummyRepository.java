package com.example.repository;

import com.example.entity.DummyEntity;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.GenericRepository;

@Repository
public interface DummyRepository extends GenericRepository<DummyEntity, Long> {
}
