public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 15;
        if (age >= 18) {
            System.out.printf("Если возраст человека равен %s он совершеннолетний !", age);
        } else {
            System.out.printf("Если возраст человека равен %s он не достиг совершеннолетия, нужно немного подождать !", age);

            System.out.println("Задача 2");

            int temperature = 5;
            if (temperature < 5) {

                System.out.printf("На улице холодно  нужно надеть шапку");
            } else {

                System.out.printf("Сегодня тепло, можно идти без шапки");
            }
            System.out.println("Задача 3");


            int speed = 65;
            if (speed > 60) {

                System.out.printf("Если скорость %s то придется заплатить штраф !", speed);

            } else {

                System.out.printf("Если скорость %s то можно ездить спокойно !", speed);
            }

            System.out.println("Задача 4");

            int person = 17;
            if (person > 2 && person <= 6) {

                System.out.printf("Если возраст человека равен %s то ему нужно ходить детский сад", person);
            }


            if (person >= 7 && person <= 17) {


                System.out.printf("Если возраст человека равен %s то ему нужно ходить в школу\n", person);


            }
            if (person >= 18 && person <= 24) {
                System.out.printf("Если возраст человека равен %s то ему нужно ходить в университет\n", person);
            }


            if (person > 24) {
                System.out.printf("Если возраст человека равен %s то ему нужно ходить на работу\n", person);

            }
            System.out.println("Задача 5");

            int childAge = 14;
            boolean conductiveAdult = childAge > 5 && childAge <= 14;
            if (childAge < 5) {
                System.out.printf("Если возраст ребенка равен %s, то ему нельзя кататься на аттракционе\n", childAge);
            } else { if (conductiveAdult) {

                }
                if (childAge > 5 && childAge <= 14) {
                    System.out.printf("Если возраст ребенка равен %s, то ему можно кататься на аттракционе только в сопровождении взрослого,если взрослого нет, то кататься нельзя \n", childAge);
                }
                if (childAge > 14) {
                    System.out.printf("Если возраст ребенка равен %s, то ему можно кататься на аттракционе без сопровождения взрослого\n", childAge);
                }

                System.out.println("Задача 6");
                int wagonСapacity = 102;
                int sedCapacity = 60;
                int stendCapacity = wagonСapacity - sedCapacity;
                int position = 170;
                if (position <= sedCapacity) {
                    System.out.println("Можно сидеть!");
                }
                if (position > sedCapacity && position <= wagonСapacity) {
                    System.out.println("Можно ехать стоя!");
                }
                if (position > wagonСapacity) {
                    System.out.println("Нет мест усё!");


                    System.out.println("Задача 7");

                    int one = 1;
                    int two = 2;
                    int three = 3;

                    if (one > two && one < three) {
                        System.out.println("Первое число самое большое " + one);

                    } else if (two > three) {
                        System.out.println("Второе число самое большое " + two);
                    } else {
                        System.out.println("Третье число самое большое " + three);
                    }
                }
            }
        }
    }
}







































































