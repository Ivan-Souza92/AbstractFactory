
public class FabricaCar implements AbsFactory{
    @Override
    public MarcaModel createCar() {
        return new NewCar();
    }
}
