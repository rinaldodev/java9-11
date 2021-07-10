package java11;

import java.util.List;

public class VarInLambda {

    public static void main(String[] args) {
        
        List<Integer> lista = List.of(1,2,3,4);
        
        lista.forEach(
                (var e) -> System.out.println(e)
            );
        
    }
    
}
