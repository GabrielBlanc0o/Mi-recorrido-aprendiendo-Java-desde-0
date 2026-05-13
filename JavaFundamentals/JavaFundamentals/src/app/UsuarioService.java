package app;

public class UsuarioService {

    // definir constantes a usar

    private static final int EDAD_MINIMA = 16;
    private static final double PESO_MINIMO = 50.0;

    public boolean esAptoParaEntrenamiento(Usuario usuario){

        if (usuario == null){
            return false;
        }
        //logica pura de lo q queremos hacer
        boolean tieneEdadSuficiente = usuario.getEdad() >= EDAD_MINIMA;
        boolean tienenPesoSuficiente = usuario.getPeso() >=PESO_MINIMO;

        return  tieneEdadSuficiente && tienenPesoSuficiente;

    }
}
