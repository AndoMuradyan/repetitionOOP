package am.itspace.lesson.spring.ioc;

import org.springframework.stereotype.Component;

@Component
public class Company {
    private Address address;

    public Company(Address address) {
        this.address = address;
    }

    // getter, setter and other properties
}