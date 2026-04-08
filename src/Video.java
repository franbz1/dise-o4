public class Video extends Publicacion{
    private float duracionHoras;

    public Video() {
        this.duracionHoras = 0;
    }

    public Video(double precio, String titulo, float duracionHoras) {
        super(precio, titulo);
        this.duracionHoras = duracionHoras;
    }

    @Override
    public String toString() {
        return "Video{" +
                "duracionHoras=" + duracionHoras +                 ", Precio=" + getPrecio() +
                ", titulo=" + getTitulo() +
                '}';
    }
}