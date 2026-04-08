public class Disco extends Publicacion{
    private float duracion;

    public Disco() {
        this.duracion = 0;
    }

    public Disco(double precio, String titulo, float duracion) {
        super(precio, titulo);
        this.duracion = duracion;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Disco{" +
                "duracion=" + duracion +
                ", Precio=" + getPrecio() +
                ", titulo=" + getTitulo() +
                '}';
    }
}
