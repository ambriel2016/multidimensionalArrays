public class tableSize {
    public static void main(String[] args) {
        int tableSize = 12;

        for (int i = 1; i <= tableSize; i++){
            // print left most column first
            for (int j = 1; j < tableSize; j++){
                System.out.print(i*j);
                System.out.print('\t');
            }
            System.out.println();
        }
    }
}
