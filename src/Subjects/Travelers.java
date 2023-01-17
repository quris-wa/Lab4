package Subjects;

public class Travelers {
    String name;
    public Travelers(String name){
        this.name = name;
        joinToStory();
        toTrain();
    }
    public void joinToStory(){
        System.out.println(name + " присоединились к истории");
    }
    public void toTrain(){
        System.out.println(name + " тренировались перед полетом в космос");
    }

}
