# HelloCV

Working through example from [this tutorial](https://opencv-java-tutorials.readthedocs.io/en/latest/02-first-java-application-with-opencv.html)

Special Notes:  
Used homebrew to install opencv, compiled from source to enable java support (as instructed in tutorial)

````bash
brew edit opencv 
#changed  -DBUILD_opencv_java=OFF to -DBUILD_opencv_java=ON 
brew install --build-from-source opencv

 #For Intellij which is looking for system library: libopencv_java420.dylib
   -Djava.library.path=/usr/local/Cellar/opencv/4.2.0_1/share/java/opencv4/
 ````

 
