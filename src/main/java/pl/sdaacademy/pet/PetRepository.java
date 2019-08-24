package pl.sdaacademy.pet;

import java.util.List;
import java.util.Map;

public interface PetRepository {

    List<Pet> findAll();

    List<Pet> findByBreed(String breed);

    List<Pet> findByLocation(String location);

    List<Pet> sortByAge();

    Map<String, List<Pet>> groupByBreed();
}
