# Treasure Hunt Game Application

This is an application with compatible Android SDKs around 2016 and is currently not being maintained by the author. It is purely coded in Java in Android Studio 2.x and built with the gradle build tool.  

It is an application to conduct treasure hunt events with editable puzzles in each activity or screen. Where each puzzle is solved via scanning QR Code which uses Zbar library imports to translate the QR Code in the appropriate correct strings. These QR codes are scattered in this treasure hunt game and are needed to be looked for throughout the game. After solving the final puzzle, our application automatically calls the organizer storing the final solved puzzle state for verification i.e. the state of penultimate activity is kept intact. Also with shared preferences we are editing the puzzles dynamically and increasing the reusability of the application.
