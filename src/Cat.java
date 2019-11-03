public class Cat {
    private String name,color;
    private float weight;

    public void AllData (String name, float weight, String color){
        setName(name);
        setWeight(weight);
        setColor(color);
    }

    public String All_Out(){
        return getName() + getWeight() + getColor();
    }


    public void setColor(String color) {
        this.color = color;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    //Получаем значениия имени и веса из set'еров
    public String getColor() {
        return color;
    }
    public String getName() {
        return name;
    }
    public float getWeight() {
        return weight;
    }
}


