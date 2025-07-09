import java.time.LocalDate;

public class Paciente {
    double peso;
    double altura;

    public double calcularIndiceDeMassaCorporal(double peso, double altura){
        return (peso /( altura * altura));
    }
}
