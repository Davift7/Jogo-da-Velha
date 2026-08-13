package src;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Tabuleiro novoJogo = new Tabuleiro();
        Scanner s = new Scanner(System.in);
        System.out.println("Bem vindo ao jogo da velha\n");
        System.out.println("Deseja jogar contra maquina ou contra seu amigo?" );
        System.out.println("1 para maquina.\n" + "0 para amigo.");
        int resposta = s.nextInt();
        if (resposta == 1) {
            System.out.println("Maquinas começam ou humano começa?\n" + "1 para maquinas primeiro.\n0 para humano primeiro");
            int primeiroJogar = s.nextInt();
            MiniMax maquina = new MiniMax();
            novoJogo.iniciarParida();
            System.out.println("\nBem vindo ao jogo da velha (Contra maquina)");
            int fimDeJogo = 0;
            boolean jogador = primeiroJogar == 1 ? true : false ;
            while (fimDeJogo == 0) {
                System.out.println("\nJogador: " + (jogador == true ? "Maquina" : "Humano") + " escolha seu movimento!\n");


                if ( jogador == true) {
                    novoJogo.mostrarJogoAtual();
                    maquina.jogadaMaquina(novoJogo);
                    
                }else{
                    int ciclo = 0;
                    while (ciclo == 0) {
                        System.out.println("\nEscolha a posição que deseja jogar\n");
                        novoJogo.mostrarJogoAtual();
                        System.out.print("\nMinha posição é: ");
                        int posicao = s.nextInt();
                        int acao = novoJogo.jogarPartida(jogador, posicao);
                        ciclo = acao;
                        if (acao == 0) {
                            System.out.println("\n\nPosição já preenchida\n\n");
                            
                        }else if(acao == 2){
                            System.out.println("\n\nPosição inexistente!\n\n");
                            ciclo = 0;
                        }
                        System.out.println("");

                        
                    }
                }

                int resultado = novoJogo.condicaoVitoria();
                if (resultado == 1) {
                    System.out.println("\nParabéns jogador: " + (jogador == true ? "Maquina" : "Humano") + " Você ganhou!");
                    novoJogo.mostrarJogoAtual();
                    System.out.println("");
                    break;
                }else if (resultado == 2) {
                    System.out.println("\nOcorreu um empate!\n");
                    novoJogo.mostrarJogoAtual();
                    System.out.println("");
                    break;
                    
                }

                jogador = !jogador;
                
            }
            
        }
        
        else if (resposta == 0) {
            int fimDeJogo = 0;
            System.out.println("\nBem vindo ao jogo da velha!\n\n");
            novoJogo.iniciarParida();
            Boolean jogador = true;
            while (fimDeJogo == 0) {
                int ciclo = 0;
                while(ciclo == 0) {

                System.out.println(
                "===============\n"+
                "Jogador: " + (jogador == true ? 1 : 2) + " joga!"+
                "\n===============\n");
                System.out.println( "Escolha a posição que deseja jogar\n");
                novoJogo.mostrarJogoAtual();
                System.out.print("\nMinha posição é: ");
                int posicao = s.nextInt();
                int acao = novoJogo.jogarPartida(jogador, posicao);
                ciclo = acao;
                if (acao == 0) {
                    System.out.println("\n\nPosição já preenchida\n\n");
                    
                }else if(acao == 2){
                    System.out.println("\n\nPosição inexistente!\n\n");
                    ciclo = 0;
                }
                System.out.println("");

                }
               int resultado = novoJogo.condicaoVitoria();
               if (resultado == 1) {
                System.out.println("Parabéns jogador: " + (jogador == true ? 1 : 2) + " Você ganhou!");
                novoJogo.mostrarJogoAtual();
                System.out.println("");
                break;
               }else if (resultado == 2) {
                System.out.println("Ocorreu um empate!");
                break;
                
               }
                
                jogador = !jogador;
            }
           
            
        
            
            
        }

        
        s.close();
    }
}