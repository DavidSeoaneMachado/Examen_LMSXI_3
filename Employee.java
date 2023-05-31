import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Employee {

    private String first_name;
    private String lastName;

    public Employee(String first_name, String lastName) {
        this.first_name = first_name;
        this.lastName = lastName;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return "{\"employees\":" + gson.toJson(this) + "}";
    }
}
