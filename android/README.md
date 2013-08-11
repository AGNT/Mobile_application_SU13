Locate!
=======
(Android Game)
--------------

Instructions
------------
To compile this application,</br>

1. Open terminal and go to the directory of your choice (lets call this `<your directory>`)
```
cd <your directory>
```

2. Now type
```
git clone https://github.com/AGNT/Mobile_application_SU13.git
```

3. Now open Eclipse and set `<your directory>/Mobile_application_SU13/android` as your workspace.

4. You should now see 4 files in your project explorer.
<ul type="circle">
 <li>[Libraryfile] Google_play_services_lib</li>
 <li>[Libraryfile] GoogleCardLib and</li> 
 <li>[Libraryfile] SlidingUp</li>
 <li>Locate</li>
</ul>
</br>All source code written by us is in Locate subdirectory.

5. Connect your phone (with USB debugging turned on) and compile and run the app(see note for more info).


Note:
-----
1. This application needs google play services to work. Hence it will not work in the emulator.

2. If you wish to compile the android code, you will need your own Google Maps api key.
This can be obtained here
```
https://code.google.com/apis/console
```
Once you obtain your API key, modify the following lines in the <a href="https://github.com/umano/AndroidSlidingUpPanel?source=cc">Android Manifest File</a>.
```
<meta-data
            android:name="com.google.android.maps.v2.API_KEY"
            android:value="<YOUR KEY GOES HERE!!>" 
/>
```


Quick Links
------------
The following links will make it easier for you to find the source code (the important parts) for this Android Application.
<ul type="circle">
 <li>Locate Android Appliacation: <a href="https://github.com/AGNT/Mobile_application_SU13/tree/master/android/Locate/src/com/agnt/locate">JAVA files</a></li>
 <li>Locate Android Appliacation: <a href="https://github.com/AGNT/Mobile_application_SU13/blob/master/android/Locate/AndroidManifest.xml">AndroidManifest.xml</a></li>
  <li>Locate Android Appliacation: <a href="https://github.com/AGNT/Mobile_application_SU13/tree/master/android/Locate/res/layout">Layout XML files</a></li>
</ul>

Libraries Used:
---------------
The following libraries have been used to support this application</br>
<ul type="circle">
 <li><a href="https://github.com/umano/AndroidSlidingUpPanel?source=cc">AndroidSlidingUpPanel</a></li>
 <li><a href="http://developer.android.com/google/play-services/index.html">Google Play Services Libraries</a></li>
 <li><a href="https://github.com/nhaarman/ListViewAnimations">ListViewAnimations</a></li>
</ul>

Thank you for taking interest  in this application!!
----------------------------------------------------

