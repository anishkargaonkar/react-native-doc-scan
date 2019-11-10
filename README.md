# react-native-doc-scan

## Getting started

`$ npm install react-native-doc-scan --save`

### Mostly automatic installation

`$ react-native link react-native-doc-scan`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-doc-scan` and add `DocScan.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libDocScan.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainApplication.java`
  - Add `import com.reactlibrary.DocScanPackage;` to the imports at the top of the file
  - Add `new DocScanPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-doc-scan'
  	project(':react-native-doc-scan').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-doc-scan/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-doc-scan')
  	```


## Usage
```javascript
import DocScan from 'react-native-doc-scan';

// TODO: What to do with the module?
DocScan;
```
