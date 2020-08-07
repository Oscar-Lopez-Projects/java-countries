package com.lambdaschool.javacountries.repositories;

import com.lambdaschool.javacountries.models.WorldCountries;
import org.springframework.data.repository.CrudRepository;

public interface CountriesRepo extends CrudRepository<WorldCountries,Long> {
}
