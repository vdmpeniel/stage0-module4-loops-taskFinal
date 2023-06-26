package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++){
            int number = cathetusLength;
            for (int j = 0; j < (cathetusLength * 2 - i * 2) / 2; j++){
                System.out.print(" ");
                number--;
            }
            for (int j = 0; j < i * 2 - 1; j++){
                if (number == 0) { number -= 2; }
                System.out.print(Math.abs(number));
                number--;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(3);
    }
}
