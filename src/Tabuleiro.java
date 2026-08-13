package src;
public class Tabuleiro {

   public Velha [][] matriz = new Velha[3][3];
    
    public void iniciarParida(){
        for ( int i = 0 ; i < matriz.length;  i++){
            for( int j = 0 ; j < matriz[i].length; j++){
                matriz[i][j] = new Velha("null");
             
            }
        }
    }

    public int jogarPartida (Boolean jogador, int posicao){
            switch (posicao) {
                case 0:
                    if (matriz[0][0].preenchido == false) {
                        matriz[0][0].preenchido = true;
                        if(jogador == true){
                            matriz[0][0].desenho = "X";
                        }else{
                            matriz[0][0].desenho = "O";
                        }
                        
                        
                    }else{
                        return 0;
                    }
                    return 1;
                case 1:
                    if (matriz[0][1].preenchido == false) {
                        matriz[0][1].preenchido = true;
                         if(jogador == true){
                            matriz[0][1].desenho = "X";
                        }else{
                            matriz[0][1].desenho = "O";
                        }
                        
                        
                    }else{
                        return 0;
                    }
                    return 1;
                case 2:
                    if (matriz[0][2].preenchido == false) {
                        matriz[0][2].preenchido = true;
                         if(jogador == true){
                            matriz[0][2].desenho = "X";
                        }else{
                            matriz[0][2].desenho = "O";
                        }
                        
                        
                    }else{
                        return 0;
                    }
                    return 1;
                case 3:
                    if (matriz[1][0].preenchido == false) {
                        matriz[1][0].preenchido = true;
                         if(jogador == true){
                            matriz[1][0].desenho = "X";
                        }else{
                            matriz[1][0].desenho = "O";
                        }
                        
                        
                    }else{
                        return 0;
                    }
                    return 1;
                case 4:
                    if (matriz[1][1].preenchido == false) {
                        matriz[1][1].preenchido = true;
                         if(jogador == true){
                            matriz[1][1].desenho = "X";
                        }else{
                            matriz[1][1].desenho = "O";
                        }
                        
                        
                    }else{
                        return 0;
                    }
                    return 1;
                case 5:
                    if (matriz[1][2].preenchido == false) {
                        matriz[1][2].preenchido = true;
                         if(jogador == true){
                            matriz[1][2].desenho = "X";
                        }else{
                            matriz[1][2].desenho = "O";
                        }
                        ;
                        
                    }else{
                        return 0;
                    }
                    return 1;
                case 6:
                    if (matriz[2][0].preenchido == false) {
                        matriz[2][0].preenchido = true;
                         if(jogador == true){
                            matriz[2][0].desenho = "X";
                        }else{
                            matriz[2][0].desenho = "O";
                        }
                        ;
                        
                    }
                    return 1;
                case 7:
                    if (matriz[2][1].preenchido == false) {
                        matriz[2][1].preenchido = true;
                        if(jogador == true){
                            matriz[2][1].desenho = "X";
                        }else{
                            matriz[2][1].desenho = "O";
                        }
                        ;
                        
                    }else{
                        return 0;
                    }
                    return 1;
                   
                case 8:
                    if (matriz[2][2].preenchido == false) {
                        matriz[2][2].preenchido = true;
                         if(jogador == true){
                            matriz[2][2].desenho = "X";
                        }else{
                            matriz[2][2].desenho = "O";
                        }
                        ;
                    }else{
                        return 0;
                    }
                    return 1;
            
                default:
                    
                    return 2;
            }
            
          
        

    }

    public int condicaoVitoria(){
        String desenho = "X";
        
    for (int i = 0; i < 2; i++) {
    
     if ((matriz[0][0].preenchido && matriz[0][0].desenho.equals(desenho)) && (matriz[0][1].preenchido && matriz[0][1].desenho.equals(desenho)) && (matriz[0][2].preenchido && matriz[0][2].desenho.equals(desenho))) {
            return 1;
        } else if ((matriz[1][0].preenchido && matriz[1][0].desenho.equals(desenho)) && (matriz[1][1].preenchido && matriz[1][1].desenho.equals(desenho))&& (matriz[1][2].preenchido&& matriz[1][2].desenho.equals(desenho))) {
            return 1;
        }else if ((matriz[2][0].preenchido && matriz[2][0].desenho.equals(desenho))&& (matriz[2][1].preenchido && matriz[2][1].desenho.equals(desenho))&& (matriz[2][2].preenchido&& matriz[2][2].desenho.equals(desenho))) {
            return 1;
        }else if ((matriz[0][0].preenchido && matriz[0][0].desenho.equals(desenho))&& (matriz[1][0].preenchido && matriz[1][0].desenho.equals(desenho))&& (matriz[2][0].preenchido&& matriz[2][0].desenho.equals(desenho))) {
            return 1;
        }else if ((matriz[0][1].preenchido && matriz[0][1].desenho.equals(desenho))&& (matriz[1][1].preenchido && matriz[1][1].desenho.equals(desenho))&& (matriz[2][1].preenchido&& matriz[2][1].desenho.equals(desenho))) {
            return 1;
        }else if ((matriz[0][2].preenchido && matriz[0][2].desenho.equals(desenho))&& (matriz[1][2].preenchido && matriz[1][2].desenho.equals(desenho))&& (matriz[2][2].preenchido&& matriz[2][2].desenho.equals(desenho))) {
            return 1;
        }else if ((matriz[0][0].preenchido && matriz[0][0].desenho.equals(desenho))&& (matriz[1][1].preenchido && matriz[1][1].desenho.equals(desenho))&& (matriz[2][2].preenchido&& matriz[2][2].desenho.equals(desenho))) {
            return 1;
        }else if ((matriz[0][2].preenchido && matriz[0][2].desenho.equals(desenho))&& (matriz[1][1].preenchido && matriz[1][1].desenho.equals(desenho))&& (matriz[2][0].preenchido&& matriz[2][0].desenho.equals(desenho))) {
            return 1;
        }
        desenho = "O";
    }

       

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j].preenchido == false) {
                    return 0;
                }
                
            }

            
        }


        return 2;
    }

    public void mostrarJogoAtual(){
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                
                
                if (matriz[i][j].preenchido == false) {
                    if (j == 2) {
                        System.out.print(contador);
                        
                    }else{
                        System.out.print(contador+" | ");
                    }
                    
                }else{
                    if (j == 2) {
                        System.out.print(matriz[i][j].desenho);
                        
                    }
                    else{
                        System.out.print(matriz[i][j].desenho+" | ");
                    }
                }
                contador++;
            }
            if (i != 2) {
            System.out.print("\n----------\n");
            }
           
            
            
        }
    }
    
    public Velha[][] clonarTabuleiro(){
        Velha [][] copiaMatriz = new Velha[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                copiaMatriz[i][j] = new Velha("");
                if (matriz[i][j].preenchido == true) {
                    copiaMatriz[i][j].preenchido = true;
                    copiaMatriz[i][j].desenho = matriz[i][j].desenho;
                    
                   
                    
                }
            }
        }
        return copiaMatriz;
    }
    
}
