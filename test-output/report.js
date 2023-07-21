$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Calender.feature");
formatter.feature({
  "name": "To automate calender",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Select your birth date from calender",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch browser \"https://jqueryui.com/resources/demos/datepicker/other-months.html\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.launch_browser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on inbox",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.click_on_inbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select your birth date",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.select_your_birth_date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Table.feature");
formatter.feature({
  "name": "To automate webtables",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "I want to count no. of user are enabled in webtable.",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch browser \"http://seleniumpractise.blogspot.com/2021/08/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.launch_browser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Count enabled users in webtable",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.count_enabled_users_in_webtable()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});