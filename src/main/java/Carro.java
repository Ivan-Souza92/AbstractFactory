

public class Carro {

    MarcaModel car;

    public Carro(AbsFactory fabrica){

        this.car = fabrica.createCar();
    }

    public String exibirMarca()
    {
        return this.car.marca();
    }

    public String exibirModelo(){

        return this.car.modelo();
    }
    public int exibirAno(){

        return this.car.ano();
    }
    public String exibirCambio(){

        return this.car.cambio();
    }
    public String exibirMotor(){

        return this.car.motor();
    }
    public String exibirTipo(){

        return this.car.Tipo();
    }
}
