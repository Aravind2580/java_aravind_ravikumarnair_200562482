import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CameraApp extends Application {

    private TextField brandField;
    private TextField modelField;
    private TextField resolutionField;
    private TextField priceField;
    private TextField lensTypeField;
    private Text output;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Camera Details");

        // Initialize TextFields with prompts
        brandField = new TextField();
        brandField.setPromptText("Brand");

        modelField = new TextField();
        modelField.setPromptText("Model");

        resolutionField = new TextField();
        resolutionField.setPromptText("Resolution");

        priceField = new TextField();
        priceField.setPromptText("Price");

        lensTypeField = new TextField();
        lensTypeField.setPromptText("Lens Type");

        // Button to create Camera object
        Button createButton = new Button("Create Camera");
        createButton.setOnAction(e -> createCamera());

        output = new Text();

        // Layout setup
        VBox layout = new VBox(10, brandField, modelField, resolutionField, priceField, lensTypeField, createButton, output);
        Scene scene = new Scene(layout, 300, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void createCamera() {
        try {
            // Retrieve input from TextFields
            String brand = brandField.getText();
            String model = modelField.getText();
            String resolution = resolutionField.getText();
            String price = priceField.getText();
            String lensType = lensTypeField.getText();

            // Create Camera object
            Camera camera = new Camera(brand, model, resolution, price, lensType);

            // Clear the TextFields after successful creation
            brandField.clear();
            modelField.clear();
            resolutionField.clear();
            priceField.clear();
            lensTypeField.clear();

            // Display Camera object's details
            output.setText(camera.toString());
        } catch (Exception e) {
            // Display error message if creation fails
            output.setText("Error creating Camera object: " + e.getMessage());
        }
    }
}
