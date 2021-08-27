

public class NewCar implements MarcaModel {
    @Override
    public String marca() {
        return "Toyota";
    }

    @Override
    public String modelo() {
        return "Toyota Corolla";
    }

    @Override
    public int ano() {
        return 2020;
    }

    @Override
    public String cambio() {
        return "Automático";
    }

    @Override
    public String motor() {
        return "2.0";
    }

    @Override
    public String Tipo() {
        return "Básico";
    }

}
