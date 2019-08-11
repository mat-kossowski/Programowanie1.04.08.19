package pl.sdaacademy.pet;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class PetServiceTest {

    @Test
    public void findAllPetsShouldReturnListOfPets() {
        List<Pet> testPets = Arrays.asList(
                new Pet("Pet1", 2, "a", "xyz"),
                new Pet("Pet2", 5, "b", "abc")
        );

        PetService petService = new PetService(new InMemoryPetRepository(testPets));

        List<Pet> actualList = petService.findAll();

        Assert.assertEquals(testPets, actualList);
    }

    @Test
    public void findByBreedShouldReturnListOfPetsOfBreed() {
        List<Pet> testPets = Arrays.asList(
                new Pet("Pet1", 2, "a", "xyz"),
                new Pet("Pet2", 5, "b", "abc")
        );
        PetService petService = new PetService(new InMemoryPetRepository(testPets));

        List<Pet> result = petService.findByBreed("a");


        Assert.assertEquals(1, result.size());
        Assert.assertEquals(new Pet("Pet1", 2, "a", "xyz"), result.get(0));

    }

    @Test
    public void findByLocationShouldReturnListOfPetsOfLocation() {
        List<Pet> testPets = Arrays.asList(
                new Pet("Pet1", 2, "a", "xyz"),
                new Pet("Pet2", 5, "b", "abc")
        );
        PetService petService = new PetService(new InMemoryPetRepository(testPets));

        List<Pet> result = petService.findByLocation("xyz");


        Assert.assertEquals(1, result.size());
        Assert.assertEquals(new Pet("Pet1", 2, "a", "xyz"), result.get(0));

    }

    @Test
    public void sortByAgeShouldReturnSortedList() {
        List<Pet> testPets = Arrays.asList(
                new Pet("Pet1", 8, "a", "xyz"),
                new Pet("Pet2", 3, "b", "abc"),
                new Pet("Pet3", 7, "c", "gdf")
        );
        PetService petService = new PetService(new InMemoryPetRepository(testPets));
        List<Pet> pets = petService.sortByAge();

        Assert.assertEquals(pets.get(0), testPets.get(1));
        Assert.assertEquals(pets.get(1), testPets.get(2));
        Assert.assertEquals(pets.get(2), testPets.get(0));


    }

    @Test
    public void groupByBreedShouldReturnMapWithGroupedPets(){

        PetService petService = new PetService(new InMemoryPetRepository());

        Map<String, List<Pet>> map = petService.groupByBreed();

        Assert.assertEquals(map.get("Scottish Terrier").size(),3);
        Assert.assertEquals(map.get("French Bulldog").size(),5);
        Assert.assertEquals(map.get("Boxer").size(),3);
        Assert.assertEquals(map.get("Golden Retriever").size(),5);
    }

}
