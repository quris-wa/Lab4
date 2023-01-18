package story;

import abstracts.*;
import subjects.*;


public class Story {
    public static void main(String[] args) throws exception1.StorylineException, exception2.EmptyException {
        try {
            Location home = new Home("Дом", Time.NIGHT, new Point(0,0));
            Location road = new Road("Дорога", Time.NIGHT, new Point(10,0));
            Location cosmiccity = new CosmicCity("Космический городок", Time.NIGHT, new Point(20,0));
            Location square = new Square("Круглая площадь", Time.NIGHT, new Point(30,0));
            Location nearrocket = new NearRocket("Вблизи ракеты", Time.NIGHT, new Point(40,0));
            Location airlock = new Airlock("Шлюзовая камера", Time.NIGHT, new Point(50,0));
            Person neznayka = new Person("Незнайка", home, new Point(0,0), false, Thoughs.NOTCALM);
            neznayka.calm();
            neznayka.returnToNorm("Аппетит", "Сон");
            Person korotyshki = new OtherGuys("Другие коротышки",  home, new Point(0,0), false, Thoughs.NEUTRAL);
            neznayka.went1(cosmiccity);
            korotyshki.went2(cosmiccity);
            Transport rocket = new Rocket("Ракета", new Point(0,0), square, Material.METAL);
            rocket.toBeTested();
            neznayka.saw("долгое");
            Travelers travelers = new Travelers("Путешественники");
            neznayka.saw("долгое");
            Person fuksia = new Person("Фуксия", square, new Point(0,0), false, Thoughs.NEUTRAL);
            Person seledocka = new Person("Селедочка", square, new Point(0,0), false, Thoughs.NEUTRAL);
            fuksia.toLection(seledocka, "Луна", "Межпланетные полеты");
            neznayka.toAccept(30, "Полет на Луну");
            neznayka.toBeChanged("Характер", 20);
            Person attentiveguys = new OtherGuys("Самые внимательные коротышки",  home, new Point(0,0), false, Thoughs.NEUTRAL);
            attentiveguys.toAttent(neznayka);
            neznayka.think(Thoughs.NEUTRAL);
            korotyshki.notUnderstand(neznayka);
            Person ponchik = new Person("Пончик", home, new Point(0,0), false, Thoughs.NEUTRAL);
            neznayka.meet(ponchik, true);
            Person korotyshki1 = new OtherGuys("Остальные коротышки",  home, new Point(0,0), true, Thoughs.NEUTRAL);
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
            СanBePressed button = new СanBePressed() {
                @Override
                public void BePressed(Person person) {
                    System.out.println("Кнопка нажата персонажем " + person.getName());
                    СanBeOpened door = new СanBeOpened() {
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
            СanBeClosed outdoor = new СanBeClosed() {
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
            throw new exception1.StorylineException();
        }

    }
}
