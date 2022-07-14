import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pais {
    private String nome;
    private String codigoIso;
    private Double dimensaoKM;
    private Double populacao;
    private List<String> paisesVizinhos = new ArrayList<>(Arrays.asList("Brasil", "Paraguai", "Colômbia", "Argentina"));

    public Pais(String nome, String codigoIso, Double dimensaoKM) {
        this.nome = nome;
        this.codigoIso = codigoIso;
        this.dimensaoKM = dimensaoKM;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(Double populacao) {
        this.populacao = populacao;
    }

    public Double getDimensaoKM() {
        return dimensaoKM;
    }

    public void setDimensaoKM(Double dimensaoKM) {
        this.dimensaoKM = dimensaoKM;
    }

    public boolean ePaisVizinho(String nome) {
        return paisesVizinhos.contains(nome);

    }

    public void calculaDensidade() {
        Double totalDensidade = populacao / dimensaoKM;
        System.out.println("A densidade populacional desse país é: " + totalDensidade);
    }

}
