package src;
public class MiniMax {
   int profundidade = 8;

   public int previsao(Tabuleiro tabuleiro,int profundidade, Boolean jogador){

    if (tabuleiro.condicaoVitoria() == 2) {
        return 0;
    }
    if (tabuleiro.condicaoVitoria() == 1){

        return (jogador == false) ? +10 : -10;
    }
    if (profundidade == 0){
        return 0;
    }
   
    int melhorPontuacao = jogador == true ? -1000 : 1000;

    for ( int i = 0; i < 9; i++) {
    Tabuleiro tabuleiroCopia = new Tabuleiro();
    tabuleiroCopia.matriz = tabuleiro.clonarTabuleiro();
        if(tabuleiroCopia.jogarPartida(jogador, i) == 1){
            int resultado = previsao(tabuleiroCopia, profundidade - 1, !jogador);
            if (jogador == true) {
                melhorPontuacao = resultado > melhorPontuacao ? resultado + profundidade : melhorPontuacao;
                
            }else{
                melhorPontuacao = resultado < melhorPontuacao ? resultado - profundidade : melhorPontuacao;
            }
        }
    }
    return melhorPontuacao;

   }

   public void jogadaMaquina(Tabuleiro tabuleiro){
    int melhorNota = -1000;
    int melhorCasa = -1;

    for (int i = 0; i < 9; i++) {
    Tabuleiro tabuleiroCopia = new Tabuleiro();
    tabuleiroCopia.matriz = tabuleiro.clonarTabuleiro();
    if(tabuleiroCopia.jogarPartida(true, i) == 1){
        int resultado = previsao(tabuleiroCopia, profundidade - 1, false);
        if(melhorNota < resultado){
            melhorNota = resultado;
            melhorCasa = i;
        }
    }
    }
    tabuleiro.jogarPartida(true, melhorCasa);
   }
    
}
