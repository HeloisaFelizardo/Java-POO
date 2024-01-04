O método Karvonen permite calcular a frequência cardíaca alvo para exercício físico. A frequência cardíaca alvo é calculada com a fórmula (frequência cardíaca máxima - frequência cardíaca em repouso) _ (percentagem da frequência cardíaca alvo) + frequência cardíaca em repouso, onde a frequência cardíaca alvo é dada como uma percentagem da frequência cardíaca máxima.
Por exemplo, se uma pessoa tem uma frequência cardíaca máxima de 200, uma frequência cardíaca em repouso de 50 e uma frequência cardíaca alvo de 75% da frequência cardíaca máxima, a frequência cardíaca alvo deve ser cerca de ((200-50) _ ( 0,75) + 50), ou seja, 162,5 batimentos por minuto.

Crie uma classe chamada Fitbyte. Seu construtor leva como parâmetros a idade e a frequência cardíaca em repouso. O assistente de exercício deve fornecer um método targetHeartRate, ao qual é passado um número do tipo double como parâmetro que representa uma parcela percentual da frequência cardíaca máxima. A proporção é dada como um número entre zero e um. A aula deverá ter:

Um construtor public Fitbyte(int age, int restingHeartRate)
Um método public double targetHeartRate(double percentOfMaximum) que calcula e retorna a frequência cardíaca alvo.
Use a fórmula 206,3 - (0,711 \* idade) para calcular a frequência cardíaca máxima.

Use case:

    Fitbyte assistant = new Fitbyte(30, 60);
    double percentage = 0.5;
    while (percentage < 1.0) {
        double target = assistant.targetHeartRate(percentage);
        System.out.println("Target " + (percentage * 100) + "% of maximum: " + target);
        percentage = percentage + 0.1;
    }

Sample output:

    Target 50.0% of maximum: 122.48500000000001
    Target 60.0% of maximum: 134.98200000000003
    Target 70.0% of maximum: 147.479
    Target 80.0% of maximum: 159,976
    Target 89.99999999999999% of maximum: 172.473
    Target 99.99999999999999% of maximum: 184.97000000000003
