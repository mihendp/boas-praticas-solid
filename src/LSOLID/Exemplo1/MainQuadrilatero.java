package LSOLID.Exemplo1;

public class MainQuadrilatero {
    public static void main(String[] args) {
        Quadrilatero quadrilatero1 = new QuadradoCorrigido(10);
        Quadrilatero quadrilatero2 = new RetanguloCorrigido(10, 20);

        if (quadrilatero1 instanceof QuadradoCorrigido quadrado) {
            System.out.println("Quadrado de lado: " + quadrado.getLado());
        } else if (quadrilatero1 instanceof RetanguloCorrigido retangulo) {
            System.out.println("Retângulo de lado: " + retangulo.getLado() + " e altura: " + retangulo.getAltura());
        } else {
            System.out.println("Quadrilátero desconhecido");
        }

        if (quadrilatero2 instanceof QuadradoCorrigido quadrado) {
            System.out.println("Quadrado de lado: " + quadrado.getLado());
        } else if (quadrilatero2 instanceof RetanguloCorrigido retangulo) {
            System.out.println("Retângulo de lado: " + retangulo.getLado() + " e altura: " + retangulo.getAltura());
        } else {
            System.out.println("Quadrilátero desconhecido");
        }
    }
}
