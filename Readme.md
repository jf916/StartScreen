## StartScreenLib for games

## how to use

fork this repository then

clone (THE FORK) into the sourcecode folder using (IF YOUR PROJECT IS ALREADY HOSED ON GIT VCS USE THE SUBMODULE METHOD!!!)

```
git clone https://github.com/<your_user_name>/StartScreen.git
```

or clone (THE FORK) as a submodule (ONLY IF YOUR PROJECT IS ALREADY HOSED ON GIT VCS!!!)

```
git submodule add https://github.com/<your_user_name>/StartScreen StartScreen
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
._______166
                                                   __     ______   ______ 
                                                  /  \   / ____ \ / ____ \
                                                  \/) ) ( (    \/( (    \/
                                                    | | | (____  | (____  
                                                    | | |  ___ \ |  ___ \ 
                                                    | | | (   ) )| (   ) )
 _                                                __) (_( (___) )( (___) )
(_)_____  _____  _____  _____  _____  _____  _____\____/ \_____/  \_____/
  (_____)(_____)(_____)(_____)(_____)(_____)(_____)                       
