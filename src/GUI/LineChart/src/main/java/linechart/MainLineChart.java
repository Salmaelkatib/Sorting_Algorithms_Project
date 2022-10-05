package GUI.LineChart.src.main.java.linechart;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainLineChart extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainLineChart.class.getResource("/GUI/LineChart/src/main/resources/Test.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Line Chart");
        
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}