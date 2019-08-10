package user;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UserServis {

    private List<User> users;

    public UserServis() {
        init();
    }

    private static int compare(User a, User b) {
        Long aBalance = a.getBalance();
        Long bBalance = b.getBalance();

        if (aBalance > bBalance) {
            return 1;

        } else if (aBalance < bBalance) {
            return -1;
        } else {
            return 0;
        }
    }

    private void init() {

        this.users = Arrays.asList(
                new User("Lillian Burgess", Gender.female, 31, "$2,499.49"),
                new User("Bird Ramsey", Gender.male, 23, "$3,946.45"),
                new User("Kristie Cole", Gender.female, 34, "$2,820.18"),
                new User("Leonor Cross", Gender.female, 30, "$3,277.32"),
                new User("Marsh Mccall", Gender.male, 28, "$1,972.47")

        );
    }

    public List<User> findByGender(Gender gender) {

        return users.stream()
                .filter(user -> user.getGender().equals(gender))
                .collect(Collectors.toList());


    }

    public List<String> mapToNames() {

        return users.stream()
                .map(user -> user.getName())
                .collect(Collectors.toList());

    }


    public List<User> sortByAge() {

        return users.stream()
                .sorted((a, b) -> {
                    int aAge = a.getAge();
                    int bAge = b.getAge();

                    if (aAge > bAge) {
                        return 1;

                    } else if (aAge < bAge) {
                        return -1;
                    } else {
                        return 0;
                    }
                })
                .collect(Collectors.toList());
//                .sorted(Comparator.comparingInt(user -> user.getAge()))
    }

    public List<User> sortByBalance() {
        return users.stream()
                .sorted(Comparator.comparingLong(User::getBalance).reversed())
//                .sorted(UserServis::compare)
                .collect(Collectors.toList());


    }


    public double avgBalance() {

        return users.stream()
                .mapToLong(user -> user.getBalance())
                .average()
                .orElse(0.0);

    }

    public User findWithHighestBalance(){

        return sortByBalance().stream()
                .findFirst()
                .orElse(null);

    }


}