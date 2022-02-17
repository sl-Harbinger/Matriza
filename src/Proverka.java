class Proverka {


    public void getMatr(int n, int m) {
        int[][] multiply = new int[n][m];          //задание массива для заполнения

        for (int i = 0; i < n; i++) {                //строки
            for (int j = 0; j < m; j++) {            //столбцы
                multiply[i][j] = (int) (Math.random()*10);        //умножение
                System.out.print(j == m - 1 ? multiply[i][j] + "\n" : multiply[i][j] + " "); //печать с учётом пробелов
            }
        }
       if (n >= m) { //просчёт вертикальной и квадратной матриц
            Vertik otvet1 = new Vertik();
            otvet1.getVertikal(multiply, n, m);
       }
        if (n < m) { //просчёт горизонтальной матрицы
            Goriz otvet2 = new Goriz();
            otvet2.getGoriz(multiply, n, m);
        }

    }
}
