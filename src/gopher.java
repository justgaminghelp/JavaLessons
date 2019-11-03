public class gopher {
    private float weight, morality;
    private String view;

    public void allSet(float weight,float morality,String view ){
        setWeight(weight);
        setMorality(morality);
        setView(view);
    }
    public String allOut(){
        return "Суслик - " + getView() + ".Весом в " + getWeight() + "кг . Морален же этот сусляндий на " + getMorality() + " пунктов морали";
    }



    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setMorality(float morality) {
        this.morality = morality;
    }

    public float getMorality() {
        return morality;
    }

    public void setView(String view) {
        this.view = view;
    }

    public String getView() {
        return view;
    }
}
