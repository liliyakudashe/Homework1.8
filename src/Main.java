
public class Main {
    public static void main(String[] args) {

        // Задача 1.2
        System.out.println("Первая задача");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        for (int i = 0; i < number.length; i++){
            if (number[i] > number.length-1)
                System.out.print(number[i]);
            else
                System.out.println(number[i] + ", ");
        }

        // Задача 1.2
        double[] number2 = {1.57, 7.654, 9.986};
        for (int j = 0; j < number2.length; j++){
            if (j != number2.length-1)
                System.out.print(number2[j] + ", ");
            else
                System.out.println(number2[j]);
        }

        // Задача 1.2
        int[] number3 = {4,8,15};
        for (int k = 0; k < number3.length; k++) {
            if (k != number3.length-1)
                System.out.print(number3[k] + ", ");
            else
            System.out.println(number3[k]);
        }

        // Задача 3
        System.out.println("Третяя задача");
        for (int i = number.length-1; i >= 0; i--){
            if (i != 0)
                System.out.print(number[i] + ", ");
            else
                System.out.println(number[i]);
        }

        for (int j = number2.length-1; j >= 0; j--){
            if (j != 0)
                System.out.print(number2[j] + ", ");
            else
                System.out.println(number2[j]);
        }

        for (int k = number3.length-1; k >= 0; k--){
            if (k != 0)
                System.out.print(number3[k] + ", ");
            else
                System.out.println(number3[k]);
        }

        // Задача 4
        System.out.println("Четвёртая задача");
        for (int l = 0; l < number.length; l++){
            if (number[l] % 2 != 0)
                number[l]++;
            if (l != number.length-1)
                System.out.print(number[l] + ", ");
            else
            System.out.print(number[l]);
        }

    }
}