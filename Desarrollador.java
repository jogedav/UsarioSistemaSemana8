public class Desarrollador extends Usuario {
    private String lenguaje;

    public Desarrollador(String username, String correo, String lenguaje) {
        super(username, correo);
        this.lenguaje = lenguaje;
    }

    @Override
    public String obtenerPermisos() {
        return "Lectura, Escritura, Despliegue";
    }

    @Override
    public String mostrarInformacion() {
        return "[Desarrollador] " + super.mostrarInformacion()
                + " | Lenguaje: " + lenguaje
                + " | Permisos: " + obtenerPermisos();
    }
}
