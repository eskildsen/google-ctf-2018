#!/bin/sh
#just change the damn values if needed s/app/app-morten/g
adb uninstall com.google.ctf.shallweplayagame | true && rm app-alligned.apk | true && java -jar apktool.jar b app/ && zipalign -v -p 4 app/dist/app.apk app-alligned.apk && echo -n 123456 | apksigner sign --ks my-release-key.jks --out app-release.apk app-alligned.apk && adb install app-release.apk
