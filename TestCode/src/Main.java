public class Main {

    public static void main(String[] args) {

        Podstawy[] podstawy = new Podstawy[5];

        for(int i=0; i<podstawy.length; i++) {
            podstawy[i] = new Podstawy(5);
        }

        for(Podstawy temp: podstawy) {
            System.out.print("e");
        }

        System.out.println(podstawy[1].getCapacity());
    }
}
