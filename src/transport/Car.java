package transport;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;



    public Car(String brand, String model, double engineVolume, String color, int productionYear,
               String productionCountry, String transmission, String bodyType, String registrationNumber, int numberOfSeats) {

        this.brand = (brand == null || brand.isBlank()) ? "Автомобиль " : brand;
        this.model = (model == null || model.isBlank()) ? "" : model;
        this.productionYear = (productionYear <=0 ) ? 2000 : productionYear;
        this.bodyType = (bodyType == null || bodyType.isBlank()) ? "custom" : bodyType;
        this.numberOfSeats = (numberOfSeats <=0 ) ? 4 : numberOfSeats;
        this.setEngineVolume(engineVolume);
        this.setTransmission(transmission);
        this.setColour(color);
        this.productionCountry = (productionCountry == null || productionCountry.isBlank())
                ? "Made in ..." : productionCountry;
        this.setRegistrationNumber(registrationNumber);

    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = (engineVolume <= 0) ? 1.5 : engineVolume;
    }
    public void setTransmission(String transmission) {
        this.transmission = (transmission == null || transmission.isBlank()) ? "top secret" : transmission;
    }
    public void setColour(String colour) {
        this.color = (colour == null || colour.isBlank()) ? "Белый" : colour;
    }
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = (registrationNumber == null || registrationNumber.isBlank())
                ? "а000аа49" : registrationNumber;
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getProductionYear() {
        return productionYear;
    }
    public String getCarBodyType() {
        return bodyType;
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public double getEngineVolume() {
        return engineVolume;
    }
    public String getTransmission() {
        return transmission;
    }
    public String getColour() {
        return color;
    }
    public String getProductionCountry() {
        return productionCountry;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String changeTires (int month) {
        if (month >= 4 && month <= 11) {
            return "летние шины";
        } else {
            if (month <= 0 || month > 12) {
                return "всесезонные шины";
            } else {
                return "зимние шины";
            }
        }
    }

    public String toString () {
        return "__________________" + '\n' + brand + " " + model + '\n' + "\t объем двигателя - " + engineVolume + " л.\n" + "\t цвет - " + color
                + ".\n" + "\t год выпуска - " + productionYear + " г.\n" + "\t страна сборки - " + productionCountry + ".\n" + "\t коробка передач - " + transmission
                + "\n" + "\t кузов - " + bodyType + "\n" + "\t регистрационный номер - " + registrationNumber + "\n" + "\t количество мест - " + numberOfSeats
                 + ".";
    }
}
