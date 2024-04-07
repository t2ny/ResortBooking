
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;
import java.text.NumberFormat;

public class ResortTest extends Application {
  private TextField nameField;
  private TextField mealsField;
  private TextField spaField;
  private Text welcome;
  private Text enterInfo;

  NumberFormat df = NumberFormat.getCurrencyInstance();

  public void start(Stage primaryStage) {

    primaryStage.setTitle("Package Calculator");

    Label nameLabel = new Label("Guest Name:");
    nameField = new TextField();
    nameField.setPrefWidth(125);

    Label mealsLabel = new Label("Number of À la Carte Meals:");
    mealsField = new TextField();
    mealsField.setPrefWidth(50);

    Label spaLabel = new Label("Number of Spa Visits:");
    spaField = new TextField();
    spaField.setPrefWidth(50);

    Button tourist = new Button("Tourist");
    Button elite = new Button("Elite");
    Button reset = new Button("Reset");

    tourist.setOnAction(this::calculateTourist);
    elite.setOnAction(this::calculateElite);
    reset.setOnAction(this::clearRequest);

    welcome = new Text("Welcome to Paradise Palms!");
    enterInfo = new Text("Enter your booking information.");

    FlowPane pane = new FlowPane(nameLabel, nameField, mealsLabel, mealsField, spaLabel,
        spaField, tourist, elite, reset, welcome, enterInfo);
    pane.setAlignment(Pos.CENTER);
    pane.setHgap(10);
    pane.setVgap(20);

    Scene scene = new Scene(pane, 250, 350);

    primaryStage.setScene(scene);
    primaryStage.show();
  }// end method

  public void calculateTourist(ActionEvent events) {

    TouristPackageBooking total = new TouristPackageBooking(nameField.getText(), Integer.parseInt(spaField.getText()),
        Integer.parseInt(mealsField.getText()));
    double sum = total.getTotal();
    welcome.setText("Building Number: " + total.getBuildingNum());
    enterInfo.setText("Total price for this package: " + df.format(sum));

  }

  public void calculateElite(ActionEvent events) {

    ElitePackageBooking total = new ElitePackageBooking(nameField.getText(), Integer.parseInt(spaField.getText()),
        Integer.parseInt(mealsField.getText()));
    double sum = total.getTotal();
    welcome.setText("Building Number: " + total.getBuildingNum());
    enterInfo.setText("Total price for this package: " + df.format(sum));

  }

  public void clearRequest(ActionEvent events) {
    welcome.setText("Welcome to Paradise Palms!");
    enterInfo.setText("Enter your booking information.");
    spaField.setText("");
    mealsField.setText("");
    nameField.setText("");
  }
}
