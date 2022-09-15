public class Main {

    public static void main(String[] args) {
        byte aantalUren = 5;
        byte aantalDagen = 6;
        short minutenInUur = minutenInUur(aantalUren);
        short minutenInAantalDagen = (short) (minutenInUur((short)(aantalDagen * 24)));


        System.out.println(minutenInUur);
    }

    static short minutenInUur(short aantalUren) {
        return (short) (aantalUren * 60);
    }
}
