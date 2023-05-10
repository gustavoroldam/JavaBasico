import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calculator extends Application {
    private final int WIDTH = 300;
    private final int HEIGHT = 250;

    private TextField display = new TextField();

    @Override
    public void start(Stage primaryStage) {
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);

        display.setEditable(false);
        root.add(display, 0, 0, 4, 1);

        String[][] buttons = {
                {"7", "8", "9", "/"},
                {"4", "5", "6", "*"},
                {"1", "2", "3", "-"},
                {"0", ".", "=", "+"}
        };

        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons[i].length; j++) {
                Button button = new Button(buttons[i][j]);
                root.add(button, j, i + 1);

                button.setOnAction(e -> {
                    String text = button.getText();

                    switch (text) {
                        case "=":
                            display.setText(eval(display.getText()));
                            break;

                        case "C":
                            display.clear();
                            break;

                        default:
                            display.appendText(text);
                            break;
                    }
                });
            }
        }

        Scene scene = new Scene(root, WIDTH, HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculator");
        primaryStage.show();
    }

    private String eval(String expression) {
        try {
            return Double.toString(new javax.script.ScriptEngineManager().getEngineByName("JavaScript").eval(expression));
        } catch (Exception e) {
            return "Error";
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
