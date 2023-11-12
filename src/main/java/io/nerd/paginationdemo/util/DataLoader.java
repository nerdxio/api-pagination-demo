package io.nerd.paginationdemo.util;

import com.github.javafaker.Faker;
import io.nerd.paginationdemo.model.Address;
import io.nerd.paginationdemo.model.Person;
import io.nerd.paginationdemo.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.stream.IntStream;

@Configuration
public class DataLoader {

    private Logger logger = LoggerFactory.getLogger(DataLoader.class);
    private final PersonRepository personRepository;
    private final Faker faker;

    public DataLoader(PersonRepository personRepository) {
        this.personRepository = personRepository;
        this.faker = new Faker();
    }

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            logger.info("Loading data...");

            List<Person> list = IntStream.rangeClosed(1, 100)
                    .mapToObj(i -> new Person(
                            faker.name().firstName(),
                            faker.name().lastName(),
                            faker.phoneNumber().phoneNumber(),
                            faker.internet().emailAddress(),
                            new Address(
                                    faker.address().streetAddress(),
                                    faker.address().city(),
                                    faker.address().state(),
                                    faker.address().zipCode()
                            )
                    )).toList();

            personRepository.saveAll(list);

        };
    }
}
