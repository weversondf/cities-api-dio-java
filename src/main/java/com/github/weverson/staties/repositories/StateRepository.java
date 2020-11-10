package com.github.weverson.staties.repositories;

import com.github.weverson.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
