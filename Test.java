import java.util.Scanner;

    public class Test {

        public static void main(String[] args) {
            Scanner q1 = new Scanner(System.in);
            System.out.println("Привет! Ответь на 10 вопросов");
            System.out.println("Где расположена Сикстинская капелла - резиденция папы Римского?");
            System.out.println("1.Италия");
            System.out.println("2.Сан-Марино");
            System.out.println("3.Ватикан");

            int val1 = q1.nextInt();
            while (val1 != 3) {
                System.out.println("Не правильно");
                val1 = q1.nextInt();
            }
            System.out.println("Правильно");

                     
            System.out.println("Вопрос №2");
            System.out.println("Что вдохновило Ньютона на открытие классической теории тяготения?");
            System.out.println("1.яблоко");
            System.out.println("2.лист");
            System.out.println("3.апельсин");
            int val2 = q1.nextInt();
            while (val2 != 1) {
                System.out.println("Не правильно");
                val2 = q1.nextInt();
            }
            System.out.println("Правильно");

            System.out.println("Вопрос №3");
            System.out.println("С какой планеты Супермен?");
            System.out.println("1.Нетрополис");
            System.out.println("2.Титан");
            System.out.println("3.Криптон");
            int val3 = q1.nextInt();
            while (val3 != 3) {
                System.out.println("Не правильно");
                val3 = q1.nextInt();
            }
            System.out.println("Правильно");

            System.out.println("Вопрос №4");
            System.out.println("Какая компания производит автомобиль Mustang?");
            System.out.println("1.Ford");
            System.out.println("2.Chevrolet");
            System.out.println("3.Tesla");
            int val4 = q1.nextInt();
            while (val4 != 1) {
                System.out.println("Не правильно");
                val4 = q1.nextInt();
            }
            System.out.println("Правильно");

            System.out.println("Вопрос №5");
            System.out.println("Чья хромосома определяет пол плода?");
            System.out.println("1.Обоих партнёров");
            System.out.println("2.Отцовская");
            System.out.println("3.Материнская");
            int val5 = q1.nextInt();
            while (val5 != 2) {
                System.out.println("Не правильно");
                val5 = q1.nextInt();
            }
            System.out.println("Правильно");

            System.out.println("Вопрос №6");
            System.out.println("Какой орган у человека вырабатывает инсулин?");
            System.out.println("1.Печень");
            System.out.println("2.Желчный пузырь");
            System.out.println("3.Поджелудочная железа");
            int val6 = q1.nextInt();
            while (val6 != 3) {
                System.out.println("Не правильно");
                val6 = q1.nextInt();
            }
            System.out.println("Правильно");

            System.out.println("Вопрос №7");
            System.out.println("С чего началась Вселенная согласно теории Большого врыва?");
            System.out.println("1.Ураган");
            System.out.println("2.Метеоритный дождь");
            System.out.println("3.Взрыв");
            int val8 = q1.nextInt();
            while (val8 != 3) {
                System.out.println("Не правильно");
                val8 = q1.nextInt();
            }
            System.out.println("Правильно");

            System.out.println("Вопрос №8");
            System.out.println("Где находится телебашня CN Tower?");
            System.out.println("1.Канада!");
            System.out.println("2.Португалия");
            System.out.println("3.США");
            int val18 = q1.nextInt();
            while (val18 != 1) {
                System.out.println("Не правильно");
                val18 = q1.nextInt();
            }
            System.out.println("Правильно");

            System.out.println("Вопрос №9");
            System.out.println("Посредством чего человеческий мозг коммуницирует с остальным организмом?");
            System.out.println("1.Нервы");
            System.out.println("2.Артерии");
            System.out.println("3.Капилляры");
            int val9 = q1.nextInt();
            while (val9 != 1) {
                System.out.println("Не правильно");
                val9 = q1.nextInt();
            }
            System.out.println("Правильно");

            System.out.println("Вопрос №10");
            System.out.println("Какой газ необходим для горения костра?");
            System.out.println("1.Гелий");
            System.out.println("2.Кислород");
            System.out.println("3.Водород");
            int val10 = q1.nextInt();
            while (val10 != 2) {
                System.out.println("Не правильно");
                val10 = q1.nextInt();
            }
            System.out.println("Правильно. Молодец ты прошел все 10 вопросов!");

        }

    }


