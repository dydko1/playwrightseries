mvn clean test -Dheadless=true nie ma przegldarki
mvn clean test -Dheadless=false jest przegldarka

to jest OK
mvn clean test -Dheadless=false -DrecordVideo=false

nie ma rownolglosci to potem nie problem