import java.util.Objects;

public class User {
    public User(String country) {
        this.country = country;
    }

    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    @Override
    public int hashCode() {
        return 1;
    }
}
