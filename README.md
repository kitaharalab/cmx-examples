# cmx-examples

Getting started with [CrestMuse Toolkit (CMX)](https://github.com/kitaharalab/cmx)

## [CMX with JRE and Gradle](https://github.com/kitaharalab/cmx-examples/tree/jre-gradle)

### git clone

```
git clone -b jre-gradle https://github.com/kitaharalab/cmx-examples.git
```

### Required environment variables

| Variable | Value |
| :----- | :----- |
| GITHUB_ACTOR | Your GitHub username |
| GITHUB_TOKEN | Your GitHub PAT |
| JAVA_HOME | Your java home |

### Edit GitHub personal access token

Settings > Developer settings > Personal access tokens  
Select read:packages then update

### Run the program

```
gradlew run
```

### Edit gradlew.bat if necessary (Windows)

```
@REM set JAVA_EXE=%JAVA_HOME%/bin/java.exe
set JAVA_EXE=%JAVA_HOME%/java.exe
```

↓

```
set JAVA_EXE=%JAVA_HOME%/bin/java.exe
@REM set JAVA_EXE=%JAVA_HOME%/java.exe
```

