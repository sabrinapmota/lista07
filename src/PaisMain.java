public class PaisMain {

    public static void main(String[] args) {
        Pais brasil = new Pais("Brasil ", "BRA", 8515767.049);
            boolean paisVizinho = brasil.ePaisVizinho("Uruguai");
        if (paisVizinho) {
            System.out.println("Esse País é vizinho ");
        } else {
            System.out.println("Esse país não é vizinho");
        }
        brasil.setPopulacao(212000000.00);
        brasil.calculaDensidade();
    }
}
