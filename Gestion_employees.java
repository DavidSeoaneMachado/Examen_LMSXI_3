import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class Gestion_employees {
    public static void main(String[] args) {
        ArrayList<Employee> arrayList = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader("employees.json");

            // Leer el fichero JSON
            Gson gson = new Gson();

            // Obtener el tipo de datos para el ArrayList<Employee>
            Type employeeListType = new TypeToken<ArrayList<Employee>>() {}.getType();

            // Deserializar el JSON en un ArrayList<Employee>
            arrayList = gson.fromJson(fileReader, employeeListType);

            // Imprimir los empleados del ArrayList
            for (Employee employee : arrayList) {
                System.out.println("First Name: " + employee.getFirst_name());
                System.out.println("Last Name: " + employee.getLastName());
                System.out.println("--------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}