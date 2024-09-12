package co.edu.uniquindio.GestionEmpleados.factory;

public class ModelFactory {
    private static ModelFactory instance;

    private ModelFactory() {}

    public static ModelFactory getInstance() {
        if (instance == null) {
            instance = new ModelFactory();
        }
        return instance;
    }


}