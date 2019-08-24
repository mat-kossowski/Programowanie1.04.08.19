package pl.sdaacademy.user;

import user.Gender;
import user.User;
import user.UserServis;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UserServiceTest {

    @Test
    public void findByGender_ShouldReturnFilteredList() {
        UserServis userServis = new UserServis();

        List<User> list = userServis.findByGender(Gender.female);

        Assert.assertEquals("Lista powinna zawierać 3 elementy", 3, list.size());

        Assert.assertTrue("Wszystkie elementy powinny mieć wartośc female", list.stream()
                .map(user -> user.getGender())
                .allMatch(gender -> gender.equals(Gender.female)));
    }

    @Test
    public void mapToNames_ShouldReturnFilteredListWhitNames() {
        UserServis userServis = new UserServis();

        List<String> names = userServis.mapToNames();

        Assert.assertEquals(Arrays.asList("Bird Ramsey", "Lillian Burgess",
                "Kristie Cole",
                "Leonor Cross",
                "Marsh Mccall"), names);
    }

    @Test
    public void sortByAge_ShouldReturnSortedByAgeListOfUsers() {

        UserServis userServis = new UserServis();
        List<User> users = userServis.sortByAge();
        users.forEach(user -> System.out.println(user));
    }

    @Test
    public void sortByBalance_ShouldReturnSortedByAgeListOfUsers() {
        UserServis userServis = new UserServis();
        List<User> users = userServis.sortByBalance();
        users.forEach(user -> System.out.println(user));


    }
    @Test
    public void avgBalanceShouldReturnAvgValue(){
        UserServis userServis = new UserServis();

        double avgBalance = userServis.avgBalance();

        Assert.assertEquals( 290318.2, avgBalance, 0.1);


    }



    @Test
    public void findWithHighestBalance(){
        UserServis userServis = new UserServis();
        User withHighestBalance = userServis.findWithHighestBalance();

        Assert.assertEquals(Long.valueOf(394645), withHighestBalance.getBalance());

    }
}
