$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Jyoti/Desktop/com.bddFramework/src/test/java/FeatureFile/homePage.feature");
formatter.feature({
  "name": "homePage",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful check the Cart of an inventory page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on inventory page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePage.user_is_on_inventory_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Sauce Labs Backpack Add to Cart",
  "keyword": "When "
});
formatter.match({
  "location": "HomePage.click_on_Sauce_Labs_Backpack_Add_to_Cart()"
});
formatter.result({
  "status": "passed"
});
});