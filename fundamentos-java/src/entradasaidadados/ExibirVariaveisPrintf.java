/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradasaidadados;

/**
 *
 * @author Grazi
 */
public class ExibirVariaveisPrintf {
    
public static void main(String[] args) {
		
		int quantidade = 1000;
		long identificador = 10000l;
		float altura = 25.4f; 
		double area = 45.4567;
		double tamanho = 650000000.00;
		char tipo = 'A';
		String palavra = "Generation";
		 
		System.out.printf("Variável quantidade = %d", quantidade);
		System.out.printf("Variável identificador = %d", identificador);
		System.out.printf("Variável altura = %.2f", altura);
		System.out.printf("Variável area = %.2f", area);
		System.out.printf("Variável tamanho = %e", tamanho);
		System.out.printf("Variável tamanho = %E", tamanho);
		System.out.printf("Variável tipo = %c", tipo);
		System.out.printf("Variável palavra = %s", palavra);
 
   //Variável quantidade = 1000Variável altura = 25,40Variável area = 45,46Variável tamanho = 6,500000e+08Variável tamanho = 6,500000E+08Variável tipo = AVariável palavra = GenerationCONSTRUÍDO COM SUCESSO (tempo total: 0 segundos)
                
             /*
            %c	Caractere simples (char)
            %s	Cadeia de caracteres (String)
            %d	Inteiro (int ou long)
            %f	Real com ponto flutuante (float ou double)
            %.2f	Real com ponto flutuante (float ou double), delimitando o número de dígitos que serão exibidos nas casas decimais.
            No exemplo ao lado, serão exibidos 2 dígitos depois do ponto (separador de casas decimais).
               */         
	}

}