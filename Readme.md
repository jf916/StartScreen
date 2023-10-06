## StartScreenLib for games

## how to use

download into the root your game source code folder

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
add the following code to your strings.xml
```
    <string name="title">(Game Title)</string>
```
