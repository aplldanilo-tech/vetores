import java.util.Scanner;

public class vetores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite O TamenhomDo Vetor");

        int tamanhoDoVetor = sc.nextInt();
        String[] vetorDoUsuario = new String[tamanhoDoVetor];

        sc.nextLine();
        for (int i = 0; i < tamanhoDoVetor.; i++) {
            System.out.println("Digite  O Valor Da Posição " + i + " Do Seu Vetor");
            vetorDoUsuario[i] = sc.nextLine();

        }
        // se deixar o metodo do vetorDoUsuario dentor do bloco {} do exemple do bloco main ele ira exibir cada vetor como zero//
        exibirVetor(vetorDoUsuario);

        System.out.println("\nDigite um Valor Que Multiplicara cada Posição do Vetor");
        String palavraASerAcrescida = sc.nextLine();

        System.out.println("\nVeja Os Valores Criado Por Voçê com As palavra a ser acrescida que voçe escolheu em cada posição");
        for (int i = 0; i < vetorDoUsuario.length; i++) {
            vetorDoUsuario[i] = vetorDoUsuario[i].concat(palavraASerAcrescida).toUpperCase();
            char primeiraLetra = vetorDoUsuario[i].charAt(a,e,i,o,u);
            vetorDoUsuario[i] = vetorDoUsuario[i].concat(String.valueOf(primeiraLetra));
        }



        System.out.println("Digite uma o Tamanha do Vetor Da Mensagem");
        int TamanahDamensagem = sc.nextInt();
        String[] entranda = new String[TamanahDamensagem];
        sc.nextLine();

        for (int i = 0; i < TamanahDamensagem; i++) {
            System.out.println("Digite A Primeira Mensagem");
            entranda[i] = sc.nextLine();

            for (int j = i; j < entranda.length; j++) {
                System.out.println("Digite A Segunda Mensagem");
                entranda[j] = sc.nextLine();
                if (entranda[j].length() > entranda[i].length()) {
                    String aux = entranda[j];
                    entranda[i] = entranda[j];
                    entranda[j] = aux;
                    System.out.println(entranda);

                }
            }
        }
          exibirVetor(vetorDoUsuario);
         sc.close();
    }
            private static void exibirVetor (String[]vetorDoUsuario){
                System.out.println("Veja Os Valores Do Vetor Criada Por Voçê:");
                for (int i = 0; i < vetorDoUsuario.length; i++) {

                    System.out.println(vetorDoUsuario[i]);
                }
            }


        }




