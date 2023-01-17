package Story;

import Abstracts.*;
import Subjects.*;


public class Story {
    public static void main(String[] args) throws MyException.StorylineException {
        try {
            Location home = new Home("Дом", 0, Time.NIGHT);
            Location road = new Road("Дорога", 10, Time.NIGHT);
            Location cosmiccity = new CosmicCity("Космический городок", 20, Time.NIGHT);
            Location square = new Square("Круглая площадь", 30, Time.NIGHT);
            Location nearrocket = new NearRocket("Вблизи ракеты", 40, Time.NIGHT);
            Location airlock = new Airlock("Шлюзовая камера",50, Time.NIGHT);
            Person neznayka = new Person("Незнайка", home, new Point(0,0), IsSleeping.NOTSLEEPING, Thoughs.NOTCALM);
            neznayka.calm();
            neznayka.returnToNorm("Аппетит", "Сон");
            OtherGuys korotyshki = new OtherGuys("Другие коротышки", IsSleeping.NOTSLEEPING);
            neznayka.went(cosmiccity);
            korotyshki.went(cosmiccity);
            Transport rocket = new Rocket("Ракета", new Point(0,0), square, Material.METAL);
            rocket.toBeTested();
            neznayka.saw("долгое");
            Travelers travelers = new Travelers("Путешественники");
            neznayka.saw("долгое");
            Person fuksia = new Person("Фуксия", square, new Point(0,0), IsSleeping.NOTSLEEPING, Thoughs.NEUTRAL);
            Person seledocka = new Person("Селедочка", square, new Point(0,0), IsSleeping.NOTSLEEPING, Thoughs.NEUTRAL);
            fuksia.toLection(seledocka, "Луна", "Межпланетные полеты");
            neznayka.toAccept(30, "Полет на Луну");
            neznayka.toBeChanged("Характер", 20);
            OtherGuys attentiveguys = new OtherGuys("Самые внимательные коротышки");
            attentiveguys.toAttent(neznayka);
            neznayka.think(Thoughs.NEUTRAL);
            korotyshki.notUnderstand(neznayka);
            Person ponchik = new Person("Пончик", home, new Point(0,0), IsSleeping.NOTSLEEPING, Thoughs.NEUTRAL);
            neznayka.meet(ponchik, true);
            OtherGuys korotyshki1 = new OtherGuys("Остальные коротышки", IsSleeping.NOTSLEEPING);
            neznayka.setLocation(home);
            ponchik.setLocation(home);
            neznayka.notSleep();
            ponchik.notSleep();
            korotyshki1.toSleep();
            neznayka.go(road);
            ponchik.go(road);
            ponchik.scare();
            ponchik.regret();
            ponchik.shame();
            neznayka.go(cosmiccity);
            ponchik.go(cosmiccity);
            CelestialBody moon = new Moon("Луна");
            moon.toShine();
            neznayka.go(square);
            ponchik.go(square);
            rocket.toShineR();
            neznayka.think(Thoughs.AMAZED);
            ponchik.think(Thoughs.AMAZED);
            rocket.beBrave();
            neznayka.think(Thoughs.ROCKETWILLFLY);
            ponchik.think(Thoughs.ROCKETWILLFLY);
            neznayka.go(nearrocket);
            ponchik.go(nearrocket);
            canBePressed button = new canBePressed() {
                @Override
                public void BePressed(Person person) {
                    System.out.println("Кнопка нажата персонажем " + person.getName());
                    canBeOpened door = new canBeOpened() {
                        @Override
                        public void BeOpened() {
                            System.out.println("Открылась дверца и опустилась небольшая металлическая лестница");

                        }
                    };
                    door.BeOpened();
                }
            };
            button.BePressed(neznayka);
            ponchik.delay();
            neznayka.saw("быстрое");
            neznayka.grabHim(ponchik);
            neznayka.go(airlock);
            ponchik.go(airlock);
            canBeClosed outdoor = new canBeClosed() {
                @Override
                public void BeClosed() {
                    System.out.println("Наружняя дверь автоматически закрылась");
                }
            };
            outdoor.BeClosed();
            ponchik.saw("быстрое");
            ponchik.scare();
            ponchik.freeze();
            ponchik.onSoul("грустно", "обидно до слез");


        } catch (Exception exception) {
            exception.printStackTrace();
            System.out.println("Что-то не так");
            throw new MyException.StorylineException();
        }

    }
}
