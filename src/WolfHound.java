public class WolfHound {
    int size, age, moonAge;
    boolean health;
    public void allSet(int size, int age, int moonAge){
        setSize(size);
        setAge(age);
        setMoonAge(moonAge);

    }
    public String allOut(){
        return "Досье: "+ "/nРазмеры - " +getSize() + "/nВозраст(по нашему) - " + getAge()+
                "/nВозраст(по лунам) - "+getMoonAge() + "/nЗдоровость - " + health;

    }
        public void setSize(int size) {
            this.size = size;}
    public int getSize() {
        return size;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setMoonAge(int moonAge) {
        this.moonAge = moonAge;
    }

    public int getMoonAge() {
        return moonAge;
    }

    public void setHealth(boolean health) {
        if (size > 180 & age < 20){
            this.health = true;
        }
    }

    }




