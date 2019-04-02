package es.fpdual.primero.figuras;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	final Punto punto = new Punto(3,3);
		final Circulo circulo = new Circulo(punto, 3);
		final CirculoVista circuloVista = new CirculoVista();
		
		circuloVista.pintar(circulo);
		final Punto puntoDestino =  new Punto(10, 3);
		circulo.mover(puntoDestino);
		circuloVista.pintar(circulo);

    }
}
