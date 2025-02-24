public class Main {

    public static void main (String [] args) {
        //Es una lista de numeros enteros
        Integer [] intNums = { 1, 2, 3, 4, 5 };
        //Esto creo un objeto Calculator
        Calculator<Integer> intCalc = new Calculator<Integer> (intNums);
        //Aqui se llama al metodo average y se imprime
        System.out.println (intCalc.average ());

        //Esta es otra lista pero de numeros decimales
        Double [] doubleNums = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        //Se crea el objeto pero de tipo de entrada double
        Calculator<Double> doubleCalc = new Calculator<Double> (doubleNums);
        //Se llama al metodo y se imprime
        System.out.println (doubleCalc.average ());

        // esto debe fallar
        //String [] strNums = { "1", "2", "3", "4", "5" };
        //Calculator<String> strCalc = new Calculator<String> (strNums);
        //System.out.println (strCalc.average ());
    }

}