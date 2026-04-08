public class Publicacion {
    private double precio;
    private String titulo;

    public Publicacion() {
        this.precio = 0;
        this.titulo = "";
    }

    public Publicacion(double precio, String titulo) {
        this.precio = precio;
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Publicacione{" +
                "precio=" + precio +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
