import java.time.LocalDate;

public class Holiday {
    private LocalDate date;
    private String name;

    public Holiday () {}

    public Holiday (LocalDate date, String name) {
        this.date = date;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name.length() == 0) return;
        this.name = name;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        // if (date.length() == 0) return;
        this.date = date;
    }
}
