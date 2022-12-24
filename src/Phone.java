public class Phone {
    private String brand;
    private String model;
    private int year;

    public Phone(){
        brand = "";
        model = "";
        year = 0;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }
    public void setYear(int year){
        this.year=year;
    }
    public int getYear(){
        return year;
    }
    public String toString(){
        return "Telephones Brand: " + brand + ", Model: "+model+", Year: "+year;
    }
    public boolean isObsolete() {
        if(year>10) {
            return true;
        }

        return false;
    }
}
