public class Camera {
    private String brand;
    private String model;
    private String resolution;
    private String price;
    private String lensType;

    // Constructor to initialize all instance variables
    public Camera(String brand, String model, String resolution, String price, String lensType) {
        this.brand = brand;
        this.model = model;
        this.resolution = resolution;
        this.price = price;
        this.lensType = lensType;
    }

    // Overriding toString to provide a string representation of the Camera object
    @Override
    public String toString() {
        return "Camera Details: \n" +
                "Brand: " + brand + "\n" +
                "Model: " + model + "\n" +
                "Resolution: " + resolution + "\n" +
                "Price: " + price + "\n" +
                "Lens Type: " + lensType;
    }
}
