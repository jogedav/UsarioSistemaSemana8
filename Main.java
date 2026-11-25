public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Administrador("admin1", "admin@demo.com", 3);
        Usuario u2 = new Desarrollador("dev1", "dev@demo.com", "Java");
        Usuario u3 = new Cliente("cliente1", "cliente@demo.com", "Premium");
        Usuario u4 = new Soporte("soporte1", "soporte@demo.com", "Mesa de ayuda");

        SistemaUsuarios sistema = new SistemaUsuarios();
        sistema.agregarUsuario(u1);
        sistema.agregarUsuario(u2);
        sistema.agregarUsuario(u3);

        System.out.println("=== Usuarios del sistema ===");
        System.out.println(sistema.mostrarUsuarios());

        System.out.println("=== Permisos ===");
        System.out.println(u1.getUsername() + ": " + u1.obtenerPermisos());
        System.out.println(u2.getUsername() + ": " + u2.obtenerPermisos());
        System.out.println(u3.getUsername() + ": " + u3.obtenerPermisos());

        System.out.println("\n=== Busqueda ===");
        Usuario encontrado = sistema.buscarUsuario("dev1");
        if (encontrado != null) {
            System.out.println("Encontrado: " + encontrado.mostrarInformacion());
        }
        if (sistema.buscarUsuario("nadie") == null) {
            System.out.println("Usuario nadie no encontrado");
        }

        System.out.println("\n=== Eliminacion ===");
        System.out.println("Eliminar cliente1: " + sistema.eliminarUsuario("cliente1"));
        System.out.println("Eliminar nadie: " + sistema.eliminarUsuario("nadie"));
        System.out.println(sistema.mostrarUsuarios());

        System.out.println("=== Desafio: Soporte ===");
        sistema.agregarUsuario(u4);
        System.out.println(sistema.mostrarUsuarios());
    }
}
