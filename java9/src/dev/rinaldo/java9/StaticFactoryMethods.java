package dev.rinaldo.java9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * JAVA 9 - Static Factory Methods de List, Set e Map
 * 
 * @author youtube.com/RinaldoDev
 * 
 * @SejaMembro e escolha o assunto do próximo vídeo!
 */
public class StaticFactoryMethods {

  public static void main(String[] args) {
    // Nomes com significado
    Optional<Integer> empty = Optional.empty();
    Optional<Integer> cemOpt = Optional.of(100);
    Optional<Integer> vazio = Optional.ofNullable(null);
    
    // Flexibilidade no retorno
    List<Object> list = new ArrayList<>();
    List<Object> novaLista = Collections.unmodifiableList(list);
//    novaLista.add(1); lança exceção
    
    // Controle das Instâncias
    Integer cem = Integer.valueOf(100);
    Integer duz = Integer.valueOf(200);
    Integer tre = Integer.valueOf(300);
    
    // Como fazia antes
    List<Integer> list2 = Arrays.asList(cem, duz, tre);
//    Collections.singletonList(o)
    
    // Formato Novo no Java 9
    List<Integer> of1 = List.of();
    List<Integer> of2 = List.of(cem);
    List<Integer> of3 = List.of(cem, duz);
    List<Integer> of4 = List.of(cem, duz, tre);
    
    // Imutável
//    of1.add(duz);
    
    
//    Map.of(k1, v1)
//    Set.of(e1, e2)
  }
  
}












