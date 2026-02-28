public class Nodo {

    // Nombre de la rutina (ejemplo: PROCESAR, SUMAR, etc.)
    private String nombreRutina;

    // Tipo de retorno de la rutina (ejemplo: int, float, void)
    private String tipoRetorno;

    // Constructor: recibe los datos al crear un nodo
    public Nodo(String nombreRutina, String tipoRetorno) {
        this.nombreRutina = nombreRutina; // Guarda el nombre
        this.tipoRetorno = tipoRetorno;   // Guarda el tipo de retorno
    }

    // Devuelve la informacion del nodo en formato texto
    public String getInfo() {
        return "Rutina: " + nombreRutina + " | Tipo retorno: " + tipoRetorno;
    }
}