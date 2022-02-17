public class Goriz {

    int sumGlav = 0;
    int proizvedGl = 1;
    int proizvedVt = 1;

    public void getGoriz(int[][] multiply, int n, int m) {
        System.out.println("элименты под главной диагональю ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= i) {
                    System.out.print(multiply[i][j] + " "); //элименты под диагональю
                }
            }
            if ((multiply[i][i] % 2) == 0) {    //элименты четные главной диагонали
                sumGlav = sumGlav + multiply[i][i];
            }
            proizvedGl *= multiply[i][i];
            proizvedVt *= multiply[n - i - 1][i];
        }

        System.out.println();
        System.out.println("сумма четных элиментов главной диагонали " + sumGlav);
        System.out.println(proizvedVt > proizvedGl ? "произведение элиментов вторичной диагонали больше" :
                proizvedVt < proizvedGl ? "произведение элиментов главной диагонали больше" : "диагонали равны");


    }




}
