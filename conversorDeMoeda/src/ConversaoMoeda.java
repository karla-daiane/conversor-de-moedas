public class ConversaoMoeda {
    public static void converte(String moedaInicial, String moedafinal, Double valorMoeda) {
        ConsultaExchangeRate consultaExchangeRate = new ConsultaExchangeRate();

        try {
            RespostaExchangeRate resposta = consultaExchangeRate.buscaMoeda(moedaInicial, moedafinal, valorMoeda);
            System.out.printf("""
                    ______________________________________
                    Valor convertido:
                    %s %.2f <=====> %s %.2f
                    
                    Taxa de conversão: %f
                    ______________________________________
                    """, moedaInicial, valorMoeda, moedafinal, resposta.conversion_result(), resposta.conversion_rate());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação.");
        }
    }
}
