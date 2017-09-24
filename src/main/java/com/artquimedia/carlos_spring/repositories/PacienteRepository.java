package com.artquimedia.carlos_spring.repositories;

import com.artquimedia.carlos_spring.model.Paciente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by pezpc on 9/24/17. ***
 */

@Repository
public interface PacienteRepository extends CrudRepository<Paciente, Long> {


}
