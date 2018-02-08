package com.pnoceda;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Libreria {

    ArrayList<Libro> libreria = new ArrayList<Libro>();

    public void engadir(Libro libro) {
        libreria.add(libro);
    }

    public void vender(String titulo) {
        try {
            for (int i = 0; i < libreria.size(); i++) {
                if (libreria.get(i).getTitulo().equalsIgnoreCase(titulo)) {

                    int unidades = libreria.get(i).getUnidades();
                    if (unidades != 0) {
                        libreria.get(i).setUnidades(unidades - 1);
                    } else {
                        JOptionPane.showMessageDialog(null, "No quedan unidades.");
                    }
                }
            }
        } catch (NullPointerException e) {
            System.out.print("El array es nulo");
        }
    }

    public void amosar() {
        try {
            Collections.sort(libreria);
            for (Libro i : libreria) {
                System.out.println(i.toString());
            }
        } catch (NullPointerException e) {
            System.out.print("El array es nulo");
        }
    }

    public void baixa() {
        try {
            for (int i = 0; i < libreria.size(); i++) {
                if (libreria.get(i).getUnidades() == 0) {
                    libreria.remove(i);
                    i--;
                }
            }
        } catch (NullPointerException e) {
            System.out.print("El array es nulo");
        }
    }

    public void consulta(String titulo) {
        try {
            for (Libro i : libreria) {
                if (i.getTitulo().equalsIgnoreCase(titulo)) {
                    System.out.println(i.toString());
                    break;
                }
            }
        } catch (NullPointerException e) {
            System.out.print("El array es nulo");
        }
    }
}
