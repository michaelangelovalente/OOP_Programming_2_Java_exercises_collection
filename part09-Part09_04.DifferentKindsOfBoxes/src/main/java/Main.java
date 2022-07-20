

public class Main {

    public static void main(String[] args) {
        /* 
        BoxWithMaxWeight coffeeBox = new BoxWithMaxWeight(10);
        coffeeBox.add(new Item("Saludo", 5));
        coffeeBox.add(new Item("Pirkka", 5));
        coffeeBox.add(new Item("Kopi Luwak", 5));

        

        System.out.println(coffeeBox.isInBox(new Item("Saludo", 5)));
        System.out.println(coffeeBox.isInBox(new Item("Pirkka", 5)));
        System.out.println(coffeeBox.isInBox(new Item("Kopi Luwak", 5)));
        */

        /*
        Item testItem = new Item("Pokka", 50);
        Item testItem2 = new Item("Pokkas", 50);
        System.out.println(testItem.equals(testItem2));
         */

        /*
         OneItemBox box = new OneItemBox();
         box.add( new Item("Saludo", 5) );
         box.add( new Item("Pirkka", 5) );

         System.out.println( box.isInBox( new Item("Saludo", 5) ));
         System.out.println( box.isInBox( new Item( "Pirkka", 5)));
         */

        MisplacingBox box = new MisplacingBox();
        box.add(new Item("Saludo", 5));
        box.add(new Item("Pirkka", 5));

        System.out.println( box.isInBox(new Item("Saludo", 5)));
        System.out.println( box.isInBox(new Item("Pirkka", 5)));

    }
}
