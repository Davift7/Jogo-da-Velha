
# Jogo da Velha com IA (Minimax) 🎮🤖

Um clássico Jogo da Velha (Tic-Tac-Toe) desenvolvido em **Java**, rodando diretamente no terminal. O grande diferencial deste projeto é a implementação do algoritmo **Minimax**, que cria uma Inteligência Artificial matematicamente imbatível.

## 🚀 Funcionalidades

*   **Modo PvP (Humano vs Humano):** Jogue contra um amigo no mesmo computador.
*   **Modo PvE (Humano vs Máquina):** Desafie a Inteligência Artificial.
*   **IA Imbatível:** A máquina nunca perde. Ela utiliza a teoria dos jogos para forçar uma vitória ou garantir, no mínimo, um empate.

## 🧠 Como a IA funciona? (O Algoritmo Minimax)

A inteligência da máquina foi construída do zero utilizando o algoritmo de busca recursiva **Minimax**. 
Antes de executar uma jogada no mundo real, a máquina simula **todos os futuros possíveis** do tabuleiro. Ela cria "universos paralelos" na memória, alternando entre as jogadas dela e as do humano, até o final da partida. 

A IA então avalia os resultados de cada linha do tempo:
*   **+10:** Se o caminho leva à vitória da máquina.
*   **0:** Se o caminho resulta em empate.
*   **-10:** Se o caminho leva à derrota.

Após essa exaustão de possibilidades, ela traz esses resultados para o presente e escolhe cirurgicamente a jogada que maximiza sua pontuação, bloqueando qualquer chance de vitória do adversário.

## 💻 Tecnologias e Conceitos Utilizados

*   **Linguagem:** Java 
*   **Conceitos aplicados:** Programação Orientada a Objetos (POO), Recursividade, Teoria dos Jogos (Algoritmos de Busca), Controle de Estado.

## 🛠️ Como rodar o projeto localmente

1. Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/downloads/) instalado na sua máquina.
2. Clone este repositório:
   ```bash
   git clone [https://github.com/Davift7/Jogo-da-Velha](https://github.com/Davift7/Jogo-da-Velha)

   ```

3. Navegue até a pasta do projeto:
```bash
cd NOME_DO_REPOSITORIO

```


4. Compile os arquivos `.java`:
```bash
javac src/*.java

```


5. Execute o jogo:
```bash
java -cp src Main

```



## 📁 Estrutura do Projeto

* `src/Main.java`: Ponto de entrada do jogo (Menus e loop principal).
* `src/MiniMax.java`: O "cérebro" da IA, contendo o algoritmo de previsão e a tomada de decisão.
* `src/Tabuleiro.java`: Gerencia a matriz 3x3, verificação de vitória/empate e a clonagem de universos.
* `src/Velha.java`: Entidade que representa cada casa do jogo e a peça que a ocupa.


