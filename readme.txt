mvn clean test -Dheadless=true nie ma przegladarki
mvn clean test -Dheadless=false jest przegladarka

to jest OK
mvn clean test -Dheadless=false -DrecordVideo=false

nie ma rownolglosci to potem nie problem

allure serve target/allure-results