public class Person implements canChangeLoc {
    private String name;
    private Location location;
    private Point point;
    private IsSleeping isSleeping;
    private Thoughs thoughs;
    private boolean zametil = false;
    public Person(String name, Location location, Point point, IsSleeping isSleeping, Thoughs thoughs) {
        this.name = name;
        this.location = location;
        this.point = point;
        this.isSleeping = isSleeping;
        this.thoughs = thoughs;
        this.joinToStory();
    }

    public String getName() {
        return name;
    }

    private void joinToStory() {
        System.out.println("Персонаж " + name + " присоединился к истории");
    }

    public String getIsSleeping() {
        return isSleeping.toString();
    }

    @Override
    public void setLocation(Location location) {
        this.location = location;
        if (point.getX() == 0)
            System.out.println("Персонаж " + name + " находится в локации " + location.getLocationName() + " его координаты " + point.getX());
    }

    public void go(Location location) {
        point.sumX(10);
        setLocation(location);
        if (location.getLocationName().equals("Круглая площадь")) {
            System.out.println("Персонаж " + name + " прокрадывается в локацию " + location.getLocationName() + " его координаты " + point.getX());
        }
        else if (location.getLocationName().equals("Вблизи ракеты")) {
            System.out.println("Персонаж " + name + " в скрюченном виде проскальзывает в локацию " + location.getLocationName() + " его координаты " + point.getX());
        }
        else {
            System.out.println("Персонаж " + name + " идет в локацию " + location.getLocationName() + " его координаты " + point.getX());
        }
    }

    public void scare() {
        if (name.equals("Пончик") && location.getLocationName().equals("Дорога")) {
            thoughs = Thoughs.SCAREDOFSCAPE;
            System.out.println(name + " боялся уноситься в космическое пространство ");
        }
        else {
            thoughs = Thoughs.SCARED;
            System.out.println("У персонажа " + name + " от испуга все похолодело внутри");
        }
    }

    public void regret() {
        if (name.equals("Пончик") && thoughs.equals(Thoughs.SCAREDOFSCAPE)) {
            thoughs = Thoughs.REGRET;
            System.out.println(name + " уже расскаивался, что пошел с Незнайкой ");
        }
    }

    public void shame() {
        if (name.equals("Пончик") && thoughs.equals(Thoughs.REGRET)) {
            thoughs = Thoughs.SHAME;
            System.out.println(name + " стыдился признать, что струсил ");
        }
    }

    public void notSleep() {
        if (getIsSleeping().equals("NOTSLEEPING")) {
            System.out.println(name + " не лег спать");
        }
    }

    public void think(Thoughs thoughs) {
        if (thoughs.equals(Thoughs.AMAZED)) {
            System.out.println("Персонажу " + name + " кажется, что ракета светится сама собой");
        } else if (thoughs.equals(Thoughs.ROCKETWILLFLY)) {
            System.out.println("Персонажу " + name + " кажется, что ракета вот-вот взлетит ввысь");
        } else if (name.equals("Незнайка")) {
            System.out.println("У персонажа " + name + " припадок задумчивости");
            smile("мечтательно");
        }

    }

    public void smile(String x) {
        if (x.equals("мечтательно")) {
            System.out.println("У персонажа " + name + " появляется мечтательная улыбка на улице, словно он радуется чему-то");
        }
    }

    public void calm() {
        if (thoughs.equals(Thoughs.NOTCALM)) {
            thoughs = Thoughs.NEUTRAL;
            System.out.println("Персонаж " + name + " успокоился");
        }
    }

    void returnToNorm(String name1, String name2) {
        class Appetit {
            String name1;

            public Appetit(String name1) {
                this.name1 = name1;
                System.out.println(name1 + " вернулся к персонажу " + name);
            }
        }
        class normSleep {
            String name2;

            public normSleep(String name2) {
                this.name2 = name2;
                System.out.println(name2 + " улучшился у персонажа " + name);
            }
        }
        Appetit appetit = new Appetit(name1);
        normSleep normSleep = new normSleep(name2);

    }

    public void went(Location location) {

        System.out.println("Персонаж " + name + " приходил на локацию " + location.getLocationName());

    }

    public void saw(String name1) {
        if(name1.equals("быстрое")) {
            System.out.println("Персонаж " + name + " заметил это");
            zametil = true;
        }
        else {
            System.out.println("Персонаж " + name + " наблюдал за этим");
        }
    }

    public void toLection(Person person, String name1, String name2) {
        System.out.println("Персонаж " + name + " проводил лекции на темы " + name1 + " и " + name2 + " с персонажем " + person.getName());
    }

    public void toAccept(int ver, String name1) {
        if (name.equals("Незнайка")) {
            if (ver < 50) {
                System.out.println("Кажется, персонаж " + name + " смирился с потерей мечты " + name1);
            } else {
                System.out.println("Персонаж " + name + " точно смирился с потерей мечты " + name1);
            }
        }
    }

    void toBeChanged(String name1, int ver) {
        if (ver < 50) {
            System.out.println("У персонажа " + name + " как будто переменился " + name1);
        } else {
            System.out.println("У персонажа " + name + " точно переменился " + name1);
        }
    }

    public void meet(Person person, boolean x) {
        System.out.println("Персонаж " + name + " встретил персонажа " + person.getName());
        if (x) {
            System.out.println("Персонаж " + name + " предложил не спать сегодня персонажу " + person.getName());
        } else {
            System.out.println("Персонаж " + name + "ничего не предложил персонажу " + person.getName());
        }
    }
    public void delay(){
        System.out.println("Персонаж " + name + " медлит");
    }
    public void grabHim(Person person){
        if(zametil){
            System.out.println("Персонаж " + name + " взял за руку персонажа " + person.getName());
        }
        else {
            System.out.println("Персонаж " + name + " не стал брать за руку персонажа " + person.getName());
        }
    }
    public void freeze(){
        if(thoughs.equals(Thoughs.SCARED)){
            cantSay();
            nothingToUnderstand();
        }
    }
    public void cantSay(){
        System.out.println("Персонаж " + name + " хотел что-то сказать, но язык одеревенел, голова опустела");
    }
    public void nothingToUnderstand(){
        System.out.println("Персонаж " + name + " ничего не понимал");
        if(name.equals("Пончик")){
            System.out.println("В голове у персонажа " + name + " крутилась песня :");
            System.out.println("Прощай, любимая береза! Прощай, дорогая сосна!");
            thoughs = Thoughs.HURTFUL;
        }
        else {
            System.out.println("Персонаж " + name + " не знал никаких песен");
        }
    }
    public void onSoul(String name1, String name2){
        if(thoughs.equals(Thoughs.HURTFUL)){
            System.out.println("Персонажу " + name + " стало так " + name1 + " и " + name2);
        }
    }

    public Point getPoint() {
        return point;
    }


    public Location getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Персонаж: " + name;
    }

    @Override
    public int hashCode() {
        int result = this.getName() == null ? 0 : this.getName().hashCode();
        return (result * 41);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return ((Person) obj).name.equals(name);
    }
}
