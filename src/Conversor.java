import java.util.Scanner;

public class Conversor {
    double temperaturaEmCelsius;
    double resultadoDeKelvin;
    double resultadoDeFahrenheit;

    public void obterDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        temperaturaEmCelsius = leitor.nextDouble();

        calcular();
    }
    public void calcular(){
        resultadoDeKelvin = 273.15 + temperaturaEmCelsius;
        resultadoDeFahrenheit = (temperaturaEmCelsius * 1.8) + 32;

        exibirResultado();
    }
    public void exibirResultado(){
        System.out.println(temperaturaEmCelsius+ "°C (Celsius) equivalem a: ");
        System.out.println(resultadoDeFahrenheit + "°F (fahrenheit)");
        System.out.println(resultadoDeKelvin+ "°K (Kelvin)");
    }
}
