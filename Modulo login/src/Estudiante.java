import java.util.Date;

public class Estudiante extends Usuario{
    String codigo;

    public Estudiante(String nombre, String primerApellido, String segundoApellido, String ci, Date fechaNacimiento, String direccion, int celular, int telefono, String email, String usuario, String codigo) {
        super(nombre, primerApellido, segundoApellido, ci, fechaNacimiento, direccion, celular, telefono, email, usuario);
        this.codigo = codigo;
    }
}
