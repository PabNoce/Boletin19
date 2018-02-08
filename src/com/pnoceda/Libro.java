package com.pnoceda;

public class Libro implements Comparable {

    String titulo, autor, ISBN;
    float prezo;
    int unidades;

    public Libro(String titulo, String autor, String ISBN, float prezo, int unidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.prezo = prezo;
        this.unidades = unidades;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + ", prezo=" + prezo + ", unidades=" + unidades;
    }

    @Override
    public int compareTo(Object o) {
        Libro l = (Libro) o;
        if (titulo.compareToIgnoreCase(l.getTitulo()) > 0) {
            return 1;
        } else if (titulo.compareToIgnoreCase(l.getTitulo()) == 0) {
            return 0;
        } else {
            return -1;
        }
    }
}
