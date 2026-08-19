package modelo;

public class Gamer {
    private int idGamer;
    private String nombre;
    private String usuario;
    private String password;
    private long puntaje;
    private String nivel;

    // Constructor pero sin parametros
    public Gamer() {
        this.idGamer = 0;
        this.nombre = "Gamer" + this.idGamer;
        this.usuario = "User" + this.idGamer;
        this.password = "";
        this.puntaje = 0;
        this.nivel = "Principiante";
    }

    // Constructor total.
    public Gamer(int idGamer, String nombre, String usuario, String password, long puntaje, String nivel) {
        this.idGamer = idGamer;
        this.nombre = nombre;
        this.usuario = usuario;
        this.password = password;
        this.puntaje = puntaje;
        this.nivel = nivel;
    }

    // Getters Setters
    public int getIdGamer() { return idGamer; }
    public void setIdGamer(int idGamer) { this.idGamer = idGamer; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public long getPuntaje() { return puntaje; }
    public void setPuntaje(long puntaje) { this.puntaje = puntaje; }

    public String getNivel() { return nivel; }
    public void setNivel(String nivel) { this.nivel = nivel; }
}