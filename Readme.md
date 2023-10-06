## StartScreenLib for games

## how to use

fork this repository then

clone (THE FORK) into the sourcecode folder using (IF YOUR PROJECT IS ALREADY HOSED ON GIT VCS USE THE SUBMODULE METHOD!!!)

```
git clone https://github.com/<username>/StartScreen.git
```

or clone as a submodule (ONLY IF YOUR PROJECT IS ALREADY HOSED ON GIT VCS!!!)

```
git submodule add https://github.com/<username>/StartScreen StartScreen
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
            res.srcDirs = ['../StartScreen/res']
            java.srcDirs = ['../StartScreen/java']
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
