# Android-StartActivityForResultFromFragment
------------------------------------------------------------------------

You can start Another Activity from Fragment and do like from Activity

#####How to use:

- ``Activity`` contain Fragment must ``extends BaseActivityForResult``
- ``Fragment`` you want to startActivityforResult must ``extends BaseFragmentForResult``

- Please check my sample to understand more clearly

#####Gradle:

Step 1. Add it in your root build.gradle at the end of repositories:

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

Step 2. Add the dependency
```gradle
dependencies {
	  compile 'com.github.at-daolq:Android-StartActivityForResultFromFragment:V1.0'
}
```
