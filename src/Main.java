public class Main {
    public static void main(String[] args) {

        // Zadanie 1 - przechowywanie drzwi
        System.out.println("------------ zadanie 1 --------------");
        Door d1 = new Door(2.5, 0.8);
        Door d2 = new Door(1.8, 0.9);
        Door d3 = new Door(2.0, 0.7);

        Door[] doors = new Door[3];
        doors[0] = d1;
        doors[1] = d2;
        doors[2] = d3;

        for(Door door : doors){
            System.out.println("Height: "+door.height);
            System.out.println("Width: "+door.width);
        }

        // Zadanie 2 - repo zadań
        System.out.println("------------ zadanie 2 --------------");
        char[] title1 = {'u','m','y','j'};
        char[] desc1 = {'p','o','d','ł','o','g','ę',' ','w',' ','k','u','c','h','n','i'};
        Task t1 = new Task(title1, desc1, false);

        char[] title2 = {'p','r','z','e','c','z','y','t','a','j'};
        char[] desc2 = {'k','o','m','p','e','n','d','i','u','m',' ','p','r','o','g','r','a','m','i','s','t','y'};
        Task t2 = new Task(title2, desc2, true);

        Task[] tasks = new Task[2];
        tasks[0] = t1;
        tasks[1] = t2;

        for (Task task : tasks){
            System.out.print("Title: ");
            for (char c : task.title){
                System.out.print(c);
            }
            System.out.println();

            System.out.print("Description: ");
            for (char c : task.desc){
                System.out.print(c);
            }
            System.out.println();

            System.out.print("Status: ");
            if(task.done){
                System.out.println("done");
            } else {
                System.out.println("to do");
            }
            System.out.println();
        }

    }
}
