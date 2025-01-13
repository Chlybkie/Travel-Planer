import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TripStop {
    String name;
    String description;
    String address;
    LocalDate visitDate;

    public TripStop(String name, String description, String address, int day, int month, int year) throws IllegalArgumentException{
        LocalDate temp = LocalDate.of(year, month,day);
        if ( !name.isBlank() && !description.isBlank() && !address.isBlank() && temp.isAfter(LocalDate.now())) {
            this.name = name;
            this.description = description;
            this.address = address;
            this.visitDate = temp;
        }
        else {
            System.out.println("Enter proper trip details: ");
        }

    }

    @Override
    public String toString() {
        return "Destination: " + name + ", description: " + description + ", address: " + address + " , visit date: " + DateTimeFormatter.ofLocalizedDate();
    }

    public void setVisitDate(LocalDate visitDate) throws DateTimeException {
        if (visitDate.isBefore(LocalDate.now())){
            System.out.println("Please enter a valid date: ");
        }
        else {
            this.visitDate = visitDate;
        }

    }


}