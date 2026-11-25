public class Soporte extends Usuario {
    private String area;

    public Soporte(String username, String correo, String area) {
        super(username, correo);
        this.area = area;
    }

    @Override
    public String obtenerPermisos() {
        return "Lectura, Atencion de tickets";
    }

    @Override
    public String mostrarInformacion() {
        return "[Soporte] " + super.mostrarInformacion()
                + " | Area: " + area
                + " | Permisos: " + obtenerPermisos();
    }
}
