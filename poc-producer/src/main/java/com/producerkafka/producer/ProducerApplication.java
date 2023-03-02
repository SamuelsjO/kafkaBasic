package com.producerkafka.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProducerApplication {

	public static void main(String[] args) {

		SpringApplication.run(ProducerApplication.class, args);


		longestCommonSubsequence("abc", "aedace");
	}



	public static int longestCommonSubsequence(String x, String y) {
		int m = x.length();
		int n = y.length();
		int[][] dp = new int[m+1][n+1];

		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (x.charAt(i-1) == y.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1] + 1;
				} else {
					dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
				}
			}
		}

		return dp[m][n];
	}

//	Essa função usa a programação dinâmica para calcular o comprimento da subsequência mais longa comum entre as duas strings x e y. O algoritmo preenche uma matriz dp de tamanho (m+1) x (n+1), onde m e n são os comprimentos das strings x e y, respectivamente. O valor dp[i][j] representa o comprimento da subsequência mais longa comum entre os primeiros i caracteres de x e os primeiros j caracteres de y.
//
//	A função percorre a matriz e, para cada posição (i, j), verifica se o caractere atual de x é igual ao caractere atual de y. Se sim, a posição (i, j) recebe o valor da posição (i-1, j-1) acrescido de 1. Caso contrário, a posição (i, j) recebe o máximo entre as posições (i, j-1) e (i-1, j). No final, a função retorna o valor da posição (m, n), que representa o comprimento da subsequência mais longa comum entre as strings x e y.
//
//	Note que, como a função retorna um inteiro, o comprimento da subsequência mais longa deve estar entre 1 e 2000, conforme especificado no enunciado.
//}

}