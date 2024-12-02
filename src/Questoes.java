import java.util.Scanner;

public class Questoes {
    String pergunta;
    String opcaoA;
    String opcaoB;
    String opcaoC;
    String opcaoD;
    String opcaoE;
    String correta;

    //
    public boolean isCorreta(String resposta) {
        if (resposta.equalsIgnoreCase(this.correta)) {
            System.out.println("Parabéns! Resposta Correta - Letra: " + this.correta);
            System.out.println("");
            return true;
        } else {
            System.out.println("Resposta Errada!");
            System.out.println("A opção correta é a letra: " + this.correta);
            System.out.println("");
            return false;
        }
    }

    //
    public String leiaResposta() {
        Scanner ler = new Scanner(System.in);
        String resp;
        do {
            System.out.println("Digite a resposta (A, B, C, D ou E): ");
            resp = ler.next();
        } while (!respostaValida(resp));
        return resp;
    }

    //
    private boolean respostaValida(String resp) {
        if (resp.equalsIgnoreCase("A") || resp.equalsIgnoreCase("B") || resp.equalsIgnoreCase("C") ||
                resp.equalsIgnoreCase("D") || resp.equalsIgnoreCase("E")) {
            return true;
        }
        System.out.println("Resposta inválida! Digite opção A, B, C, D ou E. ");
        System.out.println("");
        return false;
    }

    // a
    public void escrevaQuestao() {
        System.out.println(this.pergunta);
        System.out.println();
        System.out.println(this.opcaoA);
        System.out.println(this.opcaoB);
        System.out.println(this.opcaoC);
        System.out.println(this.opcaoD);
        System.out.println(this.opcaoE);
        System.out.println();
    }
}

class TestaQuestoes {
    public static void escrevaCabecalho() {
        System.out.println("Faculdade: Alfredo Nasser");
        System.out.println("Aluno: Matheus Paulo Cavalcante");
        System.out.println("Professor: Breno");
        System.out.println();
        System.out.println("Bem-vindo ao Quiz de Filmes! Responda às perguntas e veja quantas acerta.");
        System.out.println();
    }

    public static void main(String[] args) {
        escrevaCabecalho();
        // Criar um array de objetos Questoes para armazenar as 15 perguntas
        Questoes[] questoes = new Questoes[15];
        Scanner scanner = new Scanner(System.in);
        int acertos = 0;

        // Inicializar as perguntas
        for (int i = 0; i < 15; i++) {
            questoes[i] = new Questoes();
        }

        // Definindo as perguntas e as opções manualmente (exemplo de 3 perguntas)
        // Definindo as perguntas e as opções
        questoes[0].pergunta = "1 - Qual filme ganhou o Oscar de Melhor Filme em 1994?";
        questoes[0].opcaoA = "A) Forrest Gump";
        questoes[0].opcaoB = "B) Pulp Fiction";
        questoes[0].opcaoC = "C) Um Sonho de Liberdade";
        questoes[0].opcaoD = "D) O Rei Leão";
        questoes[0].opcaoE = "E) Beleza Americana";
        questoes[0].correta = "A";

        questoes[1].pergunta = "2 - Quem interpretou o Coringa em 'O Cavaleiro das Trevas' (2008)?";
        questoes[1].opcaoA = "A) Joaquin Phoenix";
        questoes[1].opcaoB = "B) Heath Ledger";
        questoes[1].opcaoC = "C) Jack Nicholson";
        questoes[1].opcaoD = "D) Jared Leto";
        questoes[1].opcaoE = "E) Mark Hamill";
        questoes[1].correta = "B";

        questoes[2].pergunta = "3 - Qual foi o primeiro filme da saga 'Star Wars' a ser lançado?";
        questoes[2].opcaoA = "A) Star Wars: Episódio I - A Ameaça Fantasma";
        questoes[2].opcaoB = "B) Star Wars: Episódio IV - Uma Nova Esperança";
        questoes[2].opcaoC = "C) Star Wars: Episódio VI - O Retorno de Jedi";
        questoes[2].opcaoD = "D) Star Wars: Episódio III - A Vingança dos Sith";
        questoes[2].opcaoE = "E) Star Wars: Episódio V - O Império Contra-Ataca";
        questoes[2].correta = "B";

        questoes[3].pergunta = "4 - Qual o nome do filme em que Tom Hanks vive um homem preso em um aeroporto?";
        questoes[3].opcaoA = "A) Náufrago";
        questoes[3].opcaoB = "B) Forrest Gump";
        questoes[3].opcaoC = "C) O Terminal";
        questoes[3].opcaoD = "D) Apollo 13";
        questoes[3].opcaoE = "E) O Resgate do Soldado Ryan";
        questoes[3].correta = "C";

        questoes[4].pergunta = "5 - Qual foi o primeiro filme do Universo Cinematográfico da Marvel (MCU)?";
        questoes[4].opcaoA = "A) O Incrível Hulk";
        questoes[4].opcaoB = "B) Homem de Ferro";
        questoes[4].opcaoC = "C) Thor";
        questoes[4].opcaoD = "D) Capitão América: O Primeiro Vingador";
        questoes[4].opcaoE = "E) Os Vingadores";
        questoes[4].correta = "B";

        questoes[5].pergunta = "6 - Quem dirigiu o filme 'A Origem' (Inception) em 2010?";
        questoes[5].opcaoA = "A) Steven Spielberg";
        questoes[5].opcaoB = "B) Quentin Tarantino";
        questoes[5].opcaoC = "C) Christopher Nolan";
        questoes[5].opcaoD = "D) James Cameron";
        questoes[5].opcaoE = "E) Ridley Scott";
        questoes[5].correta = "C";

        questoes[6].pergunta = "7 - Em qual filme podemos encontrar o personagem Jack Dawson?";
        questoes[6].opcaoA = "A) Gladiador";
        questoes[6].opcaoB = "B) Titanic";
        questoes[6].opcaoC = "C) O Grande Gatsby";
        questoes[6].opcaoD = "D) Coração Valente";
        questoes[6].opcaoE = "E) Pearl Harbor";
        questoes[6].correta = "B";

        questoes[7].pergunta = "8 - Qual filme popularizou a frase: 'Eu sou o rei do mundo!'?";
        questoes[7].opcaoA = "A) Avatar";
        questoes[7].opcaoB = "B) Titanic";
        questoes[7].opcaoC = "C) O Rei Leão";
        questoes[7].opcaoD = "D) Gladiador";
        questoes[7].opcaoE = "E) Braveheart";
        questoes[7].correta = "B";

        questoes[8].pergunta = "9 - Qual filme de ficção científica foi dirigido por Ridley Scott em 1982?";
        questoes[8].opcaoA = "A) Blade Runner";
        questoes[8].opcaoB = "B) Alien";
        questoes[8].opcaoC = "C) 2001: Uma Odisseia no Espaço";
        questoes[8].opcaoD = "D) O Exterminador do Futuro";
        questoes[8].opcaoE = "E) Matrix";
        questoes[8].correta = "A";

        questoes[9].pergunta = "10 - Qual o nome do filme de 1999, estrelado por Keanu Reeves, que envolve realidade virtual?";
        questoes[9].opcaoA = "A) Matrix";
        questoes[9].opcaoB = "B) Johnny Mnemonic";
        questoes[9].opcaoC = "C) O Homem Duplo";
        questoes[9].opcaoD = "D) Constantine";
        questoes[9].opcaoE = "E) Speed";
        questoes[9].correta = "A";

        questoes[10].pergunta = "11 - Qual o nome do vilão no primeiro filme dos 'Vingadores' (2012)?";
        questoes[10].opcaoA = "A) Ultron";
        questoes[10].opcaoB = "B) Thanos";
        questoes[10].opcaoC = "C) Loki";
        questoes[10].opcaoD = "D) Hela";
        questoes[10].opcaoE = "E) Ego";
        questoes[10].correta = "C";

        questoes[11].pergunta = "12 - Quem dirigiu 'Pulp Fiction' (1994)?";
        questoes[11].opcaoA = "A) Martin Scorsese";
        questoes[11].opcaoB = "B) Francis Ford Coppola";
        questoes[11].opcaoC = "C) Quentin Tarantino";
        questoes[11].opcaoD = "D) Steven Spielberg";
        questoes[11].opcaoE = "E) Stanley Kubrick";
        questoes[11].correta = "C";

        questoes[12].pergunta = "13 - Qual filme de super-herói arrecadou mais de 2 bilhões de dólares mundialmente?";
        questoes[12].opcaoA = "A) Homem-Aranha: Sem Volta Para Casa";
        questoes[12].opcaoB = "B) Os Vingadores";
        questoes[12].opcaoC = "C) Vingadores: Ultimato";
        questoes[12].opcaoD = "D) Pantera Negra";
        questoes[12].opcaoE = "E) Batman: O Cavaleiro das Trevas";
        questoes[12].correta = "C";

        questoes[13].pergunta = "14 - Em que ano foi lançado o filme original 'Jurassic Park'?";
        questoes[13].opcaoA = "A) 1990";
        questoes[13].opcaoB = "B) 1991";
        questoes[13].opcaoC = "C) 1992";
        questoes[13].opcaoD = "D) 1993";
        questoes[13].opcaoE = "E) 1994";
        questoes[13].correta = "D";

        questoes[14].pergunta = "15 - Qual personagem diz 'Que a Força esteja com você' em 'Star Wars'?";
        questoes[14].opcaoA = "A) Luke Skywalker";
        questoes[14].opcaoB = "B) Han Solo";
        questoes[14].opcaoC = "C) Obi-Wan Kenobi";
        questoes[14].opcaoD = "D) Darth Vader";
        questoes[14].opcaoE = "E) Leia Organa";
        questoes[14].correta = "C";


        // Continue definindo as perguntas e opções até a 15ª pergunta
        // Adicione todas as outras perguntas aqui.

        // Executando o loop para as 15 perguntas
        for (int i = 0; i < 15; i++) {
            questoes[i].escrevaQuestao();  // Exibe a pergunta
            String resposta = questoes[i].leiaResposta();  // Lê a resposta do usuário

            if (questoes[i].isCorreta(resposta)) {
                acertos++;  // Incrementa o contador de acertos se a resposta estiver correta
            }
        }

        // Exibe o total de acertos no final
        System.out.println("Você acertou " + acertos + " de 15 perguntas. Parabens!");

        // Exibe o total de acertos e a porcentagem no final
        double porcentagem = ((double) acertos / 15) * 100;
        System.out.printf("Sua porcentagem de acertos é: %.2f%%\n", porcentagem);
    }
}

