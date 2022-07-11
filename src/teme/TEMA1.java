package teme;

import java.util.Random;
import java.util.Scanner;

class TEMA1 {
    public static void main(String[] args) {
        //exercitiu 1
        int a = 10;
        int b = 20;
        int c = a;
        a = b;
        b = c;

        System.out.println(a);
        System.out.println(b);

        //exercitiu2
        double a3 = 4;
        double b3 = 3;
        double c3 = 1;
        double totalSum;
        totalSum = (a3 + b3 + c3) / 3;
        System.out.println(totalSum);


        //exercitiu3
        int temperatureF = 95;
        int temperatureC;
        temperatureC = ((temperatureF - 32) * 5) / 9;

        System.out.println(temperatureC);


        //If statement
        //exercitiu 1
        int a2 = 14;
        int b2 = 13;
        if (b2 >= a2) {
            System.out.println("numarul mai mai mare este " + b2);
        } else {
            System.out.println("numarul mai mare este " + a2);
        }


        //exercitiu2
        int a1 = 12;
        if (a1 % 2 == 0) {
            System.out.println("numarul este par");
        } else {
            System.out.println("numarul este impar");

        }

        //exercitiu3
        String currentForecast = "rainy";
        int currentWindSpeed = 30;
        if (currentForecast == "rainy" || currentForecast == "snowing" && currentWindSpeed >= 30) {
            System.out.println("Ramai in casa, este periculos afara");
        } else
            System.out.println("Poti face o plimbare in aer liber");


        //exercitiu4
        int number = 6;
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("fizzbuzz");
        } else if (number % 3 == 0) {
            System.out.println("fizz");
        } else if (number % 5 == 0) {
            System.out.println("buzz");
        } else
            System.out.println("nu se incadreaza");

        //exercitiu5
        int a5 = 1;
        int b5 = 2;
        int c5 = 3;
        if (a5 == b5 && b5 == c5) {
            System.out.println("Toate numerele sunt egale");
        } else if (a5 != b5 && b5 != c5) {
            System.out.println("Toate numerele sunt diferite");
        } else {
            System.out.println("cel putin doua numere sunt egale");
        }
        //exercitiu6
        int year = 2020;
        if (year % 4 == 0 || year % 400 == 0 && year % 100 != 1) {
            System.out.println("anul " + year + " este bisect");
        } else {
            System.out.println("nu este an bisect");

        }

        //exercitiu7
        int guess = 7;
        int answer = 7;
        if (answer > guess) {
            System.out.println("Nu ai ghicit, numarul este prea mare");
        } else if (answer < guess) {
            System.out.println("Nu ai ghicit, numarul este prea mic");
        } else {
            System.out.println("Ai ghicit solutia");

        }
        //exercitiu1

        Scanner console = new Scanner(System.in);
        int day;
        System.out.println("Introdu numarul aferent zilei saptamanii:");
        day = console.nextInt();
        switch (day) {
            case 1:
                System.out.println("Luni");
                break;
            case 2:
                System.out.println("Marti");
                break;
            case 3:
                System.out.println("Miercuri");
                break;
            case 4:
                System.out.println("Joi");
                break;
            case 5:
                System.out.println("Vineri");
                break;
            default:
                System.out.println("Introdu un numar intre 1-5");

        }


        //exercitiu2

        Scanner console1 = new Scanner(System.in);
        int n;
        System.out.println("Introdu numarul al carui factorial va fi calculat:");
        n = console1.nextInt();
        int i = 1;
        int factorial = 1;
        while (i <= n) {
            factorial *= i;
            i++;
            System.out.println(factorial);
        }

        //exercitiu3

        Scanner console2 = new Scanner(System.in);
        int n1;
        System.out.println("Introdu numarul pentru care se va calcula suma cifrelor:");
        n1 = console2.nextInt();
        int sum = 0;
        while (n1 > 0) {
            sum = sum + (n1 % 10);
            n1 = n1 / 10;
            int result = sum + n1;
            System.out.println(result);
        }

        //exercitiu4


        Scanner console5 = new Scanner(System.in);
        int n2;
        System.out.println("Introdu numarul pentru care se va calcula suma numerelor divizibile cu 3 si suma numerelor divizibile cu 7:");
        n2 = console5.nextInt();
        int i2 = 1;
        int sum3 = 0;
        int sum7 = 0;
        while (i <= n) {
            if (i % 3 == 0) {
                sum3 += i;
            }
            if (i % 7 == 0) {
                sum7 += i;
            }
            i++;
        }
        System.out.println("suma numerelor divizibile cu 3 este " + sum3);
        System.out.println("suma numerelor divizibile cu 7 este " + sum7);


        //exercitiu5

        //import java.util.Random;
        //import java.util.Scanner;


        Random random = new Random();
        int answer2 = random.nextInt(10) + 1;
        Scanner console21 = new Scanner(System.in);
        System.out.println("Introdu prima posibilitate");
        int guess1 = 0;
        int noOfTry = 0;
        while (guess != answer) {
            guess = console21.nextInt();
            noOfTry++;

            if (guess < answer) {
                System.out.println("Numarul introdus este prea mic");

            } else if (guess > answer){
                System.out.println("Numarul introdus este prea mare");

            }
        }
        System.out.println("Felicitari! Ti-a luat " + noOfTry + " incercari pana ai reusit");

//1 Scrie un program care sa afiseze media numerelor consecutive de la x la y, unde x si y sunt introduse de la tastatura.
//Date de intrare: x=3, y=5 => Rezultat: 4. Explicatie: (3+4+5)/3

    Scanner console12 = new Scanner(System.in);
    int x;
        System.out.println("introdu valoarea pentru x");
    x = console12.nextInt();
    int y;
        System.out.println("introdu valoarea pentru y");
    y = console12.nextInt();
    int rez = 0;
    int mean = 0;
        for (int i1 = x; i <= y; i++)
    mean = rez / 3;
        System.out.println(mean);

// 2  Scrie un program care afiseaza toate numerele de la x la y care sunt divizibile si cu 3 si cu 7 in acelasi timp, unde x si y sunt introduse de la tastatura.
//    Date de intrare: x=1, y=22 => Rezultat: 21

    Scanner console123 = new Scanner(System.in);
    int x1;
        System.out.println("introdu valoarea pentru x");
    x1 = console123.nextInt();
    int y1;
        System.out.println("introdu valoarea pentru y");
    y1 = console123.nextInt();
    int var = 0;
        for (int i1 = x1; i <= y1; i++) {
        // System.out.println(i );
        if ((i % 3 == 0) && (i % 7 == 0)) {
            System.out.println(i);
        }
    }

//3  Scrie un program care verifica daca un numar introdus de la tastatura este numar prim (adica daca se imparte exact doar la 1 si la el insusi)
//Date de intrare: x=7 => Rezultat: “7 este numar prim”
//Date de intrare: x=12 => Rezultat: “12 nu este numar prim”

    Scanner console3 = new Scanner(System.in);
    int n3;
        System.out.println("introdu valoarea pentru n3");
    n3 = console3.nextInt();

        for (int i1 = 2; i <= n3; i++) {
        if (n3 % i == 0) {
            System.out.println(n3 + "este prim");
        } else {
            System.out.println(n3 + "nu este prim");
        }
    }
    //4   Scrie un program care calculeaza x la puterea y, unde x si y sunt introduse de la tastatura.
    // Date de intrare: x=2, y=3 => Rezultat: 8. Explicatie: 2 la puterea 3 este 2*2*2, adica 8
    Scanner console51 = new Scanner(System.in);
    int x12;
        System.out.println("introdu valoarea pentru x");
    x12 = console51.nextInt();
    int y12;
        System.out.println("introdu exponentul lui x");
    y12 = console51.nextInt();
    long rez2 = 1;
        while (y12 != 0) {
        // System.out.println(Math.pow(x12, y12));
        rez *= x12;
        y12--;
    }
        System.out.println(rez);

    // 5      5Esti programator si dezvolti un magazin online. Ai nevoie sa calculezi pretul total al produselor din cosul de cumparaturi, pentru a-l afisa utilizatorului. Scrie un program care sa afiseze suma preturilor dintr-o lista de preturi.
//           Date de intrare: int[] prices = {1, 7, 3, 10, 9}=> Rezultat: 30
    int total1 = 0;
    int[] prices = {1, 7, 3, 10, 9};
        for (int i12 = 0; i < prices.length; i++) {
        total1 = total1 + prices[i];
    }
    //6   System.out.println("Totalul este " + total1);
    //  Esti programator si dezvolti un magazin online. Ai nevoie sa calculezi cel mai mare si cel mai mic pret dintr-o lista de preturi pentru a le afisa utilizatorului. Scrie un program care sa determina cel mai mare si cel mai mic numar dintr-o lista.
    //Date de intrare: int[] prices = {1, 7, 3, 10, 9}, => Rezultat: “Cel mai mic pret este 1, iar cel mai mare pret este 10”


    int[] prices2 = {1, 7, 3, 10, 9};
    int maxPrice = prices2[0];
    int minPrice = prices2[0];
        for (int i12 = 0; i < prices2.length; i++) {
        // maxPrice = Math.max(maxPrice, prices2[i]);
        // minPrice = Math.min(minPrice, prices2[i]);
        if (minPrice < prices[i]) {
            minPrice = prices[i];
            System.out.println("cel mai mic pret este:" + minPrice);
        } else if (maxPrice > prices[i]) {
            maxPrice = prices[i];
            System.out.println("cel mai mare pret este:" + maxPrice);
        }
    }

    //7   Scrie un program care sa afiseze cate numere pare si cate numere impare se afla intr-un array:
    //     Date de intrare: int[] prices = {1, 7, 3, 10, 9} => Rezultat: “4 numere impare si 1 numar par"

    int[] prices3 = {1, 7, 3, 10, 9};
    int parNo = 0;
    int imparNo = 0;
        for (int i12 = 0; i < prices3.length; i++) {

        if (prices3[i] % 2 == 0) {
            // number = prices3.length ;
            parNo++;
        } else {
            imparNo++;
        }
    }
        System.out.println(imparNo + " numere impare");
        System.out.println(parNo + " numere pare");


    //8  Esti programator si dezvolti un magazin online. Vrei sa dai posibilitatea utilizatorului sa vada lista de produse de la coada la cap.
    //         Scrie un program care sa inverseze elementele unui array si sa le afiseze in consola.
    //  Date de intrare:  int[] prices = {1, 7, 3, 10, 9} => Rezultat: 9, 10, 3, 7, 1
    int[] prices4 = {1, 7, 3, 10, 9};
    int[] reversePrices = new int[5];
    int j = 0;
        for (int i1 = prices4.length - 1; i >= 0; i--) {
        reversePrices[j] = prices4[i];
        j++;
    }
        for (int i1 = 0; i < reversePrices.length; i++) {
        System.out.println(reversePrices[i]);
    }
        //        //ex1
//        Scanner console = new Scanner(System.in);
//
////        newValue();
////        sumConsoleNumbers
//
//    }
////        public static void newValue () {
////            int x;
////            System.out.println("Valoarea pentru x");
////            x = console.nextInt();
////            int y;
////            System.out.println("Valoarea pentru y");
////            y = console.nextInt();
//
//        }
//    }
//    public static int sumConsoleNumbers(int[] i) {
//
//        int sum = 0;
//        int mean = 0;
//
//        for (int i = x; i <= y; i++) {
//            sum = sum + i;
//        }
//        mean = sum / 3;
//        return mean;
//    }
//    public  static void printMeanValue (string meanValue) {
//         System.out.println(mean);
//}
//}
//    //ex2
//
//    Scanner console1 = new Scanner(System.in);
//    int x1;
//        System.out.println("Valoarea pentru x1");
//    x1 =console1.nextInt();
//    int y1;
//        System.out.println("Valoarea pentru y1");
//    y1 =console.nextInt();
//
//        for(
//    int i = x1;
//    i <=y1;i++)
//
//    {
//        if ((i % 3 == 0) && (i % 7 == 0)) {
//            System.out.println(i);
//        }
//
//    }
}
}