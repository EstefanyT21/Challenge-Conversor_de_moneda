import API.ConversorApi;
import API.ConvertirMoneda;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner lectura = new Scanner(System.in);
        int item,valorValido=1,bucle=1;
        String moneda1="",moneda2="";
        double valorMoneda1;

        System.out.println("Bienvenidos al convertidor de moneda Exchange Rate");

        while (bucle==1){
            System.out.println("""
                \nSeleccione la conversión que desea realizar:
                1. Dólar → Peso argentino
                2. Peso argentino → Dólar
                3. Dólar → Peso chileno
                4. Peso chileno → Dólar
                5. Dólar → Peso colombiano
                6. Peso colombiano → Dólar
                7. Salir
                """);
            item= lectura.nextInt();
            switch (item){
                case 1:
                    moneda1="USD";
                    moneda2="ARS";
                    break;
                case 2:
                    moneda1="ARS";
                    moneda2="USD";
                    break;
                case 3:
                    moneda1="USD";
                    moneda2="CLP";
                    break;
                case 4:
                    moneda1="CLP";
                    moneda2="USD";
                    break;
                case 5:
                    moneda1="USD";
                    moneda2="COP";
                    break;
                case 6:
                    moneda1="COP";
                    moneda2="USD";
                    break;
                case 7:
                    bucle=0;
                    break;
                default:
                    System.out.println("Error. El número ingresado no es válido");
                    valorValido=0;
            }

            if (valorValido==1 && bucle==1){

                System.out.println("Ingresa el valor que deseas convertir: ");
                valorMoneda1=lectura.nextDouble();

                ConvertirMoneda convertirMoneda = new ConvertirMoneda();
                ConversorApi conversion = convertirMoneda.convertir(moneda1+"/"+moneda2+"/"+valorMoneda1);
                System.out.println(valorMoneda1+" "+moneda1+" equivale a "+conversion+" "+moneda2);
            }
        }
        System.out.println("\nProceso finalizado. Gracias por utilizar nuestro servicio");
    }
}
