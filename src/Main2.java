public class Main2 {

    public static void main(String[] args) {
        // sklep który sprzedaje drzwi
        // wysokość i szerokość


        // zmienna dla każdych drzwi
        System.out.println("----------------- Podejście 1");

        double door1height = 2.5;
        double door1width = 0.6;

        double door2height = 1.5;
        double door2width = 0.6;

        double door3height = 2.5;
        double door3width = 0.8;

        double door4height = 2.0;
        double door4width = 0.6;

        double door5height = 2.5;
        double door5width = 0.7;

        double door6height = 2.5;
        double door6width = 0.5;

        double door7height = 2.5;
        double door7width = 0.9;

        double door8height = 1.8;
        double door8width = 0.8;

        System.out.println(door1height);
        System.out.println(door1width);

        System.out.println(door2height);
        System.out.println(door2width);

        System.out.println(door3height);
        System.out.println(door3width);

        System.out.println(door4height);
        System.out.println(door4width);

        System.out.println(door5height);
        System.out.println(door5width);

        System.out.println(door6height);
        System.out.println(door6width);

        System.out.println(door7height);
        System.out.println(door7width);

        System.out.println(door8height);
        System.out.println(door8width);


        // podejście 2 z tablicami
        System.out.println("----------------- Podejście 2");

        int n = 8;
        double[] doorsHeight = new double[n];
        double[] doorsWidth = new double[n];

        doorsHeight[0] = 2.5;
        doorsWidth[0] = 0.6;

        doorsHeight[1] = 1.5;
        doorsWidth[1] = 0.6;

        doorsHeight[2] = 2.5;
        doorsWidth[2] = 0.8;

        doorsHeight[3] = 2.0;
        doorsWidth[3] = 0.6;

        doorsHeight[4] = 2.5;
        doorsWidth[4] = 0.7;

        doorsHeight[5] = 2.5;
        doorsWidth[5] = 0.5;

        doorsHeight[6] = 2.5;
        doorsWidth[6] = 0.9;

        doorsHeight[7] = 1.8;
        doorsWidth[7] = 0.8;

        for(int i = 0; i < doorsHeight.length; i++){
            System.out.println(doorsHeight[i]);
            System.out.println(doorsWidth[i]);
        }


        // Podejście 3 z klasami, bez tablicy
        System.out.println("----------------- Podejście 3, klasy, bez tablicy");
        Door door1 = new Door(2.5, 0.6);
        Door door2 = new Door(1.5, 0.6);
        Door door3 = new Door(2.5, 0.8);
        Door door4 = new Door(2.0, 0.6);
        Door door5 = new Door(2.5, 0.7);
        Door door6 = new Door(2.5, 0.5);
        Door door7 = new Door(2.5, 0.9);
        Door door8 = new Door(1.8, 0.8);

        System.out.println(door1.height);
        System.out.println(door1.width);

        System.out.println(door2.height);
        System.out.println(door2.width);

        System.out.println(door3.height);
        System.out.println(door3.width);

        System.out.println(door4.height);
        System.out.println(door4.width);

        System.out.println(door5.height);
        System.out.println(door5.width);

        System.out.println(door6.height);
        System.out.println(door6.width);

        System.out.println(door7.height);
        System.out.println(door7.width);

        System.out.println(door8.height);
        System.out.println(door8.width);

        // Podejście 4 z klasami, z tablicami
        System.out.println("----------------- podejście 4 z kalsami i tablicami");
        Door[] doors = new Door[n];
        doors[0] = door1;
        doors[1] = door2;
        doors[2] = door3;
        doors[3] = door4;
        doors[4] = door5;
        doors[5] = door6;
        doors[6] = door7;
        doors[7] = door8;

        for(int i = 0; i < doors.length; i++){
            System.out.println(doors[i].height);
            System.out.println(doors[i].width);
        }


        // Podejście 5 z klasami, z tablicami, bezpośrednie stworzenie obiektu i przypisanie do tablicy
        System.out.println("----------------- podejście 5 z kalsami i tablicami, bezpośrednie stworzenie obiektu i przypisanie do tablicy");
        Door[] doors2 = new Door[n];
        doors2[0] = new Door(2.5, 0.6);
        doors2[1] = new Door(1.5, 0.6);
        doors2[2] = new Door(2.5, 0.8);
        char[] name = {'p','o','r','t','a'};
        doors2[2].name = name;

        doors2[3] = new Door(2.0, 0.6);
        doors2[4] = new Door(2.5, 0.7);
        doors2[5] = new Door(2.5, 0.5);
        doors2[6] = new Door(2.5, 0.9);
        doors2[7] = new Door(1.8, 0.8);
        for(int i = 0; i < doors.length; i++){
            System.out.println(doors2[i].height);
            System.out.println(doors2[i].width);
            if(doors2[i].name != null) {
                for(char c : doors2[i].name) {
                    System.out.print(c);
                }
                System.out.println();
            }
        }
    }

}
