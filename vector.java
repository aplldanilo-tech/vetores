import java.util.Scanner;
 public class vector {
     public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
         System.out.println("Digite O TamenhomDo Vetor");

         int tamanhoDoVetor = sc.nextInt();
         String[] vetorDoUsuario = new String[tamanhoDoVetor];

         sc.nextLine();
         for (int i = 0; i < tamanhoDoVetor; i++) {
             System.out.println("Digite  O Valor Da Posição " + i + " Do Seu Vetor");
             vetorDoUsuario[i] = sc.nextLine();


         }
          exibirVetor(vetorDoUsuario);
               Scanner scanner = new Scanner(System.in);
                 int[] numeros = new int[5];

                 // Preenchendo o vetor com valores do usuário
                 for (int i = 0; i < numeros.length; i++) {
                     System.out.print("Digite um número: ");
                     numeros[i] = scanner.nextInt();
                 }

                 // Multiplicando números pares por 2 e ímpares ao quadrado
                 for (int i = 0; i < numeros.length; i++) {
                     if (numeros[i] % 2 == 0) {
                         numeros[i] *= 2;
                     } else {
                         numeros[i] *= numeros[i];
                     }
                 }

                 // Exibindo o vetor modificado
                 System.out.println("Vetor modificado:");
                 for (int num : numeros) {
                     System.out.println(num);
                 }


                 contadorDeVogais();

                
     }



     private static void contadorDeVogais() {
         Scanner sc = new Scanner(System.in);

         System.out.println("Digite uma frasse para ser contada as vogais");
         String frase = sc.nextLine();
         int contatdor = 0;
         for (int i = 0; i < frase.length(); i++) {
             char caractere = frase.charAt(i);
             char caractereMinusculo = Character.toLowerCase(caractere);

             if (caractereMinusculo == 'a' ||
                     caractereMinusculo == 'e' ||
                     caractereMinusculo == 'i' ||
                     caractereMinusculo == 'o' ||
                     caractereMinusculo == 'u') {
                 contatdor++;


             }
         }

         System.out.println("O numero de vogais na frase e " + contatdor);
         sc.close();
     }

     private static void exibirVetor(String[] vetorDoUsuario) {
         System.out.println("Veja Os Valores Do Vetor Criada Por Voçê:");
         for (int i = 0; i < vetorDoUsuario.length; i++) {

             System.out.println(vetorDoUsuario[i]);

         }
     }


 }



