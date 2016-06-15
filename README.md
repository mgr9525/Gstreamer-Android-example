# Gstreamer-Android-example for eclipse

Use Gstreamer 1.8.2

I was manual build so.

## How to

1. Download GStreamer Android library from [freedesktop page](http://gstreamer.freedesktop.org/data/pkg/android/).
 I was using [1.8.2](http://gstreamer.freedesktop.org/data/pkg/android/1.8.2/)
 (gstreamer-1.0-android-arm-release-1.8.2.tar.bz2). Extract everything somewhere.
2. cd to `Player-5` and edit `jni/Android.mk` file and set `GSTREAMER_ROOT_ANDROID` to the path where your extracted Gstreamer library.
   and `jni/Application.mk` 's APP_PROJECT_PATH.
3. To the `Player-5` run ndk-build.
4. Move the `libs` and `src` to `Project` and open with eclipse
