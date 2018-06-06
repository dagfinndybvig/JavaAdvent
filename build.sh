# Build & run the adv

ecj *.java
dx --dex --output=Adv.dex *.class

dalvikvm -cp Adv.dex Game

