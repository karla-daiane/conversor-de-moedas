import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcao = "";
        String moedaInicial = "";
        String moedaFinal = "";
        double valorMoeda;

        while (!opcao.equals("0")) {
            System.out.print("""
                    
                    Conversor de Moedas:
                    1  - BRL (Real Brasileiro) <-----> USD (Dólar Americano)
                    2  - USD (Dólar Americano) <-----> BRL (Real Brasileiro)
                    3  - BRL (Real Brasileiro) <-----> EUR (Euro)
                    4  - EUR (Euro)            <-----> BRL (Real Brasileiro)
                    5  - USD (Dólar Americano) <-----> EUR (Euro)
                    6  - EUR (Euro)            <-----> USD (Dólar Americano)
                    7  - BRL (Real Brasileiro) <-----> ARS (Peso Argentino)
                    8  - ARS (Peso Argentino)  <-----> BRL (Real Brasileiro)
                    9  - BRL (Real Brasileiro) <-----> JPY (Iene Japonês)
                    10 - JPY (Iene Japonês)    <-----> BRL (Real Brasileiro)
                    0  - SAIR
                    Digite a opção escolhida:
                    ->\s""");
            opcao = sc.nextLine();

            switch (opcao) {
                case "1":
                    moedaInicial = "BRL";
                    moedaFinal = "USD";
                    break;
                case "2":
                    moedaInicial = "USD";
                    moedaFinal = "BRL";
                    break;
                case "3":
                    moedaInicial = "BRL";
                    moedaFinal = "EUR";
                    break;
                case "4":
                    moedaInicial = "EUR";
                    moedaFinal = "BRL";
                    break;
                case "5":
                    moedaInicial = "USD";
                    moedaFinal = "EUR";
                    break;
                case "6":
                    moedaInicial = "EUR";
                    moedaFinal = "USD";
                    break;
                case "7":
                    moedaInicial = "BRL";
                    moedaFinal = "ARS";
                    break;
                case "8":
                    moedaInicial = "ARS";
                    moedaFinal = "BRL";
                    break;
                case "9":
                    moedaInicial = "BRL";
                    moedaFinal = "JPY";
                    break;
                case "10":
                    moedaInicial = "JPY";
                    moedaFinal = "BRL";
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Opção escolhida inválida.");
                    break;
            }
            if (opcao.equals("0")) {
                System.out.println("\nFinalizando Conversor de Moedas...");
                break;
            }
            System.out.println("Digite o valor: ");
            valorMoeda = sc.nextDouble();
            sc.nextLine();
            ConversaoMoeda.converte(moedaInicial, moedaFinal, valorMoeda);


        }
        sc.close();
    }
}