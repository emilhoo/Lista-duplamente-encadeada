package celula;

import Basicas.Contato;

public class Celula {

    private Celula proxima;
    private Celula anterior;
    private Object elemento;
    private Contato contato;

    public Celula(Contato contato) {
        this.contato = contato;
        this.proxima = null;
        this.anterior = null;
    }

    public Contato getContato() {
        return contato;
    }

    public Celula(Object elemento) {
        this.elemento = elemento;
    }

    public Celula(Celula proxima, Celula anterior, Object elemento) {
        this.proxima = proxima;
        this.anterior = anterior;
        this.elemento = elemento;
    }

    public Celula getProxima() {
        return proxima;
    }

    public void setProxima(Celula proxima) {
        this.proxima = proxima;
    }

    public Celula getAnterior() {
        return anterior;
    }

    public void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    @Override
    public String toString() {
        return "Celula [elemento=" + elemento + "]";
    }
}
