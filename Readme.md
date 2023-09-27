## StartScreenLib for games

## how to use

clone into game source code folder using
```
git clone https://github.com/jf916/StartScreen.git
```

then add the following lines into your build.gradle file
```
flavorDimensions += ["start"]

    productFlavors {
        withStart {
            dimension "start"
            isDefault true
        }

        withoutStart {
            dimension "start"
        }
    }

    sourceSets {
        withoutStart {
        }

        withStart {
            res.srcDirs = ['../StartScreenLib/res']
            java.srcDirs = ['../StartScreenLib/java']
        }
    }
```

then add the following lines to your manifest.xml
```
<activity
            android:name="com.j.StartScreenLib.MainActivity"
            android:exported="true"
            android:label="@string/title_short"
            android:theme="@style/Theme.StartScreen" >
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
```
