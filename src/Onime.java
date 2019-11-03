public class Onime{
    public static void main(String[] args) {
        Dog Dog_One = new Dog();
        Dog Dog_Two = new Dog();
        Cat cat = new Cat();
        /*Dog_One.AllData("Юлик",35.5f,"рыжего");
        Dog_Two.AllData("Юрий",40.15f,"черного");
        cat.AllData("Мурлыкало",20f,"Серо-бурмалиновая");
        System.out.println(Dog_One.All_Out());
        System.out.println(Dog_Two.All_Out());
        System.out.println(cat.All_Out());*/

        //Dopher:
        gopher gop = new gopher();
        WolfHound wolf = new WolfHound();
        gop.allSet(300.0f, 15.0f, "Рыжий Валлиант");
        System.out.println(gop.allOut());
        wolf.allSet(200, 20, 13);
        System.out.println(wolf.allOut());
    }


}
