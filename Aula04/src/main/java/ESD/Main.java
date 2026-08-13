package ESD;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {

//        VetorObjeto vetor = new VetorObjeto(10);

//        vetor.inserir("Teste");
//        vetor.inserir(100);
//        vetor.inserir(1.99);
//
//        String palavra = (String) vetor.ler(0);
//        int numero = (Integer) vetor.ler(1);
//        double preco = (Double) vetor.ler(2);
//
//        String price = (String) vetor.ler(2);

        // Array sem o mesmo tipo de dado não é homogêneo, o que feriria a definição de array
        // A forma acima não utiliza generics e por isso tem diversos problemas

        Caixa<String> caixaTexto = new Caixa<>();
        caixaTexto.guardar("Olá, mundo!");
        IO.println(caixaTexto.abrir());

        Caixa<Integer> caixaNumero = new Caixa<>();
        caixaNumero.guardar(50);
        IO.println(caixaNumero.abrir());

        Vetor<Produto> estoque = new Vetor<>(10);

        estoque.inserir(new Produto(1,"Monitor",800));
        estoque.inserir(new Produto(2,"Teclado",250));
        estoque.inserir(new Produto(3,"Mouse",300));

        estoque.imprimir();

        List<String> lista = new ArrayList<>(); //Como é uma List e não um ArrayList, você pode trocar o tipo do array




    }
}
