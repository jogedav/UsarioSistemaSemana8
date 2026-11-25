public class Administrador extends Usuario {
    private int nivelAdministracion;

    public Administrador(String username, String correo, int nivelAdministracion) {
        super(username, correo);
        this.nivelAdministracion = nivelAdministracion;
    }

    @Override
    public String obtenerPermisos() {
        return "Lectura, Escritura, Eliminacion, Gestion de usuarios";
    }

    @Override
    public String mostrarInformacion() {
        return "[Administrador] " + super.mostrarInformacion()
                + " | Nivel: " + nivelAdministracion
                + " | Permisos: " + obtenerPermisos();
    }
}
