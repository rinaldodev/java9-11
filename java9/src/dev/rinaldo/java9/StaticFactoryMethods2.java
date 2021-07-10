package dev.rinaldo.java9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class StaticFactoryMethods2 {

  public static void main(String[] args) {
    Optional<Object> empty = Optional.empty();
    Optional<Integer> cem = Optional.of(100);
    Optional<Object> emptyTambem = Optional.ofNullable(null);
    
    List<Object> unmodifiableList = Collections.unmodifiableList(new ArrayList<>());
    
    Integer valueOf = Integer.valueOf(100);
    
    
    List<Integer> asList = Arrays.asList(100);
    
    List<Integer> l1 = List.of(100);
    List<Integer> l2 = List.of(100, 100);
    List<Integer> l3 = List.of(100, 100, 100);
    
    l1.add(1);
    
  }
  
}
