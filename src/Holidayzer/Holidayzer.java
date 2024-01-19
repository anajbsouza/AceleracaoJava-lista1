import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Holidayzer {
    private List<Holiday> holidays;
    private DateTimeFormatter dateFormatter;
    
    public Holidayzer () {
        holidays = new ArrayList<>();
    
        holidays.add(new Holiday(LocalDate.of(2024, 1, 1), "Ano Novo"));
        holidays.add(new Holiday(LocalDate.of(2024, 2, 10), "Carnaval"));
        holidays.add(new Holiday(LocalDate.of(2024, 2, 14), "Quarta-feira de Cinzas"));
        holidays.add(new Holiday(LocalDate.of(2024, 3, 29), "Sexta-feira Santa"));
        holidays.add(new Holiday(LocalDate.of(2024, 3, 31), "Páscoa"));
        holidays.add(new Holiday(LocalDate.of(2024, 4, 21), "Tiradentes"));
        holidays.add(new Holiday(LocalDate.of(2024, 5, 1), "Dia do Trabalho"));
        holidays.add(new Holiday(LocalDate.of(2024, 5, 30), "Corpus Christi"));
        holidays.add(new Holiday(LocalDate.of(2024, 9, 7), "Independência do Brasil"));
        holidays.add(new Holiday(LocalDate.of(2024, 10, 12), "Nossa Senhora Aparecida e Dia das Crianças"));
        holidays.add(new Holiday(LocalDate.of(2024, 11, 2), "Finados"));
        holidays.add(new Holiday(LocalDate.of(2024, 11, 15), "Proclamação da República"));
        holidays.add(new Holiday(LocalDate.of(2024, 12, 25), "Natal"));

        dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    }

    // Uma função que imprime a lista com todos os feriados
    public void printHolidays () {
        for (Holiday holi : holidays) {
            System.out.println(holi.getName() + " - " + holi.getDate().format(dateFormatter));
        }
    }

    // - Uma função que recebe uma data como parâmerto e retorna uma mensagem.
    //     - Se o dia não for feriado, imprime: “Dia <data-inserida> não é feriado 🥲”
    //     - Se o dia for feriado, retorna: “Dia <data-inserida> é <nome-do-feriado>! 🎉”
    public String verifyHoliday(String insertedDate) {
        LocalDate formattedDate = LocalDate.parse(insertedDate, dateFormatter);
        
        for (Holiday holi : holidays) {
            if (holi.getDate().equals(formattedDate)) {
                return "Dia " +  formattedDate.format(dateFormatter) + " é " + holi.getName() + "! 🎉";
            }
        }
        return "Dia " + formattedDate.format(dateFormatter) + " não é feriado 🥲";
    }

    public static void main(String[] args) {
        Holidayzer calendar = new Holidayzer();
        calendar.printHolidays();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma data (formato dd/MM/yyyy): ");
        String dataInput = scanner.next();
        String message = calendar.verifyHoliday(dataInput);
        System.out.println(message);

        scanner.close();
    }
}





