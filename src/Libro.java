public class Libro extends Publicacion {
    private int numeroPaginas;
    private int anioPublicacion;

    public Libro() {
        this.numeroPaginas = 0;
        this.anioPublicacion = 0;
    }

    public Libro(double precio, String titulo, int numeroPaginas, int anioPublicacion) {
        super(precio, titulo);
        this.numeroPaginas = numeroPaginas;
        this.anioPublicacion = anioPublicacion;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "numeroPaginas=" + numeroPaginas +
                ", anioPublicacion=" + anioPublicacion +
                ", Precio=" + getPrecio() +
                ", titulo=" + getTitulo() +
                '}';
    }
}
