nie uzywac testng

mvn clean test -Dbrowser=firefox -Dheadless=false
mvn clean test	1 wątek, Firefox GUI
mvn clean test -Dthreads=2	2 scenariusze równolegle
mvn clean test -Dthreads=4 -Dheadless=true	4 scenariusze headless
mvn clean test -Dbrowser=chrome -Dthreads=3	Chrome, 3 scenariusze równolegle
