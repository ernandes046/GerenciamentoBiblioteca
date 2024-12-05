package br.edu.unisep.biblioteca.modelo;


public class Genero {
}
private String tipo;
public Genero() {
}
public Genero(String tipo) {
    this.tipo = tipo;
}
public String getTipo() {
    return tipo;
}
public void setTipo(String tipo) {
    this.tipo = tipo;
}
@Override
public String toString() {
    return "Genero{" +
            "tipo='" + tipo + '\'' +
            '}';
}
}