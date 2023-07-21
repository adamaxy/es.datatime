import java.time.LocalDate;
import java.time.Year;

public class Main {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        int daysToEndOfMonth = today.lengthOfMonth() - today.getDayOfMonth();
        System.out.println("Giorni mancanti alla fine del mese: " + daysToEndOfMonth);

        Year currentYear = Year.of(today.getYear());
        int daysToEndOfYear = currentYear.length() - today.getDayOfYear();
        System.out.println("Giorni mancanti alla fine dell'anno: " + daysToEndOfYear);
    }
}
