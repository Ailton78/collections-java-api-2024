package map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    Map<String, String> palavrasMap;

    public Dicionario() {
        this.palavrasMap = new HashMap<>();
    }
    public void adicionarPalavra(String palavra, String definicao){
        palavrasMap.put(palavra, definicao);
    }
    public void removerPalavra(String palavra){
        if(!palavrasMap.isEmpty()){
            palavrasMap.remove(palavra);
        }
    }
    public void exibirPalavras(){
        System.out.println(palavrasMap);
    }
    public String pesquisarPorPalavra(String palavra){
        String palavraPorNome = null;
        if(!palavrasMap.isEmpty()){
            palavraPorNome =  palavrasMap.get(palavra);
        }
        return palavraPorNome;
    }
}
