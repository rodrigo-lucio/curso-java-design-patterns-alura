package br.com.lucio.alternativo.decorator;

public class Main {
    public static void main(String[] args) {
        
        /* Drink a base de Vodka */
        
        Drink basaVodka = new Vodka();
        System.out.println(basaVodka.getNome() + " = " + basaVodka.getPreco());

        Drink vodka1 = new Refrigerante(basaVodka);
        System.out.println(vodka1.getNome() + " = " + vodka1.getPreco());
        
        Drink vodka2 = new Frutas(vodka1);
        System.out.println(vodka2.getNome() + " = " + vodka2.getPreco());
        
        /* Drink a base de Vodka2 */
        
        Drink basaVodka2 = new Vodka();
        System.out.println(basaVodka2.getNome() + " = " + basaVodka2.getPreco());

        Drink vodka3 = new Suco(basaVodka2);
        System.out.println(vodka3.getNome() + " = " + vodka3.getPreco());
        

        /* Drink a base de Gin */
        
        Drink baseGin = new Gin();
        System.out.println(baseGin.getNome() + " = " + baseGin.getPreco());

        Drink gin1 = new Especiarias(baseGin);
        System.out.println(gin1.getNome() + " = " + gin1.getPreco());
        
        Drink gin2 = new Frutas(gin1);
        System.out.println(gin2.getNome() + " = " + gin2.getPreco());
        
        Drink gin3 = new Refrigerante(gin2);
        System.out.println(gin3.getNome() + " = " + gin3.getPreco());
        
        /* Drink a base de Whisky */
        
        Drink baseWhisky = new Whisky();
        System.out.println(baseWhisky.getNome() + " = " + baseWhisky.getPreco());

        Drink whisky1 = new Energetico(baseWhisky);
        System.out.println(whisky1.getNome() + " = " + whisky1.getPreco());
        
    }
}
