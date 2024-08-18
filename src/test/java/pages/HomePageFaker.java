package pages;

import com.github.javafaker.Faker;

public class HomePageFaker {

    private Faker faker;

    public HomePageFaker() {
        this.faker = new Faker();
    }

    public String getFakePassword() {

        return faker.internet().password(8, 16);
    }

    public String getFakeFirstname() {

        return faker.name().firstName();
    }

    public String getFakeLastName() {

        return faker.name().lastName();
    }

    public String getFakeCity() {

        return faker.address().city();
    }

    public String getFakeState() {

        return faker.address().state();
    }

    public String getFakeZip() {

        return faker.address().zipCode();
    }

    public String getFakeAddress() {

        return faker.address().streetAddress() + ", " +
                getFakeZip() + ", " +
                faker.company().name();
    }

    public String getFakePhoneNumber() {

        return faker.phoneNumber().phoneNumber();
    }
}