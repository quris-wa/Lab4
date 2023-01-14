public abstract class Transport implements canChangeLoc {
    private String name;
    private Point point;
    private Location location;
    private Material material;
    public Transport(String name, Point point, Location location, Material material) {
        this.name = name;
        this.point = point;
        this.location = location;
        this.material = material;
        this.joinToStory();
        System.out.println("Транспорт " + name + " находится в локации " + this.location.getLocationName());
    }
    void toShineR(){
        if(getName().equals("Ракета") && material.equals(Material.METAL)){
            System.out.println(name + " поблескивала своими стальными боками");
        }
    }
    public void toBeTested(){
        System.out.println("Транспорт " + name + " был испытан");
    }
    public void beBrave(){
        System.out.println(name + " имела в очертаниях что-то смелое и стремительное");
    }
    public String getName() {
        return name;
    }
    private void joinToStory() {
        System.out.println("Транспорт " + name + " присоединился к истории");
    }
    @Override
    public void setLocation(Location location) {
        this.location = location;
    }
}
