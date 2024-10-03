**Sauce Labs Parallel Testing Repo**

Repository for executing tests in parallel on Sauce Labs' platform with **TestNG/Cucumber** and **WDIO/Cucumber**

### **TestNG/Cucumber**

1. `cd testng-cucumber`
2. `mvn clean install -Dregion=us -DtestngXmlFile=myDemoParallelTests.xml`

### **WDIO/Cucumber**

1. `cd wdio-cucumber`
2. `npm install`
3. `npx wdio`
