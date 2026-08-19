package modelo;

import java.util.ArrayList;

public class Equipo {
    private int idEquipo;
    private String nombre;
    private ArrayList<Gamer> listaGamers;
    private long puntaje;
    private Gamer lider;

    // Constructor sin parámetros
    public Equipo() {
        this.idEquipo = 0;
        this.nombre = "Equipo" + this.idEquipo;
        this.listaGamers = new ArrayList<Gamer>();
        this.puntaje = 0;
        this.lider = new Gamer();
    }

    // Constructor completo
    public Equipo(int idEquipo, String nombre, ArrayList<Gamer> listaGamers, long puntaje, Gamer lider) {
        this.idEquipo = idEquipo;
        this.nombre = nombre;
        this.listaGamers = listaGamers;
        this.puntaje = puntaje;
        this.lider = lider;
    }

    // Getters y Setters
    public int getIdEquipo() { return idEquipo; }
    public void setIdEquipo(int idEquipo) { this.idEquipo = idEquipo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public ArrayList<Gamer> getListaGamers() { return listaGamers; }
    public void setListaGamers(ArrayList<Gamer> listaGamers) { this.listaGamers = listaGamers; }

    public long getPuntaje() { return puntaje; }
    public void setPuntaje(long puntaje) { this.puntaje = puntaje; }

    public Gamer getLider() { return lider; }
    public void setLider(Gamer lider) { this.lider = lider; }
}
