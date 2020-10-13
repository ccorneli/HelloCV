package cv;// Example from:
//https://opencv-java-tutorials.readthedocs.io/en/latest/02-first-java-application-with-opencv.html

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;

public class HelloCV {
    public static void main(String[] args){
        //Set:
        // -Djava.library.path=/usr/local/Cellar/opencv/4.2.0_1/share/java/opencv4/
        // it's looking for library: libopencv_java420.dylib
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        Mat mat = Mat.eye(3, 3, CvType.CV_8UC1);
        System.out.println("mat = " + mat.dump());
    }
}