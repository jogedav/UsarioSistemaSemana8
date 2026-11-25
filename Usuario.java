public class Usuario {
    private String username;
    private String correo;

    public Usuario(String username, String correo) {
        this.username = username;
        this.correo = correo;
    }

    public String getUsername() {
        return username;
    }

    public String obtenerPermisos() {
        return "Lectura";
    }

    public String mostrarInformacion() {
        return "Usuario: " + username + " | Correo: " + correo;
    }
}
