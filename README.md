# Gstreamer-Android-example for eclipse

Use Gstreamer 1.8.2

I was manual build so.

## How to

1. Download GStreamer Android library from [freedesktop page](http://gstreamer.freedesktop.org/data/pkg/android/).
 I was using [1.8.2](http://gstreamer.freedesktop.org/data/pkg/android/1.8.2/)
 (gstreamer-1.0-android-arm-release-1.8.2.tar.bz2). Extract everything somewhere.
2. Edit `jni/Android.mk` file and set `GSTREAMER_ROOT_ANDROID` to the path where your extracted Gstreamer library.
3. To the Root run ndk-build.
4. Move the libs to project and open with eclipse
