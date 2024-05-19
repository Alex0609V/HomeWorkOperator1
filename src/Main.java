public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 15;
        if (age >= 18) {
            System.out.printf("Если возраст человека равен %s он совершеннолетний !", age);
        } else {
            System.out.printf("Если возраст человека равен %s он не достиг совершеннолетия, нужно немного подождать !", age);

            System.out.println("Задача 2");

            int temperature = 4;
            if (temperature <= 5) {

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

            int person = 23;
            if (person > 2 && person <= 6) {

                System.out.printf("Если возраст человека равен %s то ему нужно ходить детский сад", person);
            }


            if (person > 7 && person <= 17) {


                System.out.printf("Если возраст человека равен %s то ему нужно ходить в школу\n", person);


            }
            if (person >= 18 && person <= 24) {
                System.out.printf("Если возраст человека равен %s то ему нужно ходить в университет\n", person);
            }

            if (person > 24) {
                System.out.printf("Если возраст человека равен %s то ему нужно ходить на работу\n", person);

            }
            System.out.println("Задача 5");
            //Если ребенку меньше 5 лет, то он не может кататься на аттракционе.
            // Если ребенку больше 5, но меньше 14 лет, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.
            // Если ребенок старше 14 лет, то он может кататься без сопровождения взрослого
            int childAge = 15;
            if (childAge < 5) {
                System.out.printf("Если возраст ребенка равен %s, то ему нельзя кататься на аттракционе\n", childAge);
            }
            if (childAge > 5 && childAge <= 14) {
                System.out.printf("Если возраст ребенка равен %s, то ему можно кататься на аттракционе\n", childAge);
            }
            if (childAge > 14) {
                System.out.printf("Если возраст ребенка равен %s, то ему можно кататься на аттракционебез сопровождения взрослого\n", childAge);
            }

            System.out.println("Задача 6"); // эту задачу я не понял были сложности!
            int wagonСapacity = 102;
            int sedCapacity = 50;
            int stendCapacity = wagonСapacity - sedCapacity;
            int position = 200;
            if (position <= sedCapacity) {
                    System.out.println("Можно сидеть!");
                }
                if (position > sedCapacity && position <= wagonСapacity) {
                        System.out.println("Можно ехать стоя!");
                    }
                    if (position > wagonСapacity) {
                        System.out.println("Нет мест");
                    }
                        System.out.println("Задача 7");

                    }
                }


            }









































