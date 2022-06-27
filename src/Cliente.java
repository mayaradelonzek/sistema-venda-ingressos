import java.time.LocalDate;
import java.time.Period;

public class Cliente {

    private final LocalDate dataNascimento;
    private Boolean isEstudante;

    public Cliente(LocalDate dataNascimento, Boolean isEstudante) {
        this.dataNascimento = dataNascimento;
        this.isEstudante = isEstudante;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public Boolean getEstudante() {
        return isEstudante;
    }

    public Boolean isIdoso() {
        int verificaIdade = Period.between(dataNascimento, LocalDate.now()).getYears();

        return verificaIdade >= 60;
    }
}
