# react-native-beep-tone

## Getting started

`$ npm install react-native-beep-tone --save`

### Mostly automatic installation

`$ react-native link react-native-beep-tone`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-beep-tone` and add `RNBeepTone.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNBeepTone.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainApplication.java`
  - Add `import io.github.alexkorep.RNBeepTonePackage;` to the imports at the top of the file
  - Add `new RNBeepTonePackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-beep-tone'
  	project(':react-native-beep-tone').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-beep-tone/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-beep-tone')
  	```


## Usage
```javascript
import RNBeepTone from 'react-native-beep-tone';

// TODO: What to do with the module?
RNBeepTone;
```
