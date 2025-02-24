public class Calculator<T> {
    private T[] numbers;

    //Constructor
    public Calculator(T[] numbers) {
        this.numbers = numbers;
    }

    //Metodo para el promedio
    public double average() {
        //Si el arreglo esta vacio o es nulo
        if (numbers == null || numbers.length == 0) {
            //Marcamos el error
            throw new IllegalArgumentException("Error: El array no puede ser nulo o vacio");
        }

        double sum = 0.0;
        for (T number : numbers) {
            if (!(number instanceof Number)) {
                throw new IllegalArgumentException("Error: El array solo puede contener numeros ");
            }
            sum += ((Number) number).doubleValue(); // Convertimos a double
        }

        //Regresar el output
        return sum / numbers.length;
    }
}
