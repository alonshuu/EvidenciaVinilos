package vista;

import modelo.Vinilo;

import java.util.ArrayList;

public class ColeccionVinilos {
    private ArrayList<Vinilo> vinilos;
    private final int MAX_VINILOS = 100;

    public ColeccionVinilos() {
        vinilos = new ArrayList<>();
    }

    public boolean agregarVinilo(Vinilo vinilo) {
        if (vinilos.size() >= MAX_VINILOS) {
            return false;
        }
        vinilos.add(vinilo);
        return true;
    }

    public boolean buscarVinilo(String artista, String disco) {
        String idBuscado = (artista + "-" + disco).toLowerCase();
        for (Vinilo v : vinilos) {
            if (v.getIdentificador().equals(idBuscado)) {
                return true;
            }
        }
        return false;
    }

    public int contarVinilos() {
        return vinilos.size();
    }

    public int espaciosDisponibles() {
        return MAX_VINILOS - vinilos.size();
    }

    public void listarColeccion() {
        if (vinilos.isEmpty()) {
            System.out.println("La colección está vacía.");
        } else {
            for (Vinilo v : vinilos) {
                System.out.println(v);
            }
        }
    }
}
