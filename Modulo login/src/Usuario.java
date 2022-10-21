import java.util.Date;

public class Usuario extends Persona{
    String usuario;
    String contraseña;

    public Usuario(String nombre, String primerApellido, String segundoApellido, String ci, Date fechaNacimiento, String direccion, int celular, int telefono, String email, String usuario) {
        super(nombre, primerApellido, segundoApellido, ci, fechaNacimiento, direccion, celular, telefono, email);
        this.usuario = usuario;
    }
}
