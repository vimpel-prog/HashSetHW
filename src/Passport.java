import java.time.LocalDate;
import java.util.Objects;

public class Passport {
    private final int number;
    private final String name;
    private final String surName;
    private final String middleName;
    private final LocalDate localDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return number == passport.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public Passport(int number, String name, String surName, String middleName, LocalDate localDate) {
        this.number = number;
        this.name = name;
        this.surName = surName;
        this.middleName = middleName;
        this.localDate = localDate;
    }
}
