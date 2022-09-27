public class Main {
    public static void main(String[] args) {
        // задача 1
        System.out.println("Задача 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать!");
        }
        //задача 2
        System.out.println("Задача 2");
        if (age >= 7 && age < 18) {
            System.out.println("Ребёнок ходит в школу");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (age >= 24) {
            System.out.println("Человек окончил университет, ходит на работу");
        }
        //задача 3
        System.out.println("Задача 3");
        int capacity = 102;
        int sittingPlace = 60;
        int standingPlace = capacity - sittingPlace;

        int sitting = 50;
        int standing = 39;

        if (sitting < sittingPlace) {
            System.out.println("В вагоне  " + (sittingPlace - sitting) + "  сидячих мест");
        }
        if (standing < standingPlace) {
            System.out.println("В вагоне  " + (standingPlace - standing) + "  стоячих мест");
        }
        // задача 4
        System.out.println("Задача 4");
        int age1 = 18;
        if (age1 >= 17) {
            System.out.println("Поздравляем с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил!");
        }

        //задача 5
        System.out.println("Задача 5");
        if (age1 >= 7 && age1 < 18) {
            System.out.println("Ребёнок ходит в школу");
        } else if (age1 >= 18 && age1 < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        } else if (age1 >= 24) {
            System.out.println("Человек окончил университет, ходит на работу");
        }
        //задача 6
        System.out.println("Задание 6");

        int capacity1 = 102;
        int sittingPlace1 = 60;
        int standingPlace1 = capacity1 - sittingPlace1;

        int sitting1 = 50;
        int standing1 = 39;

        if (sitting1 < sittingPlace1) {
            System.out.println("В вагоне  " + (sittingPlace1 - sitting1) + "  сидячих мест");
        } else {
            System.out.println("Сидячих мест нет!");
        }
        if (standing1 < standingPlace1) {
            System.out.println("В вагоне  " + (standingPlace1 - standing1) + "  стоячих мест");
        } else {
            System.out.println("Стоячих мест нет");
        }
        // задание 7
        System.out.println("Задание 7");
        int age2 = 19;
        if (age2 >= 2 && age2 <= 6) {
            System.out.println("Человеку нужно ходить в детский сад");
        } else if (age2 >= 7 && age2 <= 18) {
            System.out.println("Ему нужно ходить в школу");
        } else if (age2 >= 18 && age2 <= 24) {
            System.out.println("Человек ходит в университет");
        } else if (age2 >= 24) {
            System.out.println("Человек ходит на работу");
        }
        // задание 8
        System.out.println("Задание 8");
        int ageOfTheChild = 4;
        if (ageOfTheChild < 5) {
            System.out.println("Ребёнок не может кататься на аттракционе");
        } else if (ageOfTheChild < 14) {
            System.out.println("Ребёнок может кататься на аттракционе только в сопровождении взрослого");
        } else {
            System.out.println("Ребёнок может кататься");
        }
        //задание 9
        System.out.println("Задание 9");
        int one = 10;
        int two = 20;
        int three = 50;
        if (one > two) {
            if (one >= three) {
                System.out.println("Максимальное число " + one);
            } else {
                System.out.println("Максимальное число  " + three);
            }
        }else if (two > one) {
            if (two >= three) {
                System.out.println("Максимальное число  " + two);
            } else {
                System.out.println("Максимальное число " + three);
            }
        } else {
            if (one > three) {
                System.out.println("Максимальное число " + one);
            } else if (three > one) {
                System.out.println("Максимальное число  " + three);
            } else {
                System.out.println("Все числа равны");
            }
        }
    }
}

