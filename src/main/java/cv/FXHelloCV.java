package cv;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import org.opencv.core.Core;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;

public class FXHelloCV extends Application {
    static {
        System.out.println("Static app from main()");
      //  System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        System.load("/usr/local/Cellar/opencv/4.2.0_1/share/java/opencv4/libopencv_java420.dylib");
    }

    @Override
    public void start(Stage primaryStage)
    {
        try
        {
            System.out.println("Starting App..");
            String pathSeparator = System
                    .getProperty("path.separator");
            String[] classPathEntries = System
                    .getProperty("java.class.path")
                    .split(pathSeparator);

            for (String url : classPathEntries) {
                System.out.println("#### " + url);
            }
            // load the FXML resource
//            File file = new File(this.getClass().getResource("FXHelloCV.fxml").getPath());
//            System.out.println("File exists" + file.exists());
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXHelloCV.fxml"));
            // store the root element so that the controllers can use it
            BorderPane rootElement = (BorderPane) loader.load();
            // create and style a scene
            Scene scene = new Scene(rootElement, 800, 600);
//            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            // create the stage with the given title and the previously created
            // scene
            primaryStage.setTitle("JavaFX meets OpenCV");
            primaryStage.setScene(scene);
            // show the GUI
            primaryStage.show();

            // set the proper behavior on closing the application
            FXHelloCVController controller = loader.getController();
            primaryStage.setOnCloseRequest((new EventHandler<WindowEvent>() {
                public void handle(WindowEvent we)
                {
                    controller.setClosed();
                }
            }));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        // load the native OpenCV library
        System.out.println("Starting app from main()");
       // System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        launch(args);
    }


}
