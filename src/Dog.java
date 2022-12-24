public class Dog {
    private String name;
    private int age;
    private String color;
    private String breed;
    public Dog(){
        name = "";
        age = 0;
        color = "";
        breed = "";
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public String getBreed(){
        return breed;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int ageconvert(){
        int personage = age*7;
        return personage;
    }
    public String toString(){
        String result = Integer.toString(age);
        return "Dogs name :"+name+", Dogs age : "+age+", Dogs breed: "+breed+", Dogs color: "+color;
    }
}
